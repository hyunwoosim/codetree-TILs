import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       
        double avg = 0;
        int pass = 0;

        for( int i = 0 ; i < n; i ++){
            int[] arr = new int[4];
 int sum = 0;
            for(int q = 0; q < 4; q++){
                arr[q] = sc.nextInt();
                sum += arr[q];
            }
     

            avg = (double)sum/4;

            if(avg>=60){
                System.out.println("pass");
                pass++;
            }else{
            System.out.println("fail");
            }
        }
        System.out.println(pass);

    }
}