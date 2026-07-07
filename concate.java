import java.util.Scanner;

public class concate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        int rev=0;
        int concat=0;
        while(n>0){
            int digit =n%10;
            if(digit !=0){
                sum += digit;
                rev =rev*10 + digit;
            }
            n /= 10;
        }
        while(rev>0){
            concat=concat*10+(rev%10);
            rev/=10;
        }
        System.out.println(concat*sum);
    }
    
}
