package day3;

import java.security.Permission;

public class Encapsulation {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public static void main(String [] args) {
{  Person person = new Person("ram", 30);
System.out.println("Name: " + person.getName());
System.out.println("Age: " + person.getAge());
}
}
}
