package Tasks;
import java.util.Arrays;

public class HW_14_02_23 {
    public static void main(String[] args) {
        String str = "CcccAAAAADDDDDDBQ";
        getCharNumber(str);

    }

//    public static void duplicateChar(String s) {
//        char[] chr = s.toCharArray();
//        for (int i = 0; i < chr.length - 1; i++) {
//            if (Character.isDigit(chr[i])) {//if char index == number, number == Digit,
//                //    Класс Character оборачивает значение всех примитивных типов char
//                System.out.println("Invalid character entered: ");
//                break;
//            } else {
//
//                System.out.print((s.lastIndexOf(chr[i]) - s.indexOf(chr[i]) + 1) + "" + chr[i]);
//                //используется lastIndexOf() для поиска значений в массиве. numbers = [2, 5, 9, 2]; numbers.lastIndexOf(2); // 3
//                i += (s.lastIndexOf(chr[i]) - s.indexOf(chr[i]) + 1);
//            }
//        }
//    }


public static void getCharNumber (String str) {

    str = str.toUpperCase();
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    char exampl = chars[0];
    int counter = 0;
    String result = "";


    for (int i = 0; i < chars.length; i++){

        if (exampl != chars[i]){
            result = result + exampl + Integer.toString(counter);
            exampl = chars[i];
            counter = 0;

        }
        if (exampl == chars[i]) {
            counter++;
        }

    }

    System.out.println(result);
}




}