// 실습 3장 15번
import java.util.Scanner;
import java.util.InputMismatchException;
public class Multiply {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num [];
        num = new int [2];

        for(int i = 0; i < 2; i++){
            if(i == 0) {
                System.out.print("곱하고자 하는 두 수 입력>> ");
            }
            try {
                num[i] = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("실수는 입력하면 안됩니다.");
                sc.nextLine();
                i = -1;
                continue;
            }
        }
        System.out.print(num[0] + "x" + num[1] + "=" + num[0] * num[1]);

        sc.close();
    }
}
