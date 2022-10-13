public class OneRoubleForEvery100 {
    public static void main(String[] args) {
        int accountBalance = 0; // баланс
        int replenishmentAmount = 1100; // сумма пополнения баланса
        int minReplenishmentAmount = 1000; // от какой суммы действует бонусная система
        int bonus = 1; // размер бонуса
        int sum = 100; // за какую сумму дают бонус
        if (replenishmentAmount > minReplenishmentAmount) {
            int jastBalance = ((accountBalance + replenishmentAmount) / sum * bonus);
            System.out.println(jastBalance + " бонусных рублей");
        } else {
            int justBalance = 0;
            System.out.println(justBalance + " бонусных рублей");
        }
    }
}
