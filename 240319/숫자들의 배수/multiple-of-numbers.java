import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int[] arr = new int[100];
           arr[1] = sc.nextInt();
           System.out.print(arr[1] + " ");

        for(int i = 2; i < 100; i++){
             
            arr[i] = arr[1] * i;
           
            if(arr[i]%5==0){
                    cnt++;
            }
                if(cnt == 2){
                    System.out.print(arr[i]+ " ");
                    break;
                }

            System.out.print(arr[i]+ " ");
              
        }
    }
}