import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        

        while(a<=b && b<=50 ){
                System.out.print(a + " ");
                a+=2;
        }
    }
}