public class Main {
    public static void main(String[] args) {

        int refill = 1001;
        int bonus = refill / 100;
        int balance = refill + bonus;

        if (refill > 1000) {
            balance = refill + bonus;
        } else {
            balance = refill;
            bonus = 0;
        }


        System.out.println("Вы пополнили счет. Ваш баланс составляет: " + balance + " рублей");
        System.out.println("Вам начисленно бонусов: " + bonus);

    }
}
