package app2;

public class Student_c extends Person {
    private int level;
    private double gpa;
    private String department;

    //Constructor
    public Student_c() {
        super();
        this.level = 1;
        this.gpa = 0.0;
        this.department = "Undeclared";
    }
    public Student_c(int id, String name, int age, String gender, String email, String phone, int level, double gpa, String department) throws Exception {
        super(id, name, age, gender, email, phone);
        this.level=level;
        this.gpa=gpa;
        this.department = department;
    }

    //Setter
    public void setLevel(int level) throws Exception {
        if (level < 1 || level > 4) {
            throw new Exception("Level must be between 1 and 4.");
        }
        this.level = level;
    }
    public void setGpa(double gpa) throws Exception {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new Exception("GPA must be between 0.0 and 4.0.");
        }
        this.gpa = gpa;
    }
    public void setDepartment(String department) throws Exception {
        if (department == null || department.isEmpty()) {
            throw new Exception("Department cannot be null or empty.");
        }
        this.department = department;
    }

    //Getters
    public int getLevel() {
        return level;
    }
    public double getGpa() {
        return gpa;
    }
    public String getDepartment() {
        return department;
    }

    public void Show() {
        super.show(); 
        System.out.println("Level: " + level);
        System.out.println("GPA: " + gpa);
        System.out.println("Department: " + department);
    }
}
