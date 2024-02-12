import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        boolean bool = true;

        for(int i = a; i <=b; i++){
            if(i%c==0){
                bool = false;
            }
        }
        if (bool == false){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}