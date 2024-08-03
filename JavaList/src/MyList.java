public interface MyList<E> extends Iterable<E> {
    boolean isEmpty();
    int Size();
    boolean add(E e);
    boolean add(int index,E e);
    E get(int index);
    E remove(int index);
    int indexOf(E e);
    int lastIndexOf(E e);
    void clear();

}
