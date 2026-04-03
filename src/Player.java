import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Player {

    private final Scanner scanner = new Scanner(System.in);
    private TicTacToeMap myTicTacToeMap;

    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;

    public static void main(String[] args) {
        Player player = new Player();
        player.startPlayer();
    }

    private void startPlayer(){
        System.out.println("Please enter server ip:");
        String ip = scanner.nextLine();
        System.out.println("Please enter port number:");
        String port = scanner.nextLine();

        try {
            tryConnectToServer(ip, Integer.parseInt(port));
            System.out.println("We are connected!");
        } catch (IOException exception){
            System.out.println("IO exception!");
        }

    }

    private void tryConnectToServer(String ip, int port) throws IOException {
        Socket socket = new Socket(ip, port);
        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }


    private class ServerEventListener extends Thread{
        // Listens to the Server for updates of the Map
        public ServerEventListener(InputStreamReader reader, TicTacToeMap myTicTacToeMap){

        }
    }

}
