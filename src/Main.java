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
        for(int i = 1904; i <= 2096; i += 4) System.out.println(i);
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
}