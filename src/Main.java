import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Are you server(0) , or Player(1) ?");
        String in = new Scanner(System.in).nextLine();

        if (in.equals("0")){
            new TicTacToeServer();
        } else new Player();
    }
}