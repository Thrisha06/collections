
import java.util.ArrayList;

public class removduplicate {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);

        ArrayList<Integer> unique=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(!unique.contains(list.get(i))){
                unique.add(list.get(i));
            }
        }
        System.out.println("after removing duplicates : " + unique);
    }
    
}
