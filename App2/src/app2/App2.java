package app2;

public class App2 {

   
    public static void main(String[] args) {

        Person p = new Person(1, "mohamed", 20, "male", "mohamed@gmail.com", "0101275587");
        p.show();
        System.out.print(" ============================================ \n");
        try {
            p.updateDetails("ali", 80, "dfsf@gmail.com");
        } catch (Exception e) {
            System.out.print(e.getMessage() + "\n");
        }
        p.show();

        //---------------------------------------------------------------//
        try {
            Admin admin = new Admin(2, "AdminName", 30, "female", "admin@example.com", "01012345678", "SecurePass123");
            admin.Show();
            System.out.print(" ============================================ \n");
            admin.setPassword("NewPass456");
            System.out.println("Updated Admin Details:");
            admin.Show();
        } catch (Exception e) {
            System.out.print(e.getMessage() + "\n");
        }

        //---------------------------------------------------------------//
        try {
            Student_c student = new Student_c(3, "Ahmed", 22, "male", "ahmed@student.com", "01098765432", 3, 3.4, "Computer Science");
            student.Show();
            System.out.print(" ============================================ \n");
            student.setLevel(4);
            student.setGpa(3.9);
            student.setDepartment("Information Systems");
            System.out.println("Updated Student Details:");
            student.Show();
        } catch (Exception e) {
            System.out.print(e.getMessage() + "\n");
        }

    }

}
