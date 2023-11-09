import java.util.*;
public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1人目の身長(m)と体重を入力↓");
        Double height1 = Double.parseDouble(sc.nextLine());
        Double weight1 = Double.parseDouble(sc.nextLine());
        System.out.println("2人目の身長と体重を入力↓");
        Double height2 = Double.parseDouble(sc.nextLine());
        Double weight2 = Double.parseDouble(sc.nextLine());

        Double bmi1 = weight1 / (height1 * height1) ;
        Double bmi2 = weight2 / (height2 * height2) ;
        String sv1 = String.format("%.2f",bmi1);
        String sv2 = String.format("%.2f",bmi2);

        System.out.println("1人目のBMIは" + sv1 + "です。");
        bmi(bmi1);
        System.out.println("2人目のBMIは" + sv2 + "です。");
        bmi(bmi2);


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

