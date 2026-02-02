public class PTIT_CNTT3_IT203_SS6_Bai2 {
    public static class Account{
        String username;
        String password;
        String email;

        public Account(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public void changePassword(String newPassword){
            this.password = newPassword;
        }

        public void displayProfile(){
            System.out.printf("username :"+ username);
            System.out.printf("password :");
            System.out.printf("email :" + email);
        }
    }

    public static void main(String[] args) {
        Account myAcc = new Account("ducanh_ptit", "123456", "ducanh@example.com");

        System.out.println("Thông tin trước khi đổi mật khẩu:");
        myAcc.displayProfile();

        myAcc.changePassword("ducanh_ptit");
        System.out.println("Thông tin sau khi đổi mật khẩu:");
        myAcc.displayProfile();
    }
}

