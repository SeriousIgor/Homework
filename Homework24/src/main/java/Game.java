import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    User user;

    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    private static final Logger loggerResult = LoggerFactory.getLogger("logger.gameResult");
    private static final Logger loggerError = LoggerFactory.getLogger("logger.error");
    private static final Logger loggerOut = LoggerFactory.getLogger("logger.stdout");

    private final char[][] winCombination = { {'d', 'w', 'l'},
                                        {'l', 'd', 'w'},
                                        {'w', 'l', 'd'}};
    int amount;

    public void printTutorial(){
        loggerOut.info("Welcome to the game \"Rock, Scissors, Paper\"");
        loggerOut.info("Game rules: Rock: 0 | Scissors: 1 | Paper: 2 | ");
        loggerOut.info("Exit from the game : 3");
        loggerOut.info("For starting new game, first you need to enter your name and amount of games");
    }

    public void getInfo(Scanner scanner) {
        loggerOut.info("Enter your name: ");
        user = new User(scanner.next());
        loggerInfo.info(user.getName() + " started the game.");

        while (true) {
            try {
                loggerOut.info("Enter amount of games: ");
                amount = Integer.parseInt(scanner.next());
                break;
            }
            catch (NumberFormatException ignored){
                loggerError.error(user.getName() + " entered invalid amount.");
                continue;
            }
        }
    }

    public void startGame() {
        while (user.getGamesPlayed() < amount){
            loggerInfo.info(user.getName() + ": total games = " + amount + ". Games played: " + user.getGamesPlayed()
            + " | Games left: " + (amount-user.getGamesPlayed()));
            int userOption = getUserOption();
            if(userOption == 3){
                //?????????????? ??????????????????????????????????????, ?????????? ???????????????????????? ???????????????????????????? ?????????????? ????????
                loggerWarn.warn(user.getName() + " finished game after " + user.getGamesPlayed() + " played games.");
                break;
            }
            else if(userOption < 3) {
                makeMove(userOption);
                user.setGamesPlayed(user.getGamesPlayed()+1);
            }
            else {
                loggerOut.info("Wrong number");
                loggerError.error(user.getName() + " entered wrong number.");
            }
        }
        getStatistic();
        writeResult();
        loggerInfo.info(user.getName() + " has finished game.");
    }

    void makeMove(int userOption){
        int computerOption = new Random().nextInt(3);
        String result = "";
        String cOption = "";
        String uOption = "";
        char option = winCombination[userOption][computerOption];
        switch (option) {
            case 'w' -> {
                user.setWinCount(user.getWinCount() + 1);
                result = "Win";
                loggerOut.info(result);
            }
            case 'l' -> {
                user.setLosesCount(user.getLosesCount() + 1);
                result = "Lose";
                loggerOut.info(result);

            }
            case 'd' -> {
                user.setDrawCount(user.getDrawCount() + 1);
                result = "Draw";
                loggerOut.info(result);
            }
        }
        switch (computerOption) {
            case 0 -> cOption = "Rock";
            case 1 -> cOption = "Scissors";
            case 2 -> cOption = "Paper";
        }
        switch (userOption) {
            case 0 -> uOption = "Rock";
            case 1 -> uOption = "Scissors";
            case 2 -> uOption = "Paper";
        }
        loggerInfo.info("Current game result: " + result + ". User option is " + uOption + ". Computer option is " + cOption);
        loggerOut.info("Your option is " + uOption);
        loggerOut.info("Computer option is " + cOption + "\n");
    }

    int getUserOption(){
        int userOption;
        while (true) {
            try {
                loggerOut.info("Enter your option: ");
                userOption = new Scanner(System.in).nextInt();
                break;
            }
            catch (InputMismatchException ignored){
                loggerError.error(user.getName() + " entered invalid option.");
                continue;
            }
        }
        return userOption;
    }

    private void getStatistic(){
        loggerOut.info("\n");
        loggerOut.info("User : " + user.getName());
        loggerOut.info("Games played : " + user.getGamesPlayed());
        loggerOut.info("Wins : " + user.getWinCount());
        loggerOut.info("Loses : " + user.getLosesCount());
        loggerOut.info("Draws : " + user.getDrawCount());
        loggerOut.info("\n");
    }

    void writeResult() {
        loggerResult.info("User : " + user.getName() + " | " + "Games played : " + user.getGamesPlayed() + " | " +
                "Wins : " + user.getWinCount() + " | " + "Loses : " + user.getLosesCount() + " | " +
                "Draws : " + user.getDrawCount());
    }
}
