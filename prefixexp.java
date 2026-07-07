
import java.util.Stack;

public class prefixexp {
    public static void main(String[] args) {
        String s="23+4*";
        Stack<Integer> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }else{
                int b=st.pop();
                int a=st.pop();

                switch (ch){
                    
                    case '+':
                        st.push(a+b);
                        break;
                    case '-':
                        st.push(a-b);
                        break;
                    case '*':
                        st.push(a*b);
                        break;
                    case '/':
                        st.push(a/b);
                        break;

                }
            }
        }
        System.out.println(st.pop());
    }
    
}
