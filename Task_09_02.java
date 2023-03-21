package Tasks;
public class Task_09_02 {

    //Дан массив и число n
    //Вывести на экран два любых числа из массива которые
    //в сумме дают n за O(n) либо написать что таких
    //чисел нет
    //[0 1 5 4 8 9 3 2 6] n = 13
    //** все пары чисел



    public static void main(String[] args) {
        int arr1[] = {11, 0, 1, 5, 4, 8, 9, 3, 2, 6, 12, 19, 7, -6, 50, 18, 14, 65, -37};
        int n = 13;
        int[] numsN = {1,3,9,11,13,17,4,5,3,2,17,4,1};
        isDuplicated(numsN);
        // getTwoNumbers(arr1, n);

    }

    public static void getTwoNumbers(int[] arr, int n) {
        int a = 0;
        int b = 0;
        for (int i = 0, j = i + 1; i < arr.length -1; j++) {
            a = arr[i];
            b = n - a;

            if (j == arr.length) {
                i = i + 1;
                j = i - 1; // если задать j = 0 - пары будут повторятся
            }
            if (b == arr[j]) {
                System.out.println("First number is: " + a);
                System.out.println("Second number is: " + b);
                i = i + 1;
                j = i - 1;// если задать j = 0 - пары будут повторятся
            }
        }
    }
    public static void isDuplicated(int[] numsN) {

        for (int i = 0, j = 1; i < numsN.length -1;) {

            if (numsN[i] != numsN[j]) {
                j = j + 1;
            }
            if (j == numsN.length) {
                System.out.println(numsN[i] + " нет пары" );
                i = i +1;
                j = i +1;
            }
            else
            if (numsN[i] == numsN[j]) {
                System.out.println(numsN[i] + " = " + numsN[j]);
                i = i +1;
                j = i +1;
            }

        }
    }
}
