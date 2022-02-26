package task9;

public class FMIDateTest {
    public static void main(String[] args) {
        FMIDate date1 = new FMIDate(2016,9,26);
        FMIDate date2 = new FMIDate(1878,3,3);
        FMIDate date3 = new FMIDate(2016,9,26);
        FMIDate date4 = new FMIDate(2017,1,1);

        System.out.println(date1.getDaysDifference(date2));
        date1.printInfo();
        date2.printInfo();

        System.out.println(date3.getDaysDifference(date4));
        date3.printInfo();
        date4.printInfo();
    }
}
