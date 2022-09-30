import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary1 = sc.nextInt();
        int salary2 = sc.nextInt();
        int salary3 = sc.nextInt();
        int differance = sc.nextInt();
        if ((Math.abs(salary1 - salary2) > differance) ||
                (Math.abs(salary1 - salary3) > differance) ||
                (Math.abs(salary2 - salary3) > differance)){
            System.out.println("Ура, бастуем!");
        } else {
            System.out.println("За работу, Солнце ещё высоко!");
        }
    }
}
