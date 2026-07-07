
import java.util.Stack;

 class Minstock {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public void push(int val){
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
    }
    public void pop(){
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
    public static void main(String[] args) {
        Minstock ms=new Minstock();
        ms.push(5);
        ms.push(2);
        ms.push(8);
        ms.push(1);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
       
    }
    
}
