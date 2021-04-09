public class StringCollections implements IStringCollections {

    private int count; //Подсчёт кол-ва символов
    private String[] sCol;

    public StringCollections(){
            this.sCol = new String[10];
    }

    public void generateNewArray(boolean option){
        int length = sCol.length;
        String[] temp = sCol;
        if(option) {
            sCol = new String[length + 1];
            System.arraycopy(temp, 0, sCol, 0, length);
        }
        else{
            sCol = new String[length - 1];
            System.arraycopy(temp, 0, sCol, 0, length-1);
        }
    }

    int getNullCellNumber(){                                          //На случай, если в список нельзя записывать null
        int value = 0;
        for(int i = 0; i < sCol.length; i++){
            if (sCol[i] == null){
                value = i;
                break;
            }
        }
        return value;
    }

    int getValueIndex(String value){
        int index = -1;
        for(int i = 0; i < sCol.length; i++)
        if(value.equals(sCol[i])){
            index = i;
        }
        return index;
    }


    @Override
    public boolean remove(int index){
        if(index < sCol.length)
        {
            for (int i = index; i < sCol.length - 1; i++) {
                sCol[i] = sCol[i + 1];
            }
            if (count == sCol.length) generateNewArray(false);
            count--;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean remove(String value){
        int index = getValueIndex(value);
        if(index != -1)
        {
            for (int i = index; i < sCol.length - 1; i++) {
                sCol[i] = sCol[i + 1];
            }
            if (count == sCol.length) generateNewArray(false);
            count--;
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean add(int index, String value){
        if(index <= sCol.length) {
            if (count == sCol.length) generateNewArray(true);
            for (int i = sCol.length - 1; i > index; i--) {
                sCol[i] = sCol[i - 1];
            }
            sCol[index] = value;
            count++;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean add(String value){
        if(count == sCol.length) generateNewArray(true);
        sCol[sCol.length-1] = value;
        count++;
        if(count==sCol.length)      //Если элемент был записан успешно, то длина массива стала больше на 1
            return true;
        else
            return false;
    }

    @Override
    public String get(int index){
        String value = "Empty";
        if (count < sCol.length){
            value = sCol[index];
        }
        return value;
    }

    public void print(){
        for (String el : sCol){
            System.out.print(el + " ");
        }
    }
}
