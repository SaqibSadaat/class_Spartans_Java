package week_11_06102024.day_1.singleInheritance;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String address;


    //Constructor
    public Employee(String id, String firstName, String lastName, String address) {
        getId();
        getFirstName();
        getLastName();
        getAddress();
        System.out.println("Hey, I am being called from JavaOne Constructor! " + getId());
    }

    //Getter
    public String getId() {return id;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getAddress() {return address;}

    //Setter


    public void setId(String id) {this.id = id;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAddress(String address) {this.address = address;}

}

