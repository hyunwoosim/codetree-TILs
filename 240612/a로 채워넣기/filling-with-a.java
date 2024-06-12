import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        char[] arr = str.toCharArray();
        
        arr[1] = 'a';
        arr[len-2] = 'a';
        System.out.println(arr);
    }
}