
import java.util.ArrayList;

public class checkArray {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        int key=20;
        if(list.contains(key)){
            System.out.println("Element found in the list");
        }else{
            System.out.println("Element not found in the list");
        }
    }
    
}
