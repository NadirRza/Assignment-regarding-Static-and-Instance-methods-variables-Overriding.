package Task5;

public class Person {
    String name;
}
class Employee extends  Person{
    String name;


}
class Main{
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name="Employee name";
        System.out.println(employee.name);
        Person person = employee;
        person.name="Person Name";
        System.out.println(person.name);
        System.out.println(employee.name);

    }
}

