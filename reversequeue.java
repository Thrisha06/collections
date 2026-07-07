import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversequeue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("original queue: "+ q);
        Stack<Integer> stack=new Stack<>();
        while(!q.isEmpty()){
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        System.out.println("reversed queue :" + q);
    }
    
}
