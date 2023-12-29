import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m, e,m2,e2;

        m = sc.nextInt();
        e = sc.nextInt();
        m2 = sc.nextInt();
        e2 = sc.nextInt();

        if(m>m2 && e>e2){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}