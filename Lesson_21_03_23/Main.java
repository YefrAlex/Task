package Tasks.Lesson_21_03_23;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n=6;
        List<Employee> employees=Generator.getEmployee(n);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("==============NEW_SALARY==========================");
        List<Employee> employeesNewSalary=NewSalary.getRatingSalary(n, employees);
        for (Employee employee : employeesNewSalary) {
            System.out.println(employee);
        }
        System.out.println("====================SORTET========================");
        Collections.sort(employeesNewSalary);
        for (Employee employee : employeesNewSalary) {
            System.out.println(employee);
        }
        System.out.println("================SORTED BY RAITING====================");
        Collections.sort(employeesNewSalary, new RaitingComparator());
        for (Employee employee : employeesNewSalary) {
            System.out.println(employee);
        }
    }
}
/*
//1. class Company имя и лист департаментов
//2. Энам Департаменты с 5 макисмум департаментами
//3. Класс Эплои с полями имя позраст зарплата и рейтинг
//4. Энам рейтинг
//если рейтинг A то +20%
//B +15%
//C +5%
//D 0%
//E -5%
//5. Класс генератор который создает Эмплои и засовывет его в рандомный департамент с рандомным рейтингом и зарплатой
//Эмплои должен иметьспособность сравниматься по всем полям кроме ретинга
//6. Сделать отдельный компаратор который сортирует по рейтингу
//7. В классе Мэйн надо прописать только один метод с параметрок количеством сотрудников который с генерирует весь этот процесс и выведет на экран Сотрудника с зп ДО и После
 */