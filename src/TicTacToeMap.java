public class TicTacToeMap {
    private int[][] ticTacToeMapPositions; //Player positions 0:empty 1:player1 2: player 2

    public TicTacToeMap(){
        ticTacToeMapPositions = new int[3][3];
    }

    public int[][] getTicTacToeMapPositions() {
        return ticTacToeMapPositions;
    }

    public void setTicTacToeMapPositions(int[][] ticTacToeMapPositions) {
        this.ticTacToeMapPositions = ticTacToeMapPositions;
    }
}
