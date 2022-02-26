package task8;

/*Create class Car with 4 attributes: brand, model, horsePower, year.

Create method insuranceCategory() which will return the category of the car by the year of construction:

category 1: under 8 years
category 2: between 8 and 15
category 3: between 16 and 25
category 4: over 26
Create functionality which will return the insurance value of a car based on the following rule: based values:

category 1: 150
category 2: 200
category 3: 300
category 4: 500
if the car is under 80 hp increase the value by 20%, if over 140 increase with 45%

Example: Lada 5 1989 75 -> 600 Mercedes-Benz S220 2009 160 -> 217.5*/

public class Car {
    private String brand;
    private String model;
    private double horsePower;
    private int year;

    public Car(String brand, String model, double horsePower, int year) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand;
        } else {
            brand = "undefined";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        } else {
            this.model = "undefined";
        }
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        if (horsePower > 0.0) {
            this.horsePower = horsePower;
        } else {
            horsePower = 0.0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            this.year = 0;
        }
    }

    public int insuranceCategory() {
        final int CURRENT_YEAR = 2022;

        if (CURRENT_YEAR - this.year <= 8) {
            return 1;
        } else if (CURRENT_YEAR - this.year <= 15 && CURRENT_YEAR - this.year > 8) {
            return 2;
        } else if (CURRENT_YEAR - this.year <= 25 && CURRENT_YEAR - this.year > 15) {
            return 3;
        }

        return 4;
    }

    public double insuranceValue() {
        int category = this.insuranceCategory();
        double value = 0.0;

        switch (category) {
            case 1:
                value = 150;
                break;
            case 2:
                value = 200;
                break;
            case 3:
                value = 300;
                break;
            case 4:
                value = 500;
                break;
            default:
                value = 0.0;
        }

        if (this.horsePower < 80) {
            value = value + (20.0 / 100.0) * value;
        }

        if (this.horsePower > 140) {
            value = value + (45.0 / 100.0) * value;
        }
        return value;
    }
}
