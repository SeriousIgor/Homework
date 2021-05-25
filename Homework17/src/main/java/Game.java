import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    User user;
    Log log;
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
        log = new Log(user);
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

    public void startGame() throws IOException {
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
        writeResult();
        generateLog();
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
                System.out.println(result);
            }
            case 'l' -> {
                user.setLosesCount(user.getLosesCount() + 1);
                result = "Lose";
                System.out.println(result);

            }
            case 'd' -> {
                user.setDrawCount(user.getDrawCount() + 1);
                result = "Draw";
                System.out.println(result);
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
        log.addGameResult(result, uOption, cOption);
        System.out.println("Your option is " + uOption);
        System.out.println("Computer option is " + cOption + "\n");
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

    void writeResult() throws IOException{
        File resultPath = new File("Result");
        if (!resultPath.exists()) {
            resultPath.mkdir();
        }
        File resultFile = new File(resultPath + File.separator + "Result.txt");
        if (!resultFile.exists()) {
            try {
                resultFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileWriter fw = new FileWriter(resultPath + File.separator + "Result.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("User : " + user.getName() + "\n");
        bw.write("Games played : " + user.getGamesPlayed() + "\n");
        bw.write("Wins : " + user.getWinCount() + "\n");
        bw.write("Loses : " + user.getLosesCount() + "\n");
        bw.write("Draws : " + user.getDrawCount() + "\n");
        bw.write("_______________________________");
        bw.newLine();
        bw.close();
    }

    void generateLog() throws IOException {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
        Date date = new Date(System.currentTimeMillis());
        String logName = "log_" + user.getName() + "_" + df.format(date) + "_0" + ".txt";
        File logPath = new File("Log");
        String pathName = logPath + File.separator + logName;

        if (!logPath.exists()) {
            logPath.mkdir();
        }

        File resultFile = new File(pathName);
        try{
            int count = 1;
            while(resultFile.exists()){
                logName = "log_" + user.getName() + "_" + df.format(date) + "_" + count + ".txt";
                pathName = logPath + File.separator + logName;
                resultFile = new File(pathName);
                count++;
            }
            resultFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter fw = new FileWriter(pathName, false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(log.toString());
        bw.newLine();
        bw.close();
    }
}
