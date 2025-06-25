import java.util.Arrays;

public class Lesson2 {
    private static void printSomeText() {
        System.out.println("Orange");
        System.out.println("Apple");
        System.out.println("Banana");
    }
    private static void checkSumSign() {
        int a = 7;
        int b = -9;
        if (a+b < 0) {
            System.out.println("Сумма отрицательная");
        } else {
                System.out.println("Сумма положительная");
        }
    }
    private static void compareNumbers() {
        int a = 7;
        int b = -9;
        if (a<b) {
            System.out.println("a<b");
        } else {
            System.out.println("a>=b");
        }
    }
    private static boolean check10To20(int a, int b) {
        int s = a + b;
        if (s >= 10 && s <= 20) {
                return true;
        } else {
            return false;
        }
    }
    private static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean isNegative(int test) {
        if (test <= 0) {
            return true;
        } else {
            return false;
        }
    }
    private static void write(String a, int b) {
        int i = 0;
        while (i < b) {
            i++;
            System.out.println(a);
        }
    }
    private static boolean isLeapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    private static void switch01() {
    int[] array = {1,1,0,0,1,0,1,1,0,0};
    int i;
    for (i = 0; i < array.length; i++)
        if (array[i] == 0) {
            array[i] = 1;
        }
    else if (array[i] == 1) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
    private static void array100() {
        int[] arrays100 = new int[100];
        for (int i = 0; i < arrays100.length; i++) {
            arrays100[i] = i + 1;
        }
            System.out.println(Arrays.toString(arrays100));
    }
    private static void arrayx() {
        int[] array6x = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array6x.length; i++) {
            if (array6x[i] < 6) {
                array6x[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array6x));
    }
    private static void matrix(int z) {
        int[][] arr = new int[z][z];

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        for (int x = z-1; x >= 0; x=x-1) {
            arr[z-x-1][x] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int[] retLenArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        printSomeText();
        checkSumSign();
        compareNumbers();
        System.out.println(check10To20(9,10));
        isPositiveOrNegative(-3);
        System.out.println(isNegative(-9));
        write("Привет Мир", 3);
        System.out.println(isLeapYear(400));
        switch01();
        array100();
        arrayx();
        matrix(3);
        retLenArr(15, 9);
    }
}