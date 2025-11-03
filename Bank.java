class Account {
    public String name;
    protected String email;
    private String password;

    // Getter
    public String getPassword() {
        return this.password;
    }

    // Setter
    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "HDFC Bank";
        account1.email = "hdfcbank@gmail.com";
        account1.setPassword("Ram@123");
        System.out.println(account1.getPassword());
        System.out.println(account1.name );
    }
}
