package app2;

public class Person {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phone;

    //constructor
    public Person() {
        this.id = 1;
        this.name = "Default Name";
        this.age = 18;
        this.gender = "Unknown";
        this.email = "default@example.com";
        this.phone = "0000000000";
    }
    public Person(int id, String name, int age, String gender, String email, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    // Setter
    public void setId(int id) throws Exception {
        if (id <= 0) {
            throw new Exception("ID must be positive.");
        }
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("age must be more than 18 .");
        }
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Getter
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

    // Overloaded method to update person details
    public void updateDetails(String name, int age) throws Exception {
        this.setName(name);
        this.setAge(age);
    }
    public void updateDetails(String name, int age, String email) throws Exception {
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }

    // Function to override in anther classes
    public void show() {
        System.out.println("Person Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
