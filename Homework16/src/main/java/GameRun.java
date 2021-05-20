import java.util.Scanner;

public class GameRun {
    public static void main(String[] args) {
        Game game = new Game();
        game.printTutorial();
        game.getInfo(new Scanner(System.in));
        game.startGame();

    }
}
