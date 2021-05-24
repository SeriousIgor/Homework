public class User {
    private String name;
    private int losesCount;
    private int winCount;
    private int drawCount;
    private int gamesPlayed;

    public User(){}

    public User(String name){
        this.name = name;
        losesCount = 0;
        winCount = 0;
        drawCount = 0;
        gamesPlayed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLosesCount() {
        return losesCount;
    }

    public void setLosesCount(int losesCount) {
        this.losesCount = losesCount;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getDrawCount() {
        return drawCount;
    }

    public void setDrawCount(int drawCount) {
        this.drawCount = drawCount;
    }
}
