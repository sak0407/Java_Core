import java.util.*;
import java.util.stream.Collectors;

/*Given a string A consisting of lowercase English alphabets and parentheses '(' and ')'.
 Remove the minimum number of invalid parentheses in order to make the input string valid.

Return all possible results.

You can return the results in any order.

 A = "(a)())()"
 ["(a)()()", "(a())()"]
        By removing 1 parentheses we can make the string valid.
        1. Remove the parentheses at index 5 then string becomes : "(a)()()"
        2. Remove the parentheses at index 2 then string becomes : "(a())()"
A = "()())()"
["()()()", "(())()"]
        By removing 1 parentheses we can make the string valid.
        1. Remove the parentheses at index 4 then string becomes : "()()()"
        2. Remove the parentheses at index 2 then string becomes : "(())()"

* */
public class RemoveInvalidParentheses {
     public static Set<String> set=new HashSet();
     public static int Min=Integer.MAX_VALUE;

    public static boolean validParenthesis(List<Character> ch ){



        Stack<Character> st=new Stack<>();
        boolean valid=false;

        for(int j=0;j<ch.size();j++){

            if(ch.get(j)=='('){
                st.push(ch.get(j));
                continue;
            }

            if(ch.get(j)==')'){
                if(st.isEmpty()){
                    return valid;
                }else {
                    st.pop();
                }

            }

        }

      if(st.isEmpty()){
          valid=true;
      }

      return valid;

    }

    public static void generateAllsubset(int pos, int length, char[] ch, List<Character> temp){



        if(validParenthesis(new ArrayList<>(temp)) ){

              if(length - temp.size()<=Min){
                  String str= temp.stream().map(String::valueOf).collect(Collectors.joining());
                  if(set.isEmpty()){
                      set.add(str);
                  }else{
                     // String old=set.stream().max(Comparator.comparingInt(String::length)).get();
                      String old=set.iterator().next();
                      if(old.length()<str.length()){
                          set.remove(old);
                          set.add(str);
                      }else if(old.length()==str.length()){
                          set.add(str);
                      }

                  }

                 // System.out.println(str);
              }
        }


        for(int j=pos;j<length;j++){
            temp.add(ch[j]);
            generateAllsubset(j+1,length,ch,temp);
            temp.remove(temp.size()-1);
        }

    }
    public static void main(String[] args) {

       String A="(a)())()";

       // String A="())((b)";

        //Char arry to list
        List<Character> ch=A.chars()  // Get IntStream of char values
                .mapToObj(c->(char)c) // Convert int to Character
                .collect(Collectors.toList());



        //System.out.println(validParenthesis(ch));


        generateAllsubset(0,A.length(),A.toCharArray(),new ArrayList<Character>());
        set.stream().forEach(System.out::println);

        //System.out.println(set.size());


    }
}




/*
* static ArrayList<String> ans;

static ArrayList<String> solve(String A) {
    int n = A.length();
    ans = new ArrayList<>();
    if (n == 1) {
        if (isParentheses(A.charAt(0)))  ans.add("");
        else ans.add(A);
        return ans;
    }

    findValidStrings(A);
    if(ans.isEmpty()) ans.add("");
    return ans;

}

static void findValidStrings(String A) {
    if (A.isEmpty()) return;

    Queue<String> q = new LinkedList<>();
    q.add(A);
    Set<String> visited = new HashSet<>();
    visited.add(A);

    boolean found= false;
    while (!q.isEmpty()) {
        String str = q.poll();
        if (isValidString(str)) {
            ans.add(str);
            found = true;
        }
        if(found) continue;

        for (int i = 0; i < str.length(); i++) {
            if (isParentheses(str.charAt(i))) {
                String tmp = str.substring(0, i) + str.substring(i + 1);
                if (!visited.contains(tmp)) {
                    q.add(tmp);
                    visited.add(tmp);
                }
            }
        }
    }
}

static boolean isParentheses(char c) {
    return (c == '(' || c == ')');
}

static boolean isValidString(String s) {
    if (s.isEmpty()) return false;
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            stack.add('(');
        } else if (s.charAt(i) == ')') {
            if (stack.isEmpty() || stack.peek() != '(') return false;
            stack.pop();
        }
    }
    return stack.isEmpty();
}
* */