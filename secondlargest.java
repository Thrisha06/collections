import java.util.ArrayList;


public class secondlargest {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        list.add(30);


        int larget=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:list){
            if(num>larget){
                secondLargest=larget;
                larget=num;
            }else if(num>secondLargest && num!=larget){
                secondLargest=num;
            }


        }
        System.out.println("Largest number is : " + larget);
        System.out.println("second largest number is : " + secondLargest);
    }
    
}
