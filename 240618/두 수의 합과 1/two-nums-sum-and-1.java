import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a + b;
        String str = Integer.toString(c);
        int len = str.length();
        int cnt = 0;
        for(int i = 0; i < len; i++){
            if(str.charAt(i) == '1'){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}