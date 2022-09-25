// 실습 3장 7번
import java.util.Scanner;
public class Practice_3_7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num [];
        num = new int [10];
        int sum = 0;

        System.out.print("랜덤한 정수들 : ");
        for(int i = 0; i < 10; i++) {
            num[i] = (int)(Math.random() * 10 + 1);
            System.out.print(num[i] + " ");
            sum += num[i];
        }

        double avg = sum / 10.0;
        System.out.print("평균은 " + avg);

        sc.close();
    }
}
