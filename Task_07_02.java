package Tasks;

public abstract class Task_07_02 {
    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 4, 4, 4, 4, 4, 10};
        int[] fiboArr;
        int lange = 7;
        fiboArr = new int[lange];


        getMin(arr);
        getFibonachi(fiboArr);
    }

    public static void getMin(int[] arrmin) {
        int min = arrmin[0];
        int min2 = Integer.MIN_VALUE;
        int min3 = Integer.MIN_VALUE;
        int min4 = Integer.MIN_VALUE;

        if (arrmin.length > 4) {
            for (int i = 0; i < arrmin.length; i++) {
                if (arrmin[i] < min) {
                    min2 = min;
                    min = arrmin[i];
                } else if (arrmin[i] < min2) {
                    min3 = min2;
                    min2 = arrmin[i];
                } else if (arrmin[i] < min3) {
                    min4 = min3;
                    min3 = arrmin[i];
                } else if (arrmin[i] < min4) {
                    min4 = arrmin[i];
                }

            }
            System.out.println("MIN 1: " + min);
            System.out.println("MIN 2: " + min2);
            System.out.println("MIN 3: " + min3);
            System.out.println("MIN 4: " + min4);
        } else {
            System.out.println("массив содержит 4 или  менее значений ");
        }
    }




    public static void getFibonachi(int[] fiboAr) {
        int lange = 11;
        int[] fiboArr;
        fiboArr = new int[lange];


        for (int i = 0; i < lange; i++) {
             if(i<2) {
                fiboArr[i] = i;
            } else
            fiboArr[i] = fiboArr[i-2] + fiboArr[i-1];
            System.out.println(fiboArr[i]);
        }

    }

}

