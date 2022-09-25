// 실습 3장 11번
import java.util.Scanner;
public class Average {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;

        for(int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
        }

        double avg = sum / (double)args.length;
        System.out.print(avg);

        sc.close();
    }
}
