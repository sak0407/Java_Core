import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    private E e[];
    private int size;

    public MyArrayList(){
        this(2);
    }
    public MyArrayList(int initSize){

        if(initSize<0){
          throw new IllegalArgumentException("Illegal size "
                  +initSize);
        }
        this.e= (E[]) new Object[initSize];
    }




    @Override
    public boolean isEmpty() {
        return Size()==0;
    }

    @Override
    public int Size() {
        return this.size;
    }

    private void ensureCapacity(int needCapacity){
        if(needCapacity>e.length){
            Object[] oldObj=this.e;
            int newSize=this.size * 2;
            System.out.println("NewSize"+newSize);
            this.e= (E[]) Arrays.copyOf(oldObj,newSize);
        }
    }

    private boolean rangeCheck(int index){
        if(index < 0 || index<= this.size){
            return false;
        }
        return true;
    }
    @Override
    public boolean add(E o) {
        ensureCapacity(this.size+1);
        e[this.size++]=o;
        return true;
    }

    @Override
    public boolean add(int index, E o) {
        rangeCheck(index);
        ensureCapacity(this.size+1);

        for(int i=this.size-1;i>=index;i--){
            e[i+1]=e[i];
        }
        e[index]=o;
        this.size++;
        return false;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        E ele=e[index];
        return ele;
    }

    @Override
    public int indexOf(E ele){
        if(ele==null){
            for(int i=0;i<this.size;i++){
                if(ele==null){
                    return i;
                }
            }

        }else{
            for(int i=0;i<this.size;i++){
               if(ele.equals(this.e[i])){
                    return i;
                }
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(E el) {
        if (el == null) {
            for (int i = this.size - 1; i >= 0; i--) {
                if (e[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = this.size - 1; i >= 0; i--) {
                if (el.equals(e[i])) {
                    return i;
                }
            }

        }
        return -1;
    }


    public E remove(int index) {
        rangeCheck(index);
        E removable=this.e[index];

        for(int i=index;i<this.size;i++){
            e[i]=e[i+1];
        }

        this.size--;

        return removable;
    }

    @Override
    public void clear() {
        for(int i=0;i<this.size;i++){
            e[i]=null;
        }

    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "e=" + Arrays.toString(e) +
                ", size=" + size +
                '}';
    }

    @Override
    public Iterator<E> iterator() {

        return new MyListIterator();
    }
    private class MyListIterator implements Iterator<E>{
        int currentIndex=0;
        @Override
        public boolean hasNext() {
            return currentIndex< Size();
        }

        @Override
        public E next() {
            return (E) e[currentIndex++];
        }

        //Return each second index


    }

    public static void main(String[] args) {
        MyArrayList<Integer> li=new MyArrayList();
        System.out.println(li.isEmpty());
        System.out.println("Initial Size "+li.size);
        li.add(0);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(6,6);

        for(Integer i: li){
            System.out.print(i +" ");
        }
        System.out.println("Total Size "+li.size);


        li.remove(5);
       li.remove(1);
        System.out.println("Total Size "+li.size);
        li.clear();
        System.out.println("Total Size "+li.size);
        System.out.println("Total Size "+li.toString());
    }
}
