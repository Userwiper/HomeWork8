import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task5() {
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        System.out.println(januaryWeight);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);

        }
    }

    public static void task6() {
        System.out.println("Задача 2");
        int[] arrs = new int[10];
        for (int index = 0; index < arrs.length; index++) {
            arrs[index] = index + 1;
            System.out.println(arrs[index]);
        }

    }

    public static void task7() {
        System.out.println("Задача 3");
        int[] mass = new int[10];
        System.out.println(Arrays.toString(mass));
        for (int index = 0; index < mass.length; index++) {
            if (index == mass.length - 1) {
                System.out.print(mass[index] + " ");
            }
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] massOne = new int[3];
        massOne[0] = 1;
        massOne[1] = 2;
        massOne[2] = 3;
        System.out.println(Arrays.toString(massOne));

        double[] massTwo = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(massTwo));

        boolean[] massFree = {true, false};
        System.out.println(Arrays.toString(massFree));

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] one = {90, 92, 98, 114, 389, 33, 1};
        for (int i = 0; i < 7; i++) {
            System.out.print(one[i]);
            for (; i < 6; ) {
                System.out.print(",");
                break;
            }
        }
        System.out.println();
        double[] massTwo = {1.57, 7.654, 9.986};
        System.out.print(massTwo[0] + "," + massTwo[1] + "," + massTwo[2]);
        System.out.println();
        boolean[] massFree = {true, false};
        for (int i = 0; i < 2; i++) {
            System.out.print(massFree[i]);
            for (; i < 1; ) {
                System.out.print(",");
                break;
            }
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int[] one = {90, 92, 98, 114, 389, 33, 1};
        for (int i = 6; i >= 0; i--) {
            System.out.print(one[i]);
            for (; i > 0; ) {
                System.out.print(",");
                break;
            }
        }
        System.out.println();
        double[] massTwo = {1.57, 7.654, 9.986};
        System.out.print(massTwo[2] + "," + massTwo[1] + "," + massTwo[0]);
        System.out.println();
        boolean[] massFree = {true, false};
        for (int i = 1; i >= 0; i--) {
            System.out.print(massFree[i]);
            for (; i > 0; ) {
                System.out.print(",");
                break;
            }
        }
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        int[] one = {90, 92, 98, 114, 389, 33, 1};
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i]++;
            }
        }
        System.out.println(Arrays.toString(one));
    }
}


