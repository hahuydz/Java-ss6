public class PTIT_CNTT3_IT203_SS6_Bai5 {
    public static class Book {

        private String title;
        private String author;
        private double price;


        public Book(String title, String author, double price) {

            this.title = title;
            this.author = author;
            this.price = price;
        }


        public void displayBook() {

            System.out.println("Sách: " + this.title + " | Tác giả: " + this.author + " | Giá: " + this.price);
        }

        public static void main(String[] args) {

            Book b1 = new Book("Lập trình Java OOP", "Lê Đức Anh", 150000);

            Book b2 = new Book("Cấu trúc dữ liệu", "Nguyễn Văn A", 120000);

            System.out.println("Thông tin sách trong hệ thống:");
            b1.displayBook();
            b2.displayBook();
        }
    }


}

