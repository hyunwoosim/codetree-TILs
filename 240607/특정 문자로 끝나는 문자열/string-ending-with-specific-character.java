import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        int len = 0;
        int cnt = 0;
        for(int i = 0; i <10; i++){
            arr[i] = sc.next();
            
        }
        char a = sc.next().charAt(0);

        for(int i = 0 ; i < 10; i++){
           len = arr[i].length();
            if(arr[i].charAt(len-1) == a ){
                System.out.println(arr[i]);
                cnt++;
            }
        }
        if(cnt == 0){
            System.out.println("None");
        }
    }
}