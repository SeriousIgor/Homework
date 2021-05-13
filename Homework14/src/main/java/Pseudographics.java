public class Pseudographics {
    char[][] sequence = null;

    public void getSymbols(String str){
        String[] numbers = str.split("");
        for(String s : numbers){
            switch (s) {
                case "1" -> {
                    if (sequence == null){
                        sequence = Symbol.ONE.getNumber();
                    }
                    else{
                        sequence = copyToArray(Symbol.ONE.getNumber());
                    }
                }
                case "2" -> {
                    if (sequence == null){
                        sequence = Symbol.TWO.getNumber();
                    }
                    else{
                        sequence = copyToArray(Symbol.TWO.getNumber());
                    }
                }
                case "3" -> {
                    if (sequence == null){
                        sequence = Symbol.THREE.getNumber();
                    }
                    else{
                        sequence = copyToArray(Symbol.THREE.getNumber());
                    }
                }
                case "4" -> {
                    if (sequence == null){
                        sequence = Symbol.FOUR.getNumber();
                    }
                    else{
                        sequence = copyToArray(Symbol.FOUR.getNumber());
                    }
                }
                case "5" -> {
                    if (sequence == null){
                        sequence = Symbol.FIVE.getNumber();
                    }
                    else{
                        sequence = copyToArray(Symbol.FIVE.getNumber());
                    }
                }
                case "6" -> {
                    if (sequence == null){
                        sequence = Symbol.SIX.getNumber();
                    }
                    else{
                        sequence = copyToArray(Symbol.SIX.getNumber());
                    }
                }
                case "7" -> {
                    if (sequence == null){
                        sequence = Symbol.SEVEN.getNumber();
                    }
                    else{
                        sequence = copyToArray(Symbol.SEVEN.getNumber());
                    }
                }
                case "8" -> {
                    if (sequence == null){
                        sequence = Symbol.EIGHT.getNumber();
                    }
                    else{
                        sequence = copyToArray(Symbol.EIGHT.getNumber());
                    }
                }
                case "9" -> {
                    if (sequence == null){
                        sequence = Symbol.NINE.getNumber();
                    }
                    else{
                        sequence = copyToArray(Symbol.NINE.getNumber());
                    }
                }
                case "0" -> {
                    if (sequence == null){
                        sequence = Symbol.ZERO.getNumber();
                    }
                    else{
                        sequence = copyToArray(Symbol.ZERO.getNumber());
                    }
                }
            }
        }
    }

    public void printSymbols() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < sequence[0].length; j++) {
                if(j % 6 == 0) System.out.print(" ");
                System.out.print(sequence[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public char[][] copyToArray(char[][] charArray){
        return joinSecondDimension(sequence, charArray);
    }

    public char[][] joinSecondDimension(char[][] array1, char[][] array2) {
        char[][] array1and2 = new char[array1.length][];
        for (int index = 0; index < array1.length; index++) {
            array1and2[index] = join(array1[index], array2[index]);
        }
        return array1and2;
    }

    public char[] join(char[] array1, char[] array2) {
        char[] array1and2 = new char[array1.length + array2.length];
        System.arraycopy(array1, 0, array1and2, 0, array1.length);
        System.arraycopy(array2, 0, array1and2, array1.length, array2.length);
        return array1and2;
    }
}
