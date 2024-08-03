import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// iterate over the movie which is having rating more than 8
class Movie{
    private String name;
    private int rating;

    public Movie(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}


public class CustomMovieIterator implements Iterator<Movie>{

    private int currentIndex;
    private List<Movie> list;
    public CustomMovieIterator(List<Movie> list){
        this.list=list;
        this.currentIndex=0;
    }
    private boolean isMovieEligible(Movie m){
        return m.getRating()>8;
    }

    @Override
    public boolean hasNext() {
        while(currentIndex<list.size()){
            Movie m=list.get(currentIndex);
            if(isMovieEligible(m)){
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Movie next() {
        if(hasNext()){
            return list.get(currentIndex++);
        }else{
            throw new NoSuchElementException();
        }
    }


    public static void main(String[] args) {

        List<Movie> movies = List.of(
                new Movie("Movie A", 9),
                new Movie("Movie B", 7),
                new Movie("Movie C", 8),
                new Movie("Movie D", 10),
        new Movie("Movie E", 6),
        new Movie("Movie F", 10),
        new Movie("Movie G", 10)
        );


        CustomMovieIterator ci=new CustomMovieIterator(movies);
        while(ci.hasNext()){
            Movie m=ci.next();
            System.out.println(m);
        }

    }

}
