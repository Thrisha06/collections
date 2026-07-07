
import java.util.ArrayList;

public class frequncycount {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(10);
        int key=10;
        int count=0;
        for(int num:list){
            if(num==key){
                count++;
            }
        }
        System.out.println("frequency of "+key+" is: " +count);
    }
    
}
