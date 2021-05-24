import java.util.ArrayList;
import java.util.List;

public class Log {

    User user;
    String gameInfo = "";
    List<String> games = new ArrayList<String>();


    public Log(){

    }
    public Log(User user){
        this.user = user;
    }

    public void addGameResult(String gameResult){
        games.add(gameResult);
    }

    public void generateInfo(){
        int counter = 0;
        for(String s : games){
            gameInfo += " Game #" + counter + ": " + s + ". ";
        }
    }

    @Override
    public String toString() {
        return "Log{ user = " + user.getName() + " | Games played=" + user.getGamesPlayed() + " : " + gameInfo +'}';
    }
}
