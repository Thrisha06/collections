
import java.util.Stack;

public class stock {
    public static void main(String[] args){
        int[] price={100,80,60,70,60,75,85};
        int n=price.length;
        int[] num=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && price[stack.peek()]<=price[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                num[i]=i+1;
            }else{
                num[i]=i-stack.peek();
             
            }
            stack.push(i);
        }
        for(int s:num){
            System.out.print(s+" ");
        }
    }
    
    
}
