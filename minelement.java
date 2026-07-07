import java.util.ArrayList;

public class minelement {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(30);

        int min=list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        System.out.println("Minimum element in the arraylist: " + min);
    }
    
}
