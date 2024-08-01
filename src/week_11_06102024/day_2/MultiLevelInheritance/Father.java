package week_11_06102024.day_2.MultiLevelInheritance;

public class Father extends GrandFather {
        private String fatherName;

        // Constructor
        public Father(String grandFatherName, String fatherName) {
            super(grandFatherName);
            this.fatherName = fatherName;
        }

        public String getFatherName() {
            return fatherName;
        }

        private void setFatherName(String fatherName) {
            this.fatherName = fatherName;
        }
    }
