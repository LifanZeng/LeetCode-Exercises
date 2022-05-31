import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q = new LinkedList<>();
    int top_elem = 0;

    public MyStack() {
    }

    public void push(int x) { //添加元素到栈顶
        q.offer(x);           //x 是队列的队尾，栈的栈顶
        top_elem = x;
    }

    public int pop() {  //删除栈顶元素并返回
        int size = q.size();
        while(size > 2){
            q.offer(q.poll());
            size--;
        }
        top_elem = q.peek();
        q.offer(q.poll());
        return q.poll();
    }

    public int top() {
        return top_elem;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */