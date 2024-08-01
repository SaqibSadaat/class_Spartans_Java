package HomeWork.MultiLevelInheritanceSecond;

public class C extends B{

    String carType;

    public C(String companyName, String color, String model, int year, String carType) {
        super(companyName, color, model, year);
        this.carType = carType;
    }
    public void carInfo() {
        System.out.println("Company Name: " + companyName + "Color: " + color + "Model: " + model + "Year: " + year + "Car type: " + carType);
    }

}
