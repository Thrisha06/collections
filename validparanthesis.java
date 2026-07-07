
import java.util.Stack;

public class validparanthesis {
    public static void main(String[] args){
        String s="[{()}]";
        Stack<Character> stack=new Stack<>();
        boolean isvalid=true;
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()){
                    isvalid=false;
                    break;
                }
                char top=stack.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    isvalid=false;
                    break;
                }
            }
            System.out.println("Is Valid: "+isvalid);
        }
        
    }
    
}
