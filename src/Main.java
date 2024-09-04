public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1\n");
        {
            int total = 0;
            int target = 2_459_000;
            int monthDeposit = 15_000;
            int month = 0;

            while (total < target) {
                month++;
                total += monthDeposit;
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", month, total);
            }
        }

        System.out.println("\nTask 2\n");
        {
            int i = 0;
            while (i < 10) {
                i++;
                System.out.printf("%d ", i);
            }
            System.out.println();

            for (; i > 0; i--) {
                System.out.printf("%d ", i);
            }
            System.out.println();
        }

        System.out.println("\nTask 3\n");
        {
            int populationY = 12_000_000;
            int birthFor1K = 17;
            int deathFor1K = 8;

            for (int i = 1; i < 11; i++) {
                populationY += populationY / 1000 * (birthFor1K - deathFor1K);
                System.out.printf("Год %d, численность населения составляет %d\n", i, populationY);
            }
        }

        System.out.println("\nTask 4\n");
        {
            int deposit = 15_000;
            int month = 0;

            while (deposit < 12_000_000) {
                month++;
                deposit *= 1.07;
                System.out.printf("Месяц %d, накопленная сумма %d\n", month, deposit);
            }
        }

        System.out.println("\nTask 5\n");
        {
            int deposit = 15_000;
            int month = 0;

            while (deposit < 12_000_000) {
                month++;
                deposit *= 1.07;
                if (month % 6 == 0)
                    System.out.printf("Месяц %d, накопленная сумма %d\n", month, deposit);
            }
        }

        System.out.println("\nTask 6\n");
        {
            int deposit = 15_000;

            for (int month = 1; month < 9 * 12 + 1; month++) {
                deposit *= 1.07;
                if (month % 6 == 0)
                    System.out.printf("Месяц %d, накопленная сумма %d\n", month, deposit);
            }
        }

        System.out.println("\nTask 7\n");
        {
            int firstFriday = 2;

            for (int i = firstFriday; i < 31; i = i + 7)
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", i);
        }

        System.out.println("\nTask 8\n");
        {
            int nowYear = 2024;

            for (int i = nowYear - 200; i < nowYear + 100; i++) {
                if (i % 79 == 0) {
                    System.out.println(i);
                    i += 78;
                }
            }
        }
    }
}