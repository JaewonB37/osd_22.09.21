// 실습 3장 9번
import java.util.Scanner;
public class Practice_3_9 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num [][];
        num = new int [4][4];

        for(int a = 0; a < 4; a++) {
            for(int b = 0; b < 4; b++) {
                num[a][b] = (int) (Math.random() * 10 + 1);
                System.out.print(num[a][b] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
