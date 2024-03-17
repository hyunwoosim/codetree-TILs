import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        double sum = 0;

        double[] arr = new double[n];


        for(int i = 0 ; i < n; i++){
            arr[i]= sc.nextDouble();
            sum += arr[i];
            cnt++;
        }
        double avg = (double) sum/cnt;

            if(avg <3){
                System.out.printf("%.1f\n",avg);
                System.out.println("Poor");
            }else if(avg <4){
                System.out.printf("%.1f\n",avg);
                System.out.println("Good");
            }else{
                System.out.printf("%.1f\n",avg);
                System.out.println("Perfect");
            }

    }
}