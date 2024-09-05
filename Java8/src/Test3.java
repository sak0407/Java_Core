import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test3 {
    public static void main(String[] args) {

        //Count each occurance of the String
        String s1="abcbdaetcieadfrst";
        Map<String, List<String>> part1=Arrays.stream(s1.split("")).collect(Collectors.groupingBy(s->s));
        System.out.println(part1);

        Map<String, Long> part2=Arrays.stream(s1.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(part2);
        //Find all duplicate element from given String

        List<String> s2=Arrays.stream(s1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(s->s.getValue()>1)
                .map(s->s.getKey()+"="+s.getValue()).collect(Collectors.toList());

        System.out.println(s2);

        //Find First non repeate value
        String part3=Arrays.stream(s1.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(s->s.getValue()==1).map(s->s.getKey()).findFirst().get();

        System.out.println(part3);

        //Find second Highest number
        int[] num={5,9,11,2,8,24,73};

        Integer ii=Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(ii);


         //Find the longest string in given array
        String[] str={"java","Springboot","amazon","walmart"};

        String longestString=Arrays.stream(str).reduce((word1,word2)-> word1.length()>word2.length()?word1:word2).get();
        System.out.println(longestString);

        //Find All elements from array who starts with one

        List<String> s22=Arrays.stream(num).boxed().map(s-> s+"").collect(Collectors.toList());
        System.out.println(s22);

        List<String> s23=Arrays.stream(num).boxed().map(s->s+"").filter(s->s.startsWith("2")).collect(Collectors.toList());
        System.out.println(s23);


        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::print);

        //Find Nth Highest Salary

        System.out.println("Find Nth Highest Salary");

        Map<String,Integer> map1=new HashMap<>();

        map1.put("A",100);map1.put("I",900);
        map1.put("B",200);map1.put("J",1000);
        map1.put("C",300);map1.put("K",900);
        map1.put("D",400);map1.put("N",1000);
        map1.put("E",500);map1.put("M",900);
        map1.put("F",600);
        map1.put("G",700);
        map1.put("H",800);

        //sort in reverse order by value and get second highest

        /*Map.Entry<String,Integer> secondHigh=map1.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(1);

        System.out.println(secondHigh);*/

        Map<Integer,List<String>> groupwithlist=

        map1.entrySet().stream()
                .collect(Collectors.groupingBy(v->v.getValue(),Collectors.mapping(v->v.getKey(),Collectors.toList())));

        System.out.println(groupwithlist);


               Map.Entry<Integer,List<String >> secondHigh2=
                groupwithlist.entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                        .collect(Collectors.toList()).get(1);

               System.out.println(secondHigh2);






    }
}
