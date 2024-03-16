import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 'A';

        for(int i = n; i>= 1; i--){
            for(int q = n; q>= 1; q-- ){
                if(q>i){
                    System.out.print("  ");
                }else if(cnt == 'Z'){

                System.out.print((char)cnt+ " ");
                cnt = 'A';
                }
                else{
                    System.out.print((char)cnt+ " ");
                     cnt++;
                }
            }
            System.out.println();
        }
    }
}