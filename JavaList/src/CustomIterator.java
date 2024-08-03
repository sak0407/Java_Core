import java.util.*;


public class CustomIterator implements Iterator<Integer> {
    List<Integer> list;
    int currentIndex;

    public CustomIterator(List<Integer> li){
        this.list=li;
        this.currentIndex=0;
    }


    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public Integer next() {
        if(hasNext()){
            Integer t=list.get(currentIndex);
            currentIndex=currentIndex+2;
            return  t;
        }else{
            throw new NoSuchElementException();
        }
    }



    public static void main(String[] args) {
    List<Integer> li= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    CustomIterator cl=new CustomIterator(li);
    while(cl.hasNext()){
        System.out.print(cl.next() +" ");
    }



    }


}
