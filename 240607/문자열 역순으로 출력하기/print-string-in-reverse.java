import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n  = 4;
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        for(int i = n-1; i >=0; i--){
            System.out.println(arr[i]);
        }

       
    }
}