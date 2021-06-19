import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class GameRun {
    public static void main(String[] args) throws IOException {
        Game game = new Game();
        game.printTutorial();
        game.getInfo(new Scanner(System.in));
        game.startGame();

    }
}
