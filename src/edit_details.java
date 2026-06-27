import javax.swing.*;
import java.sql.*;

public class edit_details extends javax.swing.JFrame 
{
    
    public static String id="";
    public static String category="";
    
    public edit_details() {
        initComponents();        
        get_details();
    }
    
    public edit_details(String id,String category) 
    {        
        initComponents();        
        this.id=id;
        this.category=category;
        switch(category)
        {
            case "Student":
                get_details();
                break;
            case "Teacher":
                System.out.println("teacher");
                get_teacher_details();
                break;
        }
    }
    
    String name;
    String fname;
    String mname;
    String email;
    String mobile;
    String address;

    String full_name;
    String father_name;
    String mother_name;
    String date_of_birth;
    String mobile_no;
    String email_id;
    String address1;
    
    Connect c=new Connect();
    
    void get_details()
    {
        try
        {
            Connection con=c.connect();
            PreparedStatement p=con.prepareStatement("select full_name,father_name,mother_name,dob,email,address1,mobile from student_details where id=?");
            p.setString(1,id);
            ResultSet rs=p.executeQuery();
            while(rs.next())
            {
                full_name=rs.getString("full_name");
                father_name=rs.getString("father_name");
                mother_name=rs.getString("mother_name");
                date_of_birth=rs.getString("dob");
                email_id=rs.getString("email");
                mobile_no=rs.getString("mobile");
                address1=rs.getString("address1");
            }
            jTextField1.setText(full_name);
            jTextField2.setText(date_of_birth);
            jTextField3.setText(father_name);
            jTextField4.setText(mother_name);
            jTextField5.setText(email_id);
            jTextField6.setText(mobile_no);
            jTextField7.setText(address1);            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    void get_teacher_details()
    {
        try
        {
            Connection con=c.connect();
            PreparedStatement p=con.prepareStatement("select name,father_name,mother_name,dob,email,address1,mobile1 from teacher_signup where id=?");
            p.setString(1,id);
            ResultSet rs=p.executeQuery();
            while(rs.next())
            {
                full_name=rs.getString("name");
                father_name=rs.getString("father_name");
                mother_name=rs.getString("mother_name");
                date_of_birth=rs.getString("dob");
                email_id=rs.getString("email");
                mobile_no=rs.getString("mobile1");
                address1=rs.getString("address1");
            }
            jTextField1.setText(full_name);
            jTextField2.setText(date_of_birth);
            jTextField3.setText(father_name);
            jTextField4.setText(mother_name);
            jTextField5.setText(email_id);
            jTextField6.setText(mobile_no);
            jTextField7.setText(address1);            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    void update_name()
    {
        name=JOptionPane.showInputDialog("ENTER YOUR NAME"); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField1.setText(name);
        if(a==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");  
            try
            {                
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update student_details set name=? where id=?");
                ps.setString(1, name);
                ps.setString(2, id);
                ps.executeUpdate();

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        } 
    }
    void update_teacher_name()
    {
        name=JOptionPane.showInputDialog("ENTER YOUR NAME"); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField1.setText(name);
        if(a==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");  
            try
            {                
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update teacher_signup set name=? where id=?");
                ps.setString(1, name);
                ps.setString(2, id);
                ps.executeUpdate();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        } 
    }

    void update_father_name()
    {
        fname=JOptionPane.showInputDialog("ENTER YOUR FATHER'S NAME"); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField3.setText(fname);
        if(a==JOptionPane.YES_OPTION)
        {
            try
            {                
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update student_details set father_name=? where id=? ");
                ps.setString(1,fname);
                ps.setString(2, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");
            }

            catch(Exception e)
            {
                System.out.println(e);
            }
        } 
    }
    
    void update_teacher_father_name()
    {
        fname=JOptionPane.showInputDialog("ENTER YOUR FATHER'S NAME"); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField3.setText(fname);
        if(a==JOptionPane.YES_OPTION)
        {
            try
            {                
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update teacher_signup set father_name=? where id=? ");
                ps.setString(1,fname);
                ps.setString(2, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");
            }

            catch(Exception e)
            {
                System.out.println(e);
            }
        } 
    }
        
    void update_mother_name()
    {
       mname=JOptionPane.showInputDialog("ENTER YOUR FATHER'S NAME"); 
       int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
       jTextField4.setText(mname);
       if(a==JOptionPane.YES_OPTION)
       {
            try
            {               
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update student_details set mother_name=? where id=? ");
                ps.setString(1,mname);
                ps.setString(2, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }  
    }
    
    void update_teacher_mother_name()
    {
       mname=JOptionPane.showInputDialog("ENTER YOUR FATHER'S NAME"); 
       int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
       jTextField4.setText(mname);
       if(a==JOptionPane.YES_OPTION)
       {
            try
            {               
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update teacher_signup set mother_name=? where id=? ");
                ps.setString(1,mname);
                ps.setString(2, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }  
    }
    
    void update_mobile()
    {
        mobile=JOptionPane.showInputDialog("ENTER YOUR MOBILE NUMBER"); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField6.setText(mobile);
        if(a==JOptionPane.YES_OPTION)
        {
            try
            {               
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update student_deatails set mobile=? where id=?");
                ps.setString(1, mobile);
                ps.setString(2, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    
    void update_teacher_mobile()
    {
        mobile=JOptionPane.showInputDialog("ENTER YOUR MOBILE NUMBER"); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField6.setText(mobile);
        if(a==JOptionPane.YES_OPTION)
        {
            try
            {               
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update student_deatails set mobile=? where id=?");
                ps.setString(1, mobile);
                ps.setString(2, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    void update_address()
    {
        address=JOptionPane.showInputDialog("ENTER YOUR ADDRESS"); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField7.setText(address);
        if(a==JOptionPane.YES_OPTION)
        {
            
            try
            {
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update student_details set address=? where id=?");
                ps.setString(1,address);
                ps.setString(2, id);
                ps.executeUpdate();    
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");
            }
            catch(Exception e)
            {
               System.out.println(e);
            }
        } 
    }
    
    void update_teacher_address()
    {
        address=JOptionPane.showInputDialog("ENTER YOUR ADDRESS"); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField7.setText(address);
        if(a==JOptionPane.YES_OPTION)
        {
            
            try
            {
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update student_details set address=? where id=?");
                ps.setString(1,address);
                ps.setString(2, id);
                ps.executeUpdate();    
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");
            }
            catch(Exception e)
            {
               System.out.println(e);
            }
        } 
    }
    
    void update_email()
    {
        email=JOptionPane.showInputDialog("ENTER YOUR EMAIL"); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField5.setText(email);
        if(a==JOptionPane.YES_OPTION)
        {
            try
            {                
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update student_det set email=? where id=?");
                ps.setString(1,email);
                ps.setString(2, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");
            }
            catch(Exception e)
            {
               System.out.println(e);
            }
        } 
    }
    
    void update_teacher_email()
    {
        email=JOptionPane.showInputDialog("ENTER YOUR EMAIL"); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField5.setText(email);
        if(a==JOptionPane.YES_OPTION)
        {
            try
            {                
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update student_det set email=? where id=?");
                ps.setString(1,email);
                ps.setString(2, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");
            }
            catch(Exception e)
            {
               System.out.println(e);
            }
        } 
    }
    
    void update_dob()
    {
        String dob=JOptionPane.showInputDialog("ENTER YOUR DATE OF BIRTH\nShould be in (DD/MM/YYYY) this format."); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField2.setText(dob);
        if(a==JOptionPane.YES_OPTION)
        {
            try
            {                
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update student_update set dob=? where id=?");
                ps.setString(1, dob);
                ps.setString(2, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");  

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        } 
    }

    void update_teacher_dob()
    {
        String dob=JOptionPane.showInputDialog("ENTER YOUR DATE OF BIRTH\nShould be in (DD/MM/YYYY) this format."); 
        int a=JOptionPane.showConfirmDialog(this, "ARE YOU SURE","CONFIRM BOX",JOptionPane.OK_CANCEL_OPTION);
        jTextField2.setText(dob);
        if(a==JOptionPane.YES_OPTION)
        {
            try
            {                
                Connection con=c.connect();
                PreparedStatement ps=con.prepareStatement("update student_update set dob=? where id=?");
                ps.setString(1, dob);
                ps.setString(2, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "DATA UPDATED SUCCESSFULLY");  

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        } 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("EDIT PROFILE");

        jButton4.setBackground(new java.awt.Color(0, 204, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton5.setText("Edit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 204, 204));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton6.setText("Edit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 204, 204));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton7.setText("Edit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Date Of Birth");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Father's Name");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Mother's Name");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Email");

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Mobile Number");

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Address");

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton8.setBackground(new java.awt.Color(204, 204, 0));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("Cancel");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 204, 0));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setText("Save Changes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(93, 93, 93))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)))
                        .addGap(22, 22, 22)))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField1, jTextField2, jTextField3, jTextField4, jTextField5, jTextField6, jTextField7});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        switch(category)
        {
            case "Student":
                update_name();
                break;
            case "Teacher":
                update_teacher_name();
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        update_dob();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        update_father_name();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        update_mother_name();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        update_email();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        update_mobile();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        update_address();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        setting s=new setting();
        s.show();
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(edit_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
