import java.util.*;
import java.util.stream.Collectors;

/*Given a digit string A,
return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.
The digit 0 maps to 0 itself. The digit 1 maps to 1 itself.

0->0
1->1
2->a,b,c
3->d,e,f
4->g,h,i
5->j,k,l
6->m,n,o
7->p,q,r,s
8->t,u,v
9->w,x,y,z

 A = "23"
  ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
  There are 9 possible letter combinations.
 A = "012"
 ["01a", "01b", "01c"]
 Only 3 possible letter combinations.

NOTE: Make sure the returned strings are lexicographically sorted.


* */
public class LetterPhone {

    public static List<String> result=new ArrayList<>();
    public static void main(String[] args) {

        Map<Integer, List<Character>> map=new HashMap<>();

        map.put(0, List.of('0'));
        map.put(1, List.of('1'));
        map.put(2, Arrays.asList('a','b','c'));
        map.put(3,Arrays.asList('d','e','f'));
        map.put(4,Arrays.asList('g','h','i'));
        map.put(5,Arrays.asList('j','k','l'));
        map.put(6,Arrays.asList('m','n','o'));
        map.put(7,Arrays.asList('p','q','r','s'));
        map.put(8,Arrays.asList('t','u','v'));
        map.put(9,Arrays.asList('w','x','y','z'));

        //map.entrySet().stream().forEach(System.out::println);


        String A="23";
        List<Character> ans=new ArrayList<>();
        generateLetterCombination(0,A.length(),A,ans,map);
        System.out.println(result);

    }

    private static void generateLetterCombination(int pos, int length, String A, List<Character> ans,Map<Integer,List<Character>> letter) {

        if(pos==length){
            //ans.stream().forEach(System.out::print);
            String str=ans.stream().map(String::valueOf).collect(Collectors.joining());
            result.add(str);
            return;
        }


        int d=A.charAt(pos)-'0';
        List<Character> val=letter.get(d);

        for(int i=0;i<val.size();i++){
            ans.add(val.get(i));
            generateLetterCombination(pos+1,length,A,ans,letter);
            ans.remove(ans.size()-1);
        }


    }


}
