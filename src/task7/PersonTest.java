package task7;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Aleks Bozhinov");
        Person person3 = new Person("Aleks Bozhinov", 22);

        System.out.printf("Person1: %s%n", person1.toString());
        System.out.printf("Person2: %s%n", person2.toString());
        System.out.printf("Person3: %s%n", person3.toString());

    }
}
