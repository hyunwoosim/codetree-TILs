import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        String ee = "No";
        String ab = "No";

        for(int i  = 0; i < len -1; i++){
            if(s.substring(i,i+2).equals("ee")){
                ee = "Yes";
            }
            if(s.substring(i,i+2).equals("ab")){
                ab = "Yes";
            }
        }
        System.out.print(ee + " ");
        System.out.print(ab);
    }
}