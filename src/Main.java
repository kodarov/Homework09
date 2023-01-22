public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1(){
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", sum);
    }
    public static void task2(){
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int minExpense = arr[0];
        int maxExpense = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > maxExpense) {
                maxExpense = arr[i];
            }
            if (arr[i] < minExpense) {
                minExpense = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n",minExpense, maxExpense);
    }
    public static void task3(){
        System.out.println("Задание 3");
    }
    public static void task4(){
        System.out.println("Задание 4");
    }
}