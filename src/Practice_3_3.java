// 실습 3장 3번
import java.util.Scanner;
public class Practice_3_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("정수를 입력하시오>> ");
        num = sc.nextInt();

        for (int a = num; a > 0; a--) {
            for (int b = a; b > 0; b--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
