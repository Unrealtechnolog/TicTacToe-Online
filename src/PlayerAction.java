public class PlayerAction {
    private int player;
    private int xpos;
    private int ypos;

    public PlayerAction(String input, int player) {
        this.xpos = Character.getNumericValue(input.charAt(0));
        this.ypos = Character.getNumericValue(input.charAt(2));
        this.player = player;
    }
}
