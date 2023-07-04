public class MyQueue {

    private Stack<Integer> o_stack;
    private Stack<Integer> t_stack;
    public MyQueue() {
        o_stack = new Stack<>();
        t_stack = new Stack<>();
    }

    public void push(int x) { //스택 최하단으로 push

        while(!o_stack.isEmpty()){  //기존 스택데이터 임시스택으로
            t_stack.push(o_stack.pop());
        }
        o_stack.push(x); //마지막 데이터가 가장 마지막에 나가도록 하단으로 push

        while(!t_stack.isEmpty()){ //임시 스택에서 기존 스택 데이터 가져오기
            o_stack.push(t_stack.pop());
        }

    }
    public int pop() {
        return o_stack.pop();
    }

    public int peek() {
        return o_stack.peek();
    }
    public boolean empty() {
        return o_stack.isEmpty();
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */