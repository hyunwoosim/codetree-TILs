import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        
        for(int i = 0; i < 20; i++){
            int num = sc.nextInt();
         

            if(num <= len){
                str = str.substring(0,num) + str.substring(num+1);
                System.out.println(str);
                len--;
            }
            if(num > len) {
                str = str.substring(0,len-1) ;
                break;
            }
        }
        System.out.println(str);

    }
}