public class PTIT_CNTT2_IT203_SS6_Bai4 {
    public static class Employee {
        private String id;
        private String name;
        private double salary;

        public Employee() {
            this.id = "Chưa xác định";
            this.name = "Chưa xác định";
            this.salary = 0.0;
        }


        public Employee(String id, String name) {
            this.id = id;
            this.name = name;
            this.salary = 500.0;
        }


        public Employee(String id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }


        public void displayInfo() {
            System.out.println("---------------------------");
            System.out.println("Mã NV: " + id);
            System.out.println("Tên NV: " + name);
            System.out.println("Lương: $" + salary);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();

        Employee emp2 = new Employee("NV01", "Nguyễn Văn A");

        Employee emp3 = new Employee("NV02", "Trần Thị B", 1500.0);

        System.out.println("DANH SÁCH NHÂN VIÊN:");
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}

