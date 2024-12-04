public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println("Задача 1");
        int [] payments = {59000, 60000, 78000, 16000, 2500};
        int expenses = 0;
        for (int payment : payments) {
            expenses += payment;
        }
            System.out.println("Сумма трат за месяц составила " + expenses + "  рублей");

        System.out.println();

        System.out.println("Задача 2");
        int [] payments2 = {59000, 60000, 78000, 16000, 2500};
        int maxPayments2 = -1;
        int miniPayments2 = 100000000;
        for (int j : payments2) {
            if (j > maxPayments2) {
                maxPayments2 = j;
            }
            if (j < miniPayments2){
                miniPayments2 = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + miniPayments2 + " рублей. Максимальная сумма трат за неделю составила " + maxPayments2 + " рублей");

        System.out.println();

        System.out.println("Задание 3");
        float averageAmount = 0;
        averageAmount = (float) expenses / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        System.out.println();

        System.out.println("Задача 4");
        char[] reverseFullName2 = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName2.length - 1; i > -1; i--) {
            if (i == reverseFullName2.length - 1) {
                System.out.print(reverseFullName2[i] + "");
            } else {
                System.out.print(reverseFullName2[i] + "");
            }
        }
    }
}