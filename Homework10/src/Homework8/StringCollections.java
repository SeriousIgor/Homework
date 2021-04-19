package Homework8;

import java.util.*;
import java.util.Iterator;

public class StringCollections implements IStringCollections, Iterable<Object> {


    int count; //Подсчёт кол-ва символов
    private Object[] sCol;

    public StringCollections(){
            this.sCol = new String[10];
            count = 10;
    }

    public void generateNewArray(boolean option){
        int length = sCol.length;
        Object[] temp = sCol;
        if(option) {
            sCol = new String[length + 1];
            System.arraycopy(temp, 0, sCol, 0, length);
        }
        else{
            sCol = new String[length - 1];
            System.arraycopy(temp, 0, sCol, 0, length-1);
        }
    }

    private int getValueIndex(Object value){
        int index = -1;
        for(int i = 0; i < sCol.length; i++)
        if(value.equals(sCol[i])){
            index = i;
        }
        return index;
    }

    public void removeDuplicate() {
        Set<Object> stringSet = new HashSet<Object>(Arrays.asList(sCol));
        sCol = stringSet.toArray(new Object[0]);
        count = sCol.length;
    }

    @Override
    public boolean remove(Object value){
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
    public boolean add(int index, Object value){
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
    public boolean add(Object value){
        if(count == sCol.length) generateNewArray(true);
        sCol[sCol.length-1] = value;
        count++;
        if(count==sCol.length)      //Если элемент был записан успешно, то длина массива стала больше на 1
            return true;
        else
            return false;
    }

    @Override
    public Object get(int index){
        Object value = "Empty";
        if (count <= sCol.length){
            value = sCol[index];
        }
        return value;
    }

    @Override
    public boolean contains(Object o){
        for(Object el : sCol){
            try {
                if (el.equals(o)) {
                    return true;
                }
            }
            catch (NullPointerException ignored){}
        }
        return false;
    }

    @Override
    public boolean equals(StringCollections sc){
        if(sCol.length != sc.sCol.length)
            return false;
        boolean equal = true;
        for(int i = 0; i < sCol.length; i++){
            if(sCol[i] != sc.sCol[i])
            {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean clear(){
        boolean isNull = true;
        sCol = new String[10];
        count = 10;
        for(Object el : sCol){
            if (el == null){
                isNull = false;
                break;
            }
        }
        if((sCol.length == 10)&&isNull)
            return true;
        else
            return false;
    }

    @Override
    public int size(){
        return count;
    }

    public static void print(StringCollections sll){
        Iterator<Object> iter = sll.iterator();
        while(iter.hasNext()){
            Object element = iter.next();
            System.out.print(element + " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<Object> iterator() {
        return new StringCollectionsIterator();
    }
    class StringCollectionsIterator implements Iterator<Object> {

        int cursor;
        int size;

        public StringCollectionsIterator(){
            cursor = -1;
            size = count-1;
        }

        @Override
        public boolean hasNext() {
            if(cursor != size)
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            int i = cursor;
            if(i >= size){
                throw new NoSuchElementException();
            }
            cursor = i + 1;
            return sCol[cursor];
        }
    }
}