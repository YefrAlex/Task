package Tasks;

public class HW {
    public static void main(String[] args) {
        int[] numers1 = {1, 1, 5, 4, 1, 9, 2, 4, 6};
        int n1 = 11;
        getMinSequence(numers1, n1);
    }

    public static void getMinSequence(int[] numers1, int n) {
        int minSeq = numers1.length;
        int minSeq1 = numers1.length;
        int seq = 0;
        int sum = 0;
        for (int i = 0, j = i; i < numers1.length - 1; ) {
            sum = sum + numers1[j];
            seq = seq + 1;
            if (j < numers1.length -1) {
                j = j + 1;
            } if (sum == n) {
                i = i + 1;
                j = i;
                sum = 0;
                minSeq1 = seq;
                seq = 0;
            } else if (sum > n ) {
                i = i + 1;
                j = i;
                sum = 0;
                seq = 0;
            }
            if (minSeq1 < minSeq) {
                minSeq = minSeq1;

            }

            System.out.println("minSeq=  " + minSeq);
        }
    }
}

            //[1 1 5 4 1 9 2 4 6] n = 11
            //вернуть длину минимальной последовательности
            //которая в сумме дает n
            //в массиве все числа положительные



        //вам необходимо проверить массив на наличие повторений чисел

//   first task     int arr[] = {11, 0, 1, 5, 4, 8, 9, 3, 2, 6, 12, 19, 7, -6, 50, 18, 14,65, -37};
//        int n = 13;
//        int a = 0;
//        int b = 0;
//        for (int i = 0, j = i + 1; i < arr.length -1; j++) {
//            a = arr[i];
//            b = n - a;
//            if (j == arr.length) {
//                i = i + 1;
//               j = i - 1; // если задать j = 0 - пары будут повторятся
//            }
//            if (b == arr[j]) {
//                System.out.println("First number is: " + a);
//                System.out.println("Second number is: " + b);
//                i = i + 1;
//               j = i - 1;// если задать j = 0 - пары будут повторятся
//            }
//        }

//        for (int i = 0, j = i + 1; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                j++;
//                i = 0;
//            }
//            if (j == arr.length) {
//                break;
//            }
//            if (arr[i] + arr[j] == n) {
//                System.out.println("Pair with given sum " + n + " is (" + arr[i] + ", " + arr[j] + ")");
//            }
//        }




