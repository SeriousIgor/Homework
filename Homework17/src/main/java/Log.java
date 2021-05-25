import java.util.ArrayList;
import java.util.List;

public class Log {

    User user;
    String gameInfo = "";


    public Log(){

    }
    public Log(User user){
        this.user = user;
    }

    public void addGameResult(String gameResult, int userMove, int compMove){
        gameInfo += "Game result: " + gameResult + " | Player move: " + userMove + " Computer move: " + compMove + ".\n";
    }

    @Override
    public String toString() {
        return "Log{ user = " + user.getName() + " | Games played = " + user.getGamesPlayed() + ":\n" + gameInfo +'}';
    }
}
