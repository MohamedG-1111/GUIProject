package app2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Student_Frame extends javax.swing.JFrame {

    String gender;

    
    public Student_Frame() {
        initComponents();
        show_user();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    public ArrayList<Student_c> userList() {
        ArrayList<Student_c> userList = new ArrayList<>();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
            String ql = "select * from students";
            PreparedStatement ps = con.prepareStatement(ql);
            ResultSet rs = ps.executeQuery(ql);
            while (rs.next()) {
                Student_c student;
                student = new Student_c(
                        rs.getInt("id"), // Replace with actual column names
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("gender"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getInt("level"),
                        rs.getDouble("gpa"),
                        rs.getString("department"));
                userList.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    public void show_user() {
        ArrayList<Student_c> List = userList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (Student_c student : List) {
            Object[] row = {
                student.getId(),
                student.getName(),
                student.getAge(),
                student.getGender(),
                student.getEmail(),
                student.getPhone(),
                student.getLevel(),
                student.getGpa(),
                student.getDepartment()
            };
            model.addRow(row);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        fmale = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        tf_phone = new javax.swing.JTextField();
        tf_level = new javax.swing.JTextField();
        tf_gpa = new javax.swing.JTextField();
        tf_department = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        t_search = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("      Student Information");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        tf_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_id.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        tf_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Age");

        tf_age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_age.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        tf_email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_email.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Phone");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Level");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("GPA");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Gender");

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        male.setText("Male");

        buttonGroup1.add(fmale);
        fmale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fmale.setText("Famale");
        fmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmaleActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Department");

        tf_phone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_phone.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_phoneActionPerformed(evt);
            }
        });

        tf_level.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_level.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tf_gpa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_gpa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tf_gpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_gpaActionPerformed(evt);
            }
        });

        tf_department.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf_department.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_add.setBackground(new java.awt.Color(102, 255, 102));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(51, 51, 51));
        btn_add.setText("Add");
        btn_add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(102, 255, 255));
        btn_reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(51, 51, 51));
        btn_reset.setText("Reset");
        btn_reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Email", "phone", "Level", "Gpa", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        btn_update.setBackground(new java.awt.Color(255, 255, 0));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(51, 51, 51));
        btn_update.setText("Update");
        btn_update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 51, 51));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(51, 51, 51));
        btn_delete.setText("Delete");
        btn_delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("Search");
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        t_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        t_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t_searchMouseExited(evt);
            }
        });
        t_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_searchActionPerformed(evt);
            }
        });
        t_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_level, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(11, 11, 11))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_department, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tf_gpa)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(tf_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                                            .addComponent(tf_age)
                                                            .addComponent(tf_email)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(t_search, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 1, Short.MAX_VALUE)))))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fmale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(t_search, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_gpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tf_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fmale)
                            .addComponent(male)
                            .addComponent(jLabel9))
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idActionPerformed

    private void fmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmaleActionPerformed

    private void tf_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_phoneActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        try {

            // Create a Student object
            Student_c student = new Student_c();
            try {

                // Populate Student object from input fields
                student.setId(Integer.parseInt(tf_id.getText().trim()));
                student.setName(tf_name.getText().trim());
                student.setAge(Integer.parseInt(tf_age.getText()));
                student.setEmail(tf_email.getText().trim());
                student.setPhone(tf_phone.getText());
                student.setLevel(Integer.parseInt(tf_level.getText().trim()));
                student.setGpa(Double.parseDouble(tf_gpa.getText().trim()));
                student.setDepartment(tf_department.getText().trim());

            } catch (Exception e) {

                e.printStackTrace();
                JOptionPane.showMessageDialog(this,
                        "An unexpected error occurred: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                throw e;
            }

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
            String checkIdSql = "SELECT COUNT(*) FROM students WHERE id = ?";
            PreparedStatement checkIdStmt = con.prepareStatement(checkIdSql);
            checkIdStmt.setInt(1, student.getId());
             ResultSet rs = checkIdStmt.executeQuery();
             if (rs.next() && rs.getInt(1) > 0) {
                  JOptionPane.showMessageDialog(this,
                "Student ID already exists. Please use a different ID.",
                "Validation Error",
                JOptionPane.WARNING_MESSAGE);
               return; // Stop execution if the ID is not unique
            }
    
            String sql = "insert into students(id,name,age,email,phone,level,gpa,gender,department)"
                    + "values(?,?,?,?,?,?,?,?,?) ";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, student.getId());
            pst.setString(2, student.getName());
            pst.setInt(3, student.getAge());
            pst.setString(4, student.getEmail());
            pst.setString(5, student.getPhone());
            pst.setInt(6, student.getLevel());
            pst.setDouble(7, student.getGpa());

            if (male.isSelected()) {
                student.setGender("male");
            }
            if (fmale.isSelected()) {
                student.setGender("fmale");
            }
            pst.setString(8, student.getGender());

            pst.setString(9, student.getDepartment());

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            show_user();

            JOptionPane.showMessageDialog(this, "Inserted Sucessfuly!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        tf_name.setText("");
        tf_email.setText("");
        tf_id.setText("");
        tf_age.setText("");
        tf_department.setText("");
        tf_level.setText("");
        tf_gpa.setText("");
        tf_phone.setText("");
        buttonGroup1.clearSelection();

    }//GEN-LAST:event_btn_resetActionPerformed

    private void tf_gpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_gpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_gpaActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int i = table.getSelectedRow();
        TableModel model = table.getModel();
        tf_id.setText(model.getValueAt(i, 0).toString());
        tf_name.setText(model.getValueAt(i, 1).toString());
        tf_age.setText(model.getValueAt(i, 2).toString());
        tf_email.setText(model.getValueAt(i, 4).toString());
        tf_phone.setText(model.getValueAt(i, 5).toString());
        tf_level.setText(model.getValueAt(i, 6).toString());
        tf_gpa.setText(model.getValueAt(i, 7).toString());
        String sex = model.getValueAt(i, 3).toString();
        if (sex.equals("male")) {
            male.setSelected(true);
        } else {
            fmale.setSelected(true);
        }
        tf_department.setText(model.getValueAt(i, 8).toString());


    }//GEN-LAST:event_tableMouseClicked


    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try {
            // Create a Student object
            Student_c student = new Student_c();
            try {

                // Populate Student object from input fields
                student.setId(Integer.parseInt(tf_id.getText().trim()));
                student.setName(tf_name.getText().trim());
                student.setAge(Integer.parseInt(tf_age.getText()));
                student.setEmail(tf_email.getText().trim());
                student.setPhone(tf_phone.getText());
                student.setLevel(Integer.parseInt(tf_level.getText().trim()));
                student.setGpa(Double.parseDouble(tf_gpa.getText().trim()));
                student.setDepartment(tf_department.getText().trim());

            } catch (Exception e) {

                e.printStackTrace();
                JOptionPane.showMessageDialog(this,
                        "An unexpected error occurred: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                throw e;
            }

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
            //int row =table.getSelectedRow();
            // String value =(table.getModel().getValueAt(row,0).toString());
            String value = tf_id.getText();
            String qls = "update students set id=?,name=?,age=?,email=?,phone=?,level=?,gpa=?,gender=?,department=? where id=" + value;
            PreparedStatement pst = con.prepareStatement(qls);

            pst.setInt(1, student.getId());
            pst.setString(2, student.getName());
            pst.setInt(3, student.getAge());
            pst.setString(4, student.getEmail());
            pst.setString(5, student.getPhone());
            pst.setInt(6, student.getLevel());
            pst.setDouble(7, student.getGpa());

            if (male.isSelected()) {
                student.setGender("male");
            }
            if (fmale.isSelected()) {
                student.setGender("fmale");
            }
            pst.setString(8, student.getGender());

            pst.setString(9, student.getDepartment());

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            show_user();

            JOptionPane.showMessageDialog(null, "Updated Sucessfuly!!");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
            int row = table.getSelectedRow();
            String value = (table.getModel().getValueAt(row, 0).toString());
            String qll = "DELETE FROM students where id=" + value;
            PreparedStatement pst = con.prepareStatement(qll);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            show_user();

            JOptionPane.showMessageDialog(null, "Deleted Sucessfuly!!");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void t_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_searchActionPerformed

    private void t_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_searchKeyReleased
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "");
            String sql = "SELECT *FROM students where id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t_search.getText().trim());
            ResultSet rs = pst.executeQuery();
            // Check if result exists and display the data
            if (rs.next()) {
                // Assuming you have corresponding text fields to show each value
                String seid = rs.getString("id");
                tf_id.setText(seid);
                tf_name.setText(rs.getString("name"));  // Name
                tf_age.setText(String.valueOf(rs.getInt("age")));  // Age
                tf_email.setText(rs.getString("email"));  // Email
                tf_phone.setText(rs.getString("phone"));  // Phone
                tf_level.setText(String.valueOf(rs.getInt("level")));  // Level
                tf_gpa.setText(String.valueOf(rs.getDouble("gpa")));  // GPA
                tf_department.setText(rs.getString("department"));
                String sex = rs.getString("gender");
                if (sex.equals("male")) {
                    male.setSelected(true);
                } else {
                    fmale.setSelected(true);
                }

                JOptionPane.showMessageDialog(null, "Record found!");
            } else {
                JOptionPane.showMessageDialog(null, "No record found with ID: " + t_search.getText(), "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_t_searchKeyReleased

    private void t_searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_searchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_t_searchMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton fmale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField t_search;
    private javax.swing.JTable table;
    private javax.swing.JTextField tf_age;
    private javax.swing.JTextField tf_department;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_gpa;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_level;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_phone;
    // End of variables declaration//GEN-END:variables
}
