
class stack{
    int[] arr=new int[5];
    int top=-1;
    void push(int x){
        if(top==arr.length-1){
            System.out.println("stack overflow");
        }else{
            arr[++top]=x;
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + arr[top--]);
        }
    }


    void peek(){
        if(top==-1){
            System.out.println("stack is empty");
        }else{
            System.out.println("top element is "+arr[top]);
        }
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    
}


public class Implementstack {
    public static void main(String[] args){
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.peek();
        s.pop();
        s.display();
    }
    
}
