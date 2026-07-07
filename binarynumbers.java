import java.util.LinkedList;
import java.util.Queue;

public class binarynumbers {
    public static void main(String[] args) {
        int n = 10;

        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 1; i <= n; i++) {
            String current = q.remove();

            System.out.print(current + " ");

            q.add(current + "0");
            q.add(current + "1");
        }
    }
}