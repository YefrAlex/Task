package Tasks;

public class T_23_02_2023 {
    public static void main(String[] args) {
        String arrayNum;
        int num = 12455421;
        arrayNum = String.valueOf(num);
        boolean isPalindrom = true;
        for (int i = 0; i < arrayNum.length() / 2 ; i++) {
            if (arrayNum.charAt(i) != arrayNum.charAt(arrayNum.length()-(i+1))){
                isPalindrom = false;
                break;
            }
        }
        System.out.println(arrayNum.length() / 2);
        System.out.println(isPalindrom);
    }
}

