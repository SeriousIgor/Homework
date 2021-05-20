import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    User user;
    private final char[][] winCombination = { {'d', 'w', 'l'},
                                        {'l', 'd', 'w'},
                                        {'w', 'l', 'd'}};
    int amount;
    public void printTutorial(){
        System.out.println("Welcome to the game \"Rock, Scissors, Paper\"");
        System.out.println("Game rules:");
        System.out.print("Rock: 0 | ");
        System.out.print("Scissors: 1 | ");
        System.out.print("Paper: 2 | ");
        System.out.println("Exit from the game : 3");
        System.out.println("For starting new game, first you need to enter your name and amount of games");
    }
    public void getInfo(Scanner scanner){
        System.out.println("Enter your name: ");
        user = new User(scanner.next());
        while (true) {
            try {
                System.out.println("Enter amount of games: ");
                amount = Integer.parseInt(scanner.next());
                break;
            }
            catch (NumberFormatException ignored){
                continue;
            }
        }
    }
    public void startGame(){
        while (user.getGamesPlayed() < amount){
            int userOption = getUserOption();
            if(userOption == 3){
                break;
            }
            else if(userOption < 3) {
                makeMove(userOption);
                user.setGamesPlayed(user.getGamesPlayed()+1);
            }
            else {
                System.out.println("Wrong number");
            }
        }
        getStatistic();
    }
    void makeMove(int userOption){
        int computerOption = new Random().nextInt(3);
        char option = winCombination[userOption][computerOption];
        switch (option) {
            case 'w' -> {
                user.setWinCount(user.getWinCount() + 1);
                System.out.println("You win");
            }
            case 'l' -> {
                user.setLosesCount(user.getLosesCount() + 1);
                System.out.println("You lose");
            }
            case 'd' -> {
                user.setDrawCount(user.getDrawCount() + 1);
                System.out.println("Game draw");
            }
        }
        switch (computerOption) {
            case 0 -> System.out.println("Computer option is Rock");
            case 1 -> System.out.println("Computer option is Scissors");
            case 2 -> System.out.println("Computer option is Paper");
        }
        System.out.println();
    }
    int getUserOption(){
        int userOption;
        while (true) {
            try {
                System.out.println("Enter your option: ");
                userOption = new Scanner(System.in).nextInt();
                break;
            }
            catch (InputMismatchException ignored){
                continue;
            }
        }
        return userOption;
    }
    void getStatistic(){
        System.out.println();
        System.out.println("User : " + user.getName());
        System.out.println("Games played : " + user.getGamesPlayed());
        System.out.println("Wins : " + user.getWinCount());
        System.out.println("Loses : " + user.getLosesCount());
        System.out.println("Draws : " + user.getDrawCount());
    }
}
