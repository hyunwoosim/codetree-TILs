import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int ee = 0;
        int eb = 0;

        for( int i =0; i < len - 1; i++){
            if(str.charAt(i) == 'e' && str.charAt(i + 1) == 'e')
                ee++;
            if(str.charAt(i) == 'e' && str.charAt(i + 1) == 'b')
                eb++;
        }
        
        
        System.out.print(ee + " " + eb);
    }
}