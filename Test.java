import Employee.Employee;






public class Test{
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", "Sokolov");
        Employee petr = new Employee("Petr", "Ivanov",20);
        System.out.println(petr.getFullName());
    }
    
}
