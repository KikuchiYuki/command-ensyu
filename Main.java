import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("身長(m)と体重を入力↓");
        Double height1 = Double.parseDouble(sc.nextLine());
        Double weight1 = Double.parseDouble(sc.nextLine());

        Double bmi1 = weight1 / (height1 * height1) ;
        String sv1 = String.format("%.2f",bmi1);

        System.out.println("BMIは" + sv1 + "です。");
        bmi(bmi1);

    }

    public static void bmi(Double bmi) {
        if (bmi < 18.50) {
            System.out.println("痩せすぎです。");
        } else if (bmi < 25) {
            System.out.println("健康的でいいですね。");
        } else {
            System.out.println("痩せなさい。");
        }
    }
}

