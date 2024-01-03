import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int  j,a;

        j = sc.nextInt();
        a = sc.nextInt();

        if (a >= 19 ){
            if(j == 0){
            System.out.println("MAN");
        }
        else{
            System.out.println("WOMAN");
        }
    
    }else if(j == 0){ 
        System.out.println("BOY"); 
        }
        else{
        System.out.println("GIRL");
    }
}
}