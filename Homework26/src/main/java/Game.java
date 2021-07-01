import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Game {
    User user;
    Locale locale;
    ResourceBundle uim;

    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    private static final Logger loggerResult = LoggerFactory.getLogger("logger.gameResult");
    private static final Logger loggerError = LoggerFactory.getLogger("logger.error");
    private static final Logger loggerOut = LoggerFactory.getLogger("logger.stdout");

    private final char[][] winCombination = { {'d', 'w', 'l'},
                                        {'l', 'd', 'w'},
                                        {'w', 'l', 'd'}};
    int amount;

    public Game(){
        Locale.setDefault(Locale.ENGLISH);
        uim = ResourceBundle.getBundle("MessagesBundle.UserInterface");
    }

    public Game(String lang){
        locale = new Locale(lang);
        uim = ResourceBundle.getBundle("MessagesBundle.UserInterface", locale);
    }

    public void printTutorial(){
        loggerOut.info(uim.getString("welcome"));
        loggerOut.info(uim.getString("rules"));
        loggerOut.info(uim.getString("exit"));
        loggerOut.info(uim.getString("starting"));
    }

    public void getInfo(Scanner scanner) {
        loggerOut.info(uim.getString("name"));
        user = new User(scanner.next());
        loggerInfo.info(user.getName() + " started the game.");

        while (true) {
            try {
                loggerOut.info(uim.getString("amount"));
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
                //Вывести предупредупреждение, когда пользователь преждевременно окончил игру
                loggerWarn.warn(user.getName() + " finished game after " + user.getGamesPlayed() + " played games.");
                break;
            }
            else if(userOption < 3) {
                makeMove(userOption);
                user.setGamesPlayed(user.getGamesPlayed()+1);
            }
            else {
                loggerOut.info(uim.getString("number"));
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
                loggerOut.info(uim.getString("win"));
            }
            case 'l' -> {
                user.setLosesCount(user.getLosesCount() + 1);
                result = "Lose";
                loggerOut.info(uim.getString("lose"));

            }
            case 'd' -> {
                user.setDrawCount(user.getDrawCount() + 1);
                result = "Draw";
                loggerOut.info(uim.getString("draw"));
            }
        }
        switch (computerOption) {
            case 0 -> cOption = uim.getString("rock");
            case 1 -> cOption = uim.getString("scissors");
            case 2 -> cOption = uim.getString("paper");
        }
        switch (userOption) {
            case 0 -> uOption = uim.getString("rock");
            case 1 -> uOption = uim.getString("scissors");
            case 2 -> uOption = uim.getString("paper");
        }
        loggerInfo.info("Current game result: " + result + ". User option is " + uOption + ". Computer option is " + cOption);
        loggerOut.info(uim.getString("uOption") + uOption);
        loggerOut.info(uim.getString("cOption") + cOption + "\n");
    }

    int getUserOption(){
        int userOption;
        while (true) {
            try {
                loggerOut.info(uim.getString("option"));
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
        loggerOut.info(uim.getString("user") + ": " + user.getName());
        loggerOut.info(uim.getString("gamesPlayed") + ": " + user.getGamesPlayed());
        loggerOut.info(uim.getString("win") + ": " + user.getWinCount());
        loggerOut.info(uim.getString("lose") + ": " + user.getLosesCount());
        loggerOut.info(uim.getString("draw") + ": " + user.getDrawCount());
        loggerOut.info("\n");
    }

    void writeResult() {
        loggerResult.info("User : " + user.getName() + " | " + "Games played : " + user.getGamesPlayed() + " | " +
                "Wins : " + user.getWinCount() + " | " + "Loses : " + user.getLosesCount() + " | " +
                "Draws : " + user.getDrawCount());
    }
}
