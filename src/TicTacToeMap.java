import java.util.Arrays;

public class TicTacToeMap {
    private int[][] ticTacToeMap; //Player positions 0:empty 1:player1 2: player 2

    public TicTacToeMap(){
        ticTacToeMap = new int[3][3];
    }

    public int[][] getMap() {
        return ticTacToeMap;
    }

    public boolean setMap(int[][] map){
        if(map.length == 3 && map[0].length == 3){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (map[i][j] < 0 || map[i][j] > 2) return false;
                }
            }
            ticTacToeMap = map;
            return true;
        }
        return false;
    }

    public boolean setTicTacToeMapPosition(int xpos, int ypos, int player) {
        if (ticTacToeMap[xpos][ypos] == 0 && (player == 1 || player == 2)) {
            ticTacToeMap[xpos][ypos] = player;
            return true;
        }
        return false;
    }

    public int findWinner(){
        for (int i = 0; i < 3; i++) {
            if (ticTacToeMap[i][0] == ticTacToeMap[i][1] && ticTacToeMap[i][1] == ticTacToeMap[i][2]){
                return ticTacToeMap[i][0];
            } else if (ticTacToeMap[0][i] == ticTacToeMap[1][i] && ticTacToeMap[1][i] == ticTacToeMap[2][i]) {
                return ticTacToeMap[0][i];
            }
        }
        if (ticTacToeMap[0][0] == ticTacToeMap[1][1] && ticTacToeMap[1][1] == ticTacToeMap[2][2]){
            return ticTacToeMap[1][1];
        } else if (ticTacToeMap[2][0] == ticTacToeMap[1][1] && ticTacToeMap[1][1] == ticTacToeMap[0][2]){
            return ticTacToeMap[1][1];
        }
        return 0;
    }

    @Override
    public String toString() {
        return "[" + ticTacToeMap[0][2] + ", " +  ticTacToeMap[1][2] + ", " + ticTacToeMap[2][2] + "]\n[" +
                ticTacToeMap[0][1] + ", " +  ticTacToeMap[1][1] + ", " + ticTacToeMap[2][1] + "]\n[" +
                ticTacToeMap[0][0] + ", " +  ticTacToeMap[1][0] + ", " + ticTacToeMap[2][0] + "]";
    }
}
