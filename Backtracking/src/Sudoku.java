import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sudoku {
    public static void main(String[] args) {
        ArrayList<ArrayList<Character>> inputList = Stream.of(
                new ArrayList<>(Arrays.asList('5','3','.','.','7','.','.','.','.')),
                new ArrayList<>(Arrays.asList('6','.','.','1','9','5','.','.','.')),
                new ArrayList<>(Arrays.asList('.','9','8','.','.','.','.','6','.')),
                new ArrayList<>(Arrays.asList('8','.','.','.','6','.','.','.','3')),
                new ArrayList<>(Arrays.asList('4','.','.','8','.','3','.','.','1')),
                new ArrayList<>(Arrays.asList('7','.','.','.','2','.','.','.','6')),
                new ArrayList<>(Arrays.asList('.','6','.','.','.','.','2','8','.')),
                new ArrayList<>(Arrays.asList('.','.','.','4','1','9','.','.','5')),
                new ArrayList<>(Arrays.asList('.','.','.','.','8','.','.','7','9')))
                .collect(Collectors.toCollection(ArrayList::new));



        inputList.stream().forEach(list-> {
            list.stream().forEach(System.out::print);
            System.out.println();
        });






    }
}
