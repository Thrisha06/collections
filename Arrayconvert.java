import java.util.ArrayList;

public class Arrayconvert {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> list =new ArrayList<>();
        for(int num:arr){
            list.add(num);
        }
        System.out.println(list);
    }
    
}
