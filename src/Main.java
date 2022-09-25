public class Main {
    public static void main(String[] args) {
        int startAmount = 100;
        System.out.println("Ваш баланс = " + startAmount + " руб");
        int plusMoney = 12000;
        int bonus = plusMoney / 100;
        int end = startAmount + plusMoney;
        int finalAmount = end + bonus;
        if (plusMoney > 1000) {
            System.out.println("Вам начислено: " + bonus + " бонусов" + " Итого баланс: " + finalAmount + " руб");
        } else {
            System.out.println("Итого баланс: " + end + " руб");

        }
    }

}