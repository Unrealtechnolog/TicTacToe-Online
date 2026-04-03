public class TicTacToeMap {
    private int[][] ticTacToeMapPositions; //Player positions 0:empty 1:player1 2: player 2

    public TicTacToeMap(){
        ticTacToeMapPositions = new int[3][3];
        for (int i = 0; i < ticTacToeMapPositions.length; i++) {
            for (int j = 0; j < ticTacToeMapPositions[0].length; j++) {
                ticTacToeMapPositions[i][j] = 0;
            }
        }
    }

    public int[][] getTicTacToeMapPositions() {
        return ticTacToeMapPositions;
    }

    public void setTicTacToeMapPositions(int[][] ticTacToeMapPositions) {
        this.ticTacToeMapPositions = ticTacToeMapPositions;
    }
}
