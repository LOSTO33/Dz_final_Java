import java.util.Objects;

import lesson6.Person;

public class Employee {

private String firstName;
private String lastName;
private int age ;
private double salary;

public int getAge() {
    return age;
  }

public double getSalary(){
    return salary;
}
 
public Employee(String firstName, String lastName,int age,double salary) { //конструктор 3.1
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.age = age;

}

public Employee(String firstName, String lastName,int age) { // конструктор 3.2
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = 1000.0;
    this.age = age;

}

public Employee(String firstName, String lastName) {  // конструктор 3.3
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = 1000.0;
    this.age = 25;

}

public String getFullName(){
    return firstName+ " " + lastName;
}
public void setAge(int age){
    if(age>14){
        this.age = age;
    }
}

public void setSalary(double salary){
    if (salary>= 1000.0){
        this.salary = salary;
    }
}
public void setFirstName(String firstName){
    this.firstName = firstName;
}
public void setLastName(String lastName){
    this.lastName = lastName;
}

@Override
public String toString(){
    return "FirstName["+firstName+"] LastName["+lastName+"]";
}
@Override
public int hashCode(){
    return Objects.hash(firstName,lastName);
}

@Override
public boolean equals(Object anotherObject){
    if (anotherObject == null) {
        return false;
      }
    if (!(anotherObject instanceof Employee)) {
      return false;
    }
    Employee newEmployee = (Employee) anotherObject;
    return this.getFullName().equals(newEmployee.getFullName());

}

}