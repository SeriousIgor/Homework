public class StringLinkedList implements CustomCollection{
    private int size;     //Header element

    Element head;

    public StringLinkedList() {

        size = 0;
    }

    @Override
    public boolean add(Object o) {
        Element element = new Element(o);
        if (head == null){
            head = element;
        }
        else{
            Element el = head;
            while (el.next != null){
                el = el.next;
            }
            el.next = element;
        }
        size++;
        if (head != null)
            return true;
        else
            return false;
    }

    @Override
    public boolean addAll(Object[] objArr) {
        if (objArr != null) {
            for(int i = 0; i < objArr.length; i++){
                add(objArr[i]);
            }
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean addAll(StringLinkedList sll) {
        if(sll != null) {
            Element el = sll.head;
            for(int i = 0; i < sll.getSize(); i++){
                add(el.value);
                el = el.next;
            }
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean delete(int index) {
        if((head != null) && (index <= size)){
            if (index == 0){
                head = head.next;

            }
            else{
                Element el = head;
                for(int i = 0; i < index - 1; i++){
                    el = el.next;
                }
                el.next = el.next.next;
            }
            size--;
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean delete(Object o) {
        if((head != null)&&(contains(o))){
            Element el = head;
            for(int i = 0; i < size; i++) {
                if(el.value == o) break;
                el = el.next;
            }
            el.next = el.next.next;
            size--;
            return true;
        }
        else
            return false;
    }

    @Override
    public Object get(int index) {
        if(head != null){
            Element el = head;
            for(int i = 0; i < index; i++)
                el = el.next;
            return el.value;
        }
        else
            return null;
    }

    @Override
    public boolean contains(Object o) {
        if(head != null){
            Element el = head;
            while(el.next != null){
                if(el.value == o){
                    return true;
                }
                el = el.next;
            }
        }

        return false;
    }

    @Override
    public boolean clear() {
        if(head != null) {
            head = null;
            size = 0;
            return true;
        }
        else
            return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean trim() {
        if(head != null){
            Element el = head;
            for(int i = 0; i < size-1; i++){
                el = el.next;
                if(el == null)
                    return false;
            }
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean compare(StringLinkedList sll) {
        if(size == sll.getSize()) {
            Element el1 = head;
            Element el2 = sll.head;
            while(el1.next != null){
                if(el1.value == el2.value){
                    el1 = el1.next;
                    el2 = el2.next;
                }
                else
                    return false;
            }
            return true;
        }
        else
            return false;
    }

    public void print(){
        Element el = head;
        if(el == null){
            System.out.println("List is empty");
        }
        else {
            try {
                for (int i = 0; i < size; i++) {
                    System.out.println(el.value);
                    el = el.next;
                }
            }
            catch (NullPointerException ignored){}
        }
    }

}
