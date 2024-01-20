import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; n<= 10;i++ ){
                n = i;
        if(n%2 == 1 && n%3 == 0){
            System.out.println(n);
        }
        }
    }
}