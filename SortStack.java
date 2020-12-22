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
    }
}