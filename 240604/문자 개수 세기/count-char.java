import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        char str2 = sc.next().charAt(0);
        int len1 = str1.length();
        int count = 0;

        for(int i = 0; i<len1; i++){
            if(str1.charAt(i) == str2){
                count++;
            }
        }
        System.out.println(count);
    }
}