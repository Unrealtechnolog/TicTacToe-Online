import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class TicTacToeServer {
    private BlockingQueue<PlayerAction> playerActions;
    private LinkedList<PlayerListener> playerListeners = new LinkedList<>();

    public static void main(String[] args) throws IOException{
        new TicTacToeServer().startServer();
    }

    private void startServer() throws IOException{
        System.out.println("Enter port number: ");
        String port = new Scanner(System.in).nextLine();

        ServerSocket serverSocket = new ServerSocket(Integer.parseInt(port));
        connectPlayer(serverSocket, 1);
        connectPlayer(serverSocket, 2);
        serverSocket.close();

        System.out.println("Players Connected!");
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

        public PlayerListener(Socket socket, int role){
        }
    }
}
