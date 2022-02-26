package task7;

/*Create a class named Person with two attributes: name and age. Implement 3 constructors:

without parameters setting up default parameters "No name" and -1
with 1 parameter for name and default value for age -1
with 2 parameters setting up the both attributes
Implement setters and getters

Implement string representation of the object -> Hello, I am . I am years old Tip: override -> toString.

This implementation to have the following logic:

if the age is not set, then print Hello, I am .
if the name is not set, then print I am John Doe*/

public class Person {
    private String name;
    private int age;

    public Person() {
        setName("No name");
        setAge(-1);
    }

    public Person(String name) {
        setName(name);
        setAge(-1);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "No name";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > -1) {
            this.age = age;
        } else {
            this.age = -1;
        }
    }

    @Override
    public String toString() {
        if (this.age == -1 && !this.name.equals("No name")) {
            return String.format("Hello, I am %s.", this.name);
        }
        if (this.name == "No name") {
            return "I am John Doe";
        }
        return String.format("Hello, I am %s. I am %d years old.", this.name, this.age);
    }
}