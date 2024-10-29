import java.util.*;

public class ComparableComparatorDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(11);
        e1.setFirstName("Ram");
        e1.setSalary(25000);
        e1.setCity("Ayodhya");

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setFirstName("Laxman");
        e2.setSalary(45000);
        e2.setCity("Ayodhya");

        Employee e3 = new Employee();
        e3.setId(13);
        e3.setFirstName("AhiRavan");
        e3.setSalary(15000);
        e3.setCity("PatalLok");

        Employee e4 = new Employee();
        e4.setId(4);
        e4.setFirstName("Vibhisan");
        e4.setSalary(55000);
        e4.setCity("Lanka");

        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        System.out.println(list);

        NameSort ns = new NameSort();
        
        Collections.sort(list,ns);


        System.out.println(list);

    }
}
// Comparable Comparator -> sort

class NameSort implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        if (o1.getId() > o2.getId()) {
            return -1;
        } else if (o1.getId() < o2.getId()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private int salary;
    private String firstName;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return id + " " + firstName + " " + city + " " + salary;
    }

    // list e1 e2 e3 e4 -> small big
    public int compareTo(Employee o) {// 1:firstBig -1:firstSmall 0:same
        if (id > o.id) {
            return 1;
        } else if (id < o.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
