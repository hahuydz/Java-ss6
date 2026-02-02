public class PTIT_CNTT3_IT203_SS06_Bai1 {
    public static class Student{
        String id;
        String name;
        int age;
        double avg;

        public Student( String id, String name, int age, double avg){
            this.id = id;
            this.name = name;
            this.age = age;
            this.avg = avg;
        }

        public void displayInfo(){
            System.out.printf("Ma SV:"+ id);
            System.out.printf("Ten SV:"+ name);
            System.out.printf("Nam Sinh SV:"+ age);
            System.out.printf("Diem Trung Binh SV:"+ avg);
        }

    }
    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Lê Đức Anh", 2005, 8.5);
        Student sv2 = new Student("SV002", "Nguyễn Văn B", 2006, 7.0);

        System.out.println("DANH SÁCH SINH VIÊN:");
        sv1.displayInfo();
        sv2.displayInfo();
    }

}



