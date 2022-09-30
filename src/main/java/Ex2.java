import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x < 0) && (y > 0)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
