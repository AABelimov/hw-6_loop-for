public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
        task9();
        System.out.println();
        task10();
        System.out.println();
    }

    public static void task1(){
        System.out.println("Task1:");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    public static void task2(){
        System.out.println("Task2:");
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
    }

    public static void task3(){
        System.out.println("Task3:");
        for(int i = 0; i < 17; i += 2){
            System.out.println(i);
        }
    }

    public static void task4(){
        System.out.println("Task4:");
        for(int i = 10; i >= -10; i--){
            System.out.println(i);
        }
    }

    public static void task5(){
        System.out.println("Task5:");
        for(int i = 1904; i <= 2096; i += 4) System.out.println(i + " год является високосным");
    }

    public static void task6(){
        System.out.println("Task6:");
        for(int i = 7; i < 99; i += 7) System.out.printf("%d ", i);
        System.out.println();
    }

    public static void task7(){
        System.out.println("Task7:");
        for(int i = 1; i <= 512; i *= 2) System.out.println(i);
    }

    public static void task8(){
        int contrib = 29000;
        int sum = 0;

        System.out.println("Task8:");
        for(int i = 1; i <= 12; i++){
            sum += contrib;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, sum);
        }
    }

    public static void task9(){
        double money = 29000.0;

        System.out.println("Task9:");
        for(int i = 1; i <= 12; i++){
            money *= 1.1;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", i, money);
        }
    }

    public static void task10(){
        int num = 2;

        System.out.println("Task10:");
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
}