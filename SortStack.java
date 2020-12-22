import java.util.Stack;
class SortStack{
    public static void sort(Stack<Integer> s){
        Stack<Integer> buf = new Stack<Integer>();
        while(!s.isEmpty()){
            int tmp = s.pop();
            while(!buf.isEmpty() && buf.peek() > tmp){
                s.push(buf.pop());
            }
            buf.push(tmp);
        }
        while(!buf.isEmpty()){
            s.push(buf.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> values = new Stack<Integer>();
        values.push(8);
        values.push(8);
        values.push(4);
        values.push(Integer.MAX_VALUE);
        values.push(Integer.MIN_VALUE);
        values.push(99);
        values.push(1);
        values.push(7);
        System.out.println(values.toString());
        
        //Sort so smallest elements are on top
        sort(values);
        System.out.println(values.toString());
    }
}