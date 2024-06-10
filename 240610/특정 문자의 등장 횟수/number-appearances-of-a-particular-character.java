import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ee = 0;
        int eb = 0;
        
        if(str.contains("ee")){
            ee++;
        }
        if(str.contains("eb")){
            eb++;
        }
        System.out.print(ee + " " + eb);
    }
}