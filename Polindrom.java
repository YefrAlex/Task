package Tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Polindrom {
    public static void main(String[] args) {
        getPolindrom();
    }
    public static void getPolindrom () {
        //Метод, который генерит слова заглавными буквами,
        //используя 5 букв
        //Написать метод который добавляет в лист 1000 слов
        //Написать метод который принимает Лист и проверяет каждое слово
        //на палиндром
        //Вывод на экран СЛОВО : Палиндром/НЕ Палиндром

        String s = "MADAM";
        List<Character> characters = new LinkedList<>();
        ListIterator<Character> listIterator = characters.listIterator();
        for(char c : s.toCharArray()) {
            characters.add(c);
        }
        while (listIterator.next() == listIterator.previous())
        {}


        //l1
        //l2
        boolean isPalindrome;
    }
}
