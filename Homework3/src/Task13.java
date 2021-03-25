public class Task13 {
    public static void main(String[] args) {
        char[][] chessTable = new char[8][8];
        boolean bw = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (bw) {
                    chessTable[i][j] = 'B';
                } else {
                    chessTable[i][j] = 'W';
                }
                bw = !bw;
            }
            bw = !bw;
        }
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print("|" + chessTable[i][j] + "|");
            System.out.println();
        }
    }
}
