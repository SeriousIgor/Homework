import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class GameRun {
    public static void main(String[] args) throws IOException {
        Game game;
        if(args.length == 0) {
            game = new Game();
        }
        else {
            game = new Game(args[0]);
        }
        game.printTutorial();
        game.getInfo(new Scanner(System.in));
        game.startGame();

    }
}
