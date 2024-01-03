import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a, b;
        char a_j, b_j;

        a = sc.nextInt();
        a_j = sc.next().charAt(0);
        b = sc.nextInt();
        b_j = sc.next().charAt(0);

        if(a >= 19 && a_j == 'M' ){
            System.out.println("1");
        }else if (b >= 19 && b_j == 'M'){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}