import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class TicTacToeServer {
    private BlockingQueue<PlayerAction> playerActions;
    private LinkedList<PlayerListener> playerListeners = new LinkedList<>();

    private int currentPlayer;

    public TicTacToeServer(){
        startServer();
    }

    private void startServer() {
        System.out.println("Enter port number: ");
        String port = new Scanner(System.in).nextLine();

        try{
            ServerSocket serverSocket = new ServerSocket(Integer.parseInt(port));
            connectPlayer(serverSocket, 1);
            connectPlayer(serverSocket, 2);
            serverSocket.close();
        } catch (IOException exception){
            System.out.println("We had an error!");
        }


        System.out.println("Players Connected!");
        processRequests();
    }

    private void processRequests(){

    }

    private void connectPlayer(ServerSocket serverSocket, int role) throws IOException {
        Socket socket = serverSocket.accept();
        playerListeners.add(new PlayerListener(socket, role));
    }

    private void addPlayerAction(){

    }

    private class PlayerListener {
        private BufferedWriter bufferedWriter;
        private BufferedReader bufferedReader;
        private int role;

        public PlayerListener(Socket socket, int role) throws IOException{
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.role = role;
        }
    }
}
