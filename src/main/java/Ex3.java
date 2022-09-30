import java.util.Locale;
import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.next().toLowerCase(Locale.ROOT);
        String str = "Вы выбрали";
        switch(color){
            case "green":
                System.out.println(str + " внедорожник");
                break;
            case "white":
                System.out.println(str + " автобус");
                break;
            case "black":
                System.out.println(str + " мотоцикл");
                break;
            case "red":
                System.out.println(str + " трамвай");
                break;
            default:
                System.out.println(str + " велосипед");
        }
    }
}
