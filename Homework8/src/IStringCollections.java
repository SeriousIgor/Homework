import java.util.Collection;

interface IStringCollections{

    boolean remove(Object o);

    boolean add(Object o);

    boolean add(int index, Object o);

    Object get(int index);

    boolean contains(Object o);

    boolean equals(StringCollections cs);

    boolean clear();

    int size();
}