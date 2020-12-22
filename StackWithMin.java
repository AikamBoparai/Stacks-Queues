import java.util.Stack;

public class StackWithMin{
    //We can use another stack to track the mins
    public static class StackWrapper{
        Stack<Integer> mins;
        Stack<Integer> values;

        public StackWrapper(){
            mins = new Stack<Integer>();
            values = new Stack<Integer>();
        }

        public void push(int value){
            if(value <= min()){
                mins.push(value);
            }
            values.push(value);
        }

        public int pop(){
            int value = values.pop();
            if(value == min()){
                mins.pop();
            }
            return value; 
        }

        public int min(){
            if(mins.empty()){
                return Integer.MAX_VALUE;
            }
            else{
                return mins.peek();
            }
        }

    }

    public static void main(String[] args) {
        StackWrapper values = new StackWrapper();
        values.push(Integer.MAX_VALUE);
        System.out.println(values.min());
        values.push(Integer.MIN_VALUE);
        System.out.println(values.min());
        values.pop();
        System.out.println(values.min());
        values.push(5);
        values.push(7);
        values.push(3);
        System.out.println(values.min());
        values.pop();
        values.pop();
        System.out.println(values.min());
        values.pop();
        System.out.println(values.min());
    }

}
