package Tasks.Lesson_21_03_23;

import java.util.List;

public class Company {
    private String name;
    private List<Department> departmentsName;

    public Company(String name, List<Department> departmentsName) {
        this.name=name;
        this.departmentsName=departmentsName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public List<Department> getDepartmentsName() {
        return departmentsName;
    }

    public void setDepartmentsName(List<Department> departmentsName) {
        this.departmentsName=departmentsName;
    }
}
