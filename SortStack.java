class SortStack{
    public static void sort(Stack<Integer> s){
        Stack<Integer> buf = new Stack<Integer>();
        while(!s.isEmpty()){
            int tmp = s.pop();
            while(!r.isEmpty() && r.peek() > tmp){
                s.push(r.pop());
            }
            r.push(tmp);
        }
        while(!r.isEmpty()){
            s.push(r.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> values = new Stack<Integer>();
        values.push(8);
    }
}