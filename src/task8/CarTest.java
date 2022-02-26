package task8;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Lada","5", 75, 1989);
        Car car2 = new Car("Mercedes-Benz", "S220", 160, 2009);

        System.out.printf("The value of car insurance of %s is: %.2f%n", car1.getBrand(), car1.insuranceValue());
        System.out.printf("The value of car insurance of %s is: %.2f%n", car2.getBrand(), car2.insuranceValue());
        //The example should be old, and made when the mercedes was in first category, now it is second that is why 217.5 != 290.0 :)
    }
}
