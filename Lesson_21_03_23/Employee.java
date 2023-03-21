package Tasks.Lesson_21_03_23;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable <Employee> {
    private String firstName;
    private String secondName;
    private Department dep;
    private int salary;
    private int age;
    private Raiting raiting;

    public Employee(String firstName, String secondName, Department dep, int salary, int age, Raiting raiting) {
        this.firstName=firstName;
        this.secondName=secondName;
        this.dep=dep;
        this.salary=salary;
        this.age=age;
        this.raiting=raiting;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName=secondName;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep=dep;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary=salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public Raiting getRaiting() {
        return raiting;
    }

    public void setRaiting(Raiting raiting) {
        this.raiting=raiting;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", dep=" + dep +
                ", salary=" + salary +
                ", age=" + age +
                ", raiting=" + raiting +
                '}';
    }


    @Override
    public int compareTo(@NotNull Employee employee) {
        if (this.getFirstName().compareTo(employee.getFirstName()) == 0) {
            if (this.getSecondName().compareTo(employee.getSecondName()) == 0){
                if (this.getDep().compareTo(employee.getDep()) == 0){
                    if (this.getSalary() == employee.getSalary()){
                        return (this.getAge() - employee.getAge());
                    } else return (this.getSalary() - employee.getSalary());
                }else return this.getDep().compareTo(employee.getDep());
            }else return this.getSecondName().compareTo(employee.getSecondName());
        }else return this.getFirstName().compareTo(employee.getFirstName());
    }
}
