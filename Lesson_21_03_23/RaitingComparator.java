package Tasks.Lesson_21_03_23;

import java.util.Comparator;

public class RaitingComparator implements Comparator <Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getRaiting().compareTo(employee2.getRaiting());
    }
}
