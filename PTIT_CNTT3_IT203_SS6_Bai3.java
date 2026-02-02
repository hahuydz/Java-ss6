public class PTIT_CNTT3_IT203_SS6_Bai3 {
    public static  class Product{
        private String productID;
        private String productName;
        private double price;

        public Product(String productID, String productName, double price) {
            this.productID = productID;
            this.productName = productName;
            setPrice(price);
        }


        public String getProductID() {
            return productID;
        }
        public void setProductID(String productID) {
            this.productID = productID;
        }


        public String getProductName() {
            return productName;
        }
        public void setProductName(String productName) {
            this.productName = productName;
        }


        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("Lỗi: Giá bán phải lớn hơn 0! (Giữ nguyên giá cũ)");
            }
        }

        public double getPrice() {
            return price;
        }


        public void displayProduct() {
            System.out.println("Sản phẩm: " + productName + " | Mã: " + productID + " | Giá: " + price);
        }

        public static void main(String[] args) {

            Product p = new Product("P001", "Laptop Gaming", 1500.0);
            p.displayProduct();

            System.out.println("\n--- Thử đặt giá -100 ---");
            p.setPrice(-100);
            p.displayProduct();

            System.out.println("\n--- Cập nhật giá mới 1800 ---");
            p.setPrice(1800);
            p.displayProduct();
        }
    }



}

