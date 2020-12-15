import java.util.Stack;

public class StackWithMin{
    //We can use another stack to track the mins
    Stack<Integer> mins;
    Stack<Integer> values;

    public StackWithMin(){
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
