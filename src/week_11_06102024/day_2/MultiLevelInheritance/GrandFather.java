package week_11_06102024.day_2.MultiLevelInheritance;

public class GrandFather {

    private String grandFatherName;

    // Constructor
    public GrandFather(String grandFatherName) {
        setGrandFatherName(grandFatherName);
    }

    // Getters
    public String getGrandFatherName() {
        return grandFatherName;
    }

    private void setGrandFatherName(String grandFatherName) {
        this.grandFatherName = grandFatherName;
    }
}
