package task9;

/*Create class FMIDate in which you will have the fields year, month and day defined.

The class will have the follwoing methods:

method	description
boolean isLeapYear()	is checking if the date defined in the object is a leap year
int getCentury()	return the appropriate century
int getDaysDifference(FMIDate other)	return the difference between the passed and the object data
void printInfo()	print the date followed by the century and if it's leap year followed by "It is a LEAP year" Example: yyyy MM dd - century.[It is LEAP year]
Create a program that will read two dates from the standart input and print the following 3 rows:

difference between the two dates
printInfo() for both dates
Example:

Dates	Output
2016 09 26
1878 03 03	50612
2016 09 21 - 21 century. It is a LEAP year
1978 03 03 - 19 century.
2016 09 26
2017 01 01	98
2016 09 26 - 21 century. It is LEAP year.
2017 01 01 - 21 century.*/

public class FMIDate {
    private int year;
    private int month;
    private int day;

    public FMIDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isLeapYear() {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;
    }

    public int getCentury() {
        if (this.year <= 100) {
            return 1;
        } else if (year % 100 == 0) {
            return this.year / 100;
        } else {
            return this.year / 100 + 1;
        }
    }

    public int getDaysDifference(FMIDate other) {
        int n1 = this.year * 365 + this.day;
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < this.month - 1; i++) {
            n1 += monthDays[i];
        }


        int n2 = other.year * 365 + other.day;
        for (int i = 0; i < other.month - 1; i++) {
            n2 += monthDays[i];
        }

        int countLeapYears = 0;
        if (this.year < other.year) {
            if (other.month > 2 && other.isLeapYear()) countLeapYears++;
            for (int i = this.year; i <= other.year; i++) {
                if (isLeapYear(i)) countLeapYears++;
            }
        } else {
            if (this.month > 2 && this.isLeapYear()) countLeapYears++;

            for (int i = other.year; i <= this.year; i++) {
                if (isLeapYear(i)) countLeapYears++;
            }
        }

        return Math.abs(n2 - n1) + countLeapYears;
    }

    public void printInfo() {
        String result;
        if (this.isLeapYear()) {
            result = String.format("%d %02d %02d - %d century. It is a LEAP year.", this.year, this.month, this.day, this.getCentury());
        } else {
            result = String.format("%d %02d %02d - %d century.", this.year, this.month, this.day, this.getCentury());
        }

        System.out.println(result);
    }
}
