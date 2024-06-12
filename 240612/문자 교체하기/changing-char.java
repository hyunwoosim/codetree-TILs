import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        arr2[0] = arr1[0];
        arr2[1] = arr1[1];

        System.out.println(arr2);
        
         
        
    }
}