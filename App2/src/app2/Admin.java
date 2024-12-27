package app2;

public class Admin extends Person {

    private String password;

    //Constructor
    public Admin() {
        super();
        this.password = "Admin12345";
    }
    public Admin(int id, String name, int age, String gender, String email, String phone, String pass) throws Exception {
        super(id, name, age, gender, email, phone);
        this.password = pass;
    }

    // Setter
    public String setPassword(String pass) throws Exception {
        if (pass.length() < 6) {
            throw new Exception("Password must be greater than 6 characters");
        }
        this.password = pass;
        return this.password;
    }

    // Getter
    public String getPassword() {
        return password;
    }

    // Some Function
    public void Show() {
        super.show();
        System.out.println("password: " + password);

    }
}
