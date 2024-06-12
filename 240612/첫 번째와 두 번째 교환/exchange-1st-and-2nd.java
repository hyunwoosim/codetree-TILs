import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        char A = arr[0];
        char B = arr[1];
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == A){
                arr[i] = B;
            }
            else if(arr[i] == B){
                arr[i] = A;
            }
        }
        System.out.println(arr);
    }
}