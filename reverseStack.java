
import java.util.Scanner;
import java.util.Stack;

public class reverseStack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String :");
        String s=sc.nextLine();

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        String reversed="";
        while(!stack.isEmpty()){
            reversed+=stack.pop();
        }
        System.out.println("Reversed String: "+reversed);
    }
    
}
