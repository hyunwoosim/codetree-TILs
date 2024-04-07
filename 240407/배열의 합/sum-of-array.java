import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for(int i = 0; i < 4; i++){
           int val =0;
            for(int q = 0; q<4; q++){
                arr[i][q] = sc.nextInt(0);
                int sum += arr[q];
            }
            System.out.println(sum);
        }   
    }
}