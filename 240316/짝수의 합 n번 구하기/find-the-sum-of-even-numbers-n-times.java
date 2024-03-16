import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
     int sum = 0; 

        for(int i = 0; i < n; i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
          
     
            for(int q = a; q <= b; q++){
                if(q%2 ==0){
                    sum += q;
                }
          
            }
             System.out.println(sum);
           sum = 0;
        }
    }
}