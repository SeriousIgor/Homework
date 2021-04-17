public interface CustomCollection {
    boolean add(Object o);

    boolean addAll(Object[] strArr);

    boolean addAll(StringLinkedList sll);

    boolean delete (int index);

    boolean delete (Object o);

    Object get(int index);

    boolean contains(Object o);

    boolean clear();

    int getSize();

    boolean trim();

    boolean compare(StringLinkedList sll);
}
