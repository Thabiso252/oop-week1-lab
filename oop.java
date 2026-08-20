class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printDetails() {
        System.out.println(name + " is " + age + " years old");
    }
}

public class oop {
    public static void main(String[] args) {

        Person[] people = {
            new Person("Ben", 10),
            new Person("Mary", 6),
            new Person("Leo", 97)
        };

        for (Person p : people) {
            p.printDetails();
        }
    }
}