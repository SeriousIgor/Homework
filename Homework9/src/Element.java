public class Element {
    Object value;
    Element next;
    Element previous;

    public Element(){

    }

    public Element(Object value){
        this.value = value;
    }

    public Element(Object value, Element next){
        this.value = value;
        this.next = next;
    }

    public Element(Object value, Element next, Element previous){
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Element getPrevious() {
        return previous;
    }

    public void setPrevious(Element previous) {
        this.previous = previous;
    }
}
