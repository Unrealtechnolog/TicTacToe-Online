public class TicTacToeMap {
    private int[][] ticTacToeMapPositions; //Player positions 0:empty 1:player1 2: player 2

    public TicTacToeMap(){
        ticTacToeMapPositions = new int[3][3];
    }

    public int[][] getTicTacToeMapPositions() {
        return ticTacToeMapPositions;
    }

    public boolean setTicTacToeMapPositions(int xpos, int ypos, int player) {
        this.ticTacToeMapPositions = ticTacToeMapPositions;
        return false;
    }

    public int findWinner(){
        return 0;
    }
}
