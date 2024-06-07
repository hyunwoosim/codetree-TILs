import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char a = sc.next().charAt(0);
            String[] str = new String[] {"apple", "banana", "grape", "blueberry", "orange"};
            int cnt = 0;
            
            for(int i = 0; i < 5; i++)
            if(str[i].charAt(2) == a || str[i].charAt(3) == a) {
                System.out.println(str[i]);
                cnt++;
            }

        // 조건을 만족하는 문자열의 개수를 출력합니다.
        System.out.println(cnt);
    }
}