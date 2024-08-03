
/*Design a stack that supports push, pop, top,
 and retrieve the minimum element in constant time.

Stack -> pop push

5    - >2
4
3
2


*/

import java.util.Stack;






public class MinStack {

    Stack<Integer> st1;
    Stack<Integer> st2;

    public MinStack() {
        st1=new Stack<>();
        st2=new Stack<>();
    }

    public void push(int val) {

        st1.push(val);
        if(!st2.isEmpty()){

            int val1 = st2.peek();
            if(val1<=val){
                st2.push(val1);
            }else{
                st2.push(val);
            }
        }else{
            st2.push(val);
        }


    }

    public void pop() {
        if(!st1.isEmpty()){
            st2.pop();
            st1.pop();
        }
    }

    public int top() {
        return st1.peek();
    }

    public int getMin() {

        return st2.peek();

    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0 );
        obj.push(-3);
        int param_4 = obj.getMin();
        System.out.println(param_4);

    }


}
