package Tasks.Lesson_21_03_23;

import java.util.Iterator;
import java.util.List;

public class NewSalary {

    public static List<Employee> getRatingSalary (int n, List<Employee> employees ) {
        Iterator <Employee> iter = employees.iterator();
     //  for (int i=0; i < n; i++) {
        int i = -1;
            while (iter.hasNext()) {
            int newselary=0;
            i++;
            iter.next();


            switch (employees.get(i).getRaiting()) {
                case A:
                    newselary =(int) (employees.get(i).getSalary() * 1.2);
                    break;
                case B:
                    newselary = (int) (employees.get(i).getSalary() * 1.15);
                    break;
                case C:
                    newselary =  (int) (employees.get(i).getSalary() * 1.05);
                    break;
                case D:
                    newselary = employees.get(i).getSalary();
                    break;
                case E:
                    newselary =(int) (employees.get(i).getSalary() * 0.95);
                    break;
                default:
                    newselary = -1;
                    break;

            }
            employees.get(i).setSalary(newselary);
        }
        return employees;
    }

}
