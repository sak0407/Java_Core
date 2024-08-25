import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) {
        int[] A={1,2,1,3,3,1,4,5,5,5,2,2,2,3,4};

        Integer[] arr=Arrays.stream(A).boxed().toArray(Integer[]::new);

        //output 2 2 2 2 1 1 1 3 3 3 4 4 5

        Map<Integer,Long> freqMap= Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        /*Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }*/

        // Sort array by frequency (descending), then by value (ascending)
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                // Calculate the frequency of 'a' and 'b'
                Long frequencyA = freqMap.get(a);
                Long frequencyB = freqMap.get(b);

                // Compare by frequency (descending order)
                if (frequencyA != frequencyB) {
                    //return Long.compare(frequencyB, frequencyA); // High frequency first
                    return frequencyB.compareTo(frequencyA);
                }

                // If frequencies are the same, compare by value (ascending order)
                return Long.compare(a, b);
            }
        });

        // Print the sorted array
        System.out.println(Arrays.toString(arr));*/

        List<Integer> li=Arrays.stream(arr).sorted(Comparator.comparingLong((Integer i)-> freqMap.get(i)).reversed().thenComparingLong(i->  i)).collect(Collectors.toList());

        System.out.println(li);

    }


}
