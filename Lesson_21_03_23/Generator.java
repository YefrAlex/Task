package Tasks.Lesson_21_03_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generator {
    private static final List<String> firstNamesList=new ArrayList<>(Arrays.asList("Alex", "Boris", "Corvin", "Denis", "Erik", "Faris",
            "Joana", "Lana", "Jams", "Andrew", "Irina", "Sanjida", "Hussein", "Ansarula", "Cristian"));
    private static final List<String> secondNamesList=new ArrayList<>(Arrays.asList("Prozit", "Roaling", "Tolkien", "Moor", "Ford", "Didro",
            "Volter", "Sult", "Ivanov", "Chernenko", "Andropov", "Smirnoff", "Wilson", "Shumaher", "Haus"));
    private static final List<Department> departments=Arrays.asList(Department.values());
    private static final List<Raiting> raitings=Arrays.asList(Raiting.values());
    private static int n;

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        Generator.n=n;
    }

    public static void main(String[] args) {
        System.out.println(getEmployee(n));
    }


    protected static final List<Employee> getEmployee(int n) {
        List<Employee> employees=new ArrayList<>();


        for (int i=0; i < n; i++) {

            employees.add(new Employee(firstNamesList.get((int) (Math.random() * 16 -1)), secondNamesList.get((int) (Math.random() * 16 -1)),
                    departments.get((int) (Math.random() * 6 - 1)), (int) (Math.random() * 3000 + 1500),
                    (int) (Math.random() * 45 + 20), raitings.get((int)(Math.random() * 6 - 1))));

        }


        return employees;
    }


}

