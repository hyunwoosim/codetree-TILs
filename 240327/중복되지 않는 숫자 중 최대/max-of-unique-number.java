import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = -1;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i <n; i++){
            if(arr[i]> max && arr[i] !=max){
                max = arr[i];
                
            }
          
        }
        for(int i = 0 ; i < n; i ++){
            if(max != arr[i]){
                cnt++;
            }else{
                cnt--;
            }
        }

        if(cnt > -1){
        System.out.print(max);
        }else{
            System.out.print(-1);
        }
    }
}