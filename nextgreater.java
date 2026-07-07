
import java.util.Stack;

public class nextgreater {
    public static void main(String[] args){
        int[] arr={4,5,2,10};
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=ans.length-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()<=arr[i]){
                s.pop();
            }
            ans[i]=s.isEmpty()?-1:s.peek();
            s.push(arr[i]);

        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
