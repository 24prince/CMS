
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prince Giri
 */
public class result extends javax.swing.JInternalFrame {
    Connect c=new Connect();
    public result() {
        initComponents();
    }

    
    public void subjects()
    {
        String course = jTextField5.getText();
        String semester=jTextField6.getText();
        if(course.equalsIgnoreCase("BCA") && semester.equals("I"))
        {
            jTextField7.setText("MATHS 1");
            jTextField8.setText("PROGRAMMING PRINCIPLES ");
            jTextField9.setText("COMPUTER FUNDAMENTALS");
            jTextField10.setText("PRINCIPLE OF MANAGEMENT");
            jTextField11.setText("BUSINESS MANAGEMENT");
            
        }

        if(course.equalsIgnoreCase("BCA") && semester.equals("II"))
        {
            jTextField7.setText("MATHS 2");
            jTextField8.setText("C PROGRAMMING");
            jTextField9.setText("ORGANISATIONAL BEHAVIOUR");
            jTextField10.setText("DIGITAL ELCTRONICS");
            jTextField11.setText("FUNDAMENTAL ACCOUNTING");
            
        }

        if(course.equalsIgnoreCase("BCA") && semester.equals("III"))
        {
            jTextField7.setText("OOPS CONCEPT");
            jTextField8.setText("DATA STRUCTURES");
            jTextField9.setText("COMPUTER ARCHITECTURE");
            jTextField10.setText("BUSINESS ECONOMICS");
            jTextField1.setText("STATISTICS");
            
        }

        if(course.equalsIgnoreCase("BCA") && semester.equals("IV"))
        {
            jTextField7.setText("CGMA");
            jTextField8.setText("OS");
            jTextField9.setText("SE");
            jTextField10.setText("OT");
            jTextField11.setText("MATHS 3");
            
        }

        if(course.equalsIgnoreCase("BCA") && semester.equals("V"))
        {
            jTextField7.setText("DBMS");
            jTextField8.setText("JAVA");
            jTextField9.setText("NETWORKING");
            jTextField10.setText("NUMERICAL METHODS");
            jTextField11.setText("MINOR PROJECT");
//            jTextField11.hide();
        }

        if(course.equalsIgnoreCase("BCA") && semester.equals("VI"))
        {
            jTextField7.setText("NETWORK SECURITY");
            jTextField8.setText("INFORMATION SYSTEM");
            jTextField9.setText("E-COMMERCE");
            jTextField10.setText("KNOWLEDGE MANAGEMENT");
            
        }

        if(course.equalsIgnoreCase("BBA") && semester.equals("I"))
        {
            jTextField7.setText("BUSINESS ORGANISATION");
            jTextField8.setText("BUSINESS MATHEMATICS");
            jTextField9.setText("BOOK KEEPING AND ACCOUNTING");
            jTextField10.setText("BUSINESS LAWS");
            jTextField11.setText("FUNDAMENTAL OF MANAGEMENT");
            
        }

        if(course.equalsIgnoreCase("BBA") && semester.equals("II"))
        {
            jTextField7.setText("OB");
            jTextField8.setText("BC");
            jTextField9.setText("INDIAN ECONMY");
            jTextField10.setText("BUSINESS STATISTICS");
            jTextField11.setText("BUSINESS ENVIRONMENT");
            
        }

        if(course.equals("BBA") && semester.equals("III"))
        {
            jTextField7.setText("ADVERTISING MANAGEMENT");
            jTextField8.setText("INDIaN BANKING SYSTEM");
            jTextField9.setText("HR MANAGEMENT");
            jTextField10.setText("MARKETING MANAGEMENT");
            jTextField11.setText("ACCOUNTS");
            
        }

        if(course.equals("BBA") && semester.equals("IV"))
        {
            jTextField7.setText("CONSUMER BEHAVIOUR");
            jTextField8.setText("FINANCIAL MANAGEMENT");
            jTextField9.setText("PRODUCTION MANAGEMENT");
            jTextField10.setText("SALES MANAGEMENT");
            jTextField11.setText("RESEARCH METHODOLOGY ");
            
        }

        if(course.equals("BBA") && semester.equals("V"))
        {
            jTextField7.setText("MANAGERIAL ECONOMICS");
            jTextField8.setText("BUSINESS MANAGEMENT");
            jTextField9.setText("INCOME TAX");
            jTextField10.setText("COST & MANAGEMENT ACCOUNTING");
            jTextField11.setText("INDUSTRIAL LAW");
            
        }

        if(course.equals("BBA") && semester.equals("VI"))
        {
            jTextField7.setText("INTERNATIONAL TRADE");
            jTextField8.setText("STRETAGIC MANAGEMENT");
            jTextField9.setText("VAT & SERVICE TAX");
            jTextField10.setText("MANAGEMENT INFORMATION SYSTEM");
            jTextField11.setText("AUDITING");
            
        }

        if(course.equals("BJMC") && semester.equals("I"))
        {
            jTextField7.setText("MASS COMMUNICATION");
            jTextField8.setText("COMPUTER BASICS");
            jTextField9.setText("VALUE EDUCATION");
            jTextField10.setText("GENERAL HINDI");
            jTextField11.setText("VIVA");
            
        }

        if(course.equals("BJMC") && semester.equals("II"))
        {
            jTextField7.setText("INTRO. TO JOURNALISM");
            jTextField8.setText("INDIAN POLITICAL SYSTEM");
            jTextField9.setText("INDAIN SOCIAL SYSTEM");
            jTextField10.setText("GENERAL ENGLISH");
            jTextField11.setText("VIVA");
            
        }

        if(course.equals("BJMC") && semester.equals("III"))
        {
            jTextField7.setText("PRINT MEDIA I");
            jTextField8.setText("INDIAN ECONOMIC SYSTEM");
            jTextField9.setText("ELECTRONIC MEDIA I");
            jTextField10.setText("MEDIA LAWS");
            jTextField11.setText("VIVA");
            
        }

        if(course.equals("BJMC") && semester.equals("IV"))
        {
            jTextField7.setText("PRINT MEDIA II");
            jTextField8.setText("SOCIAL MEDIA");
            jTextField9.setText("PUBLIC RELATIONS");
            jTextField10.setText("ELCTRONIC MEDIA II");
            jTextField11.setText("VIVA");
            
        }

        if(course.equals("BJMC") && semester.equals("V"))
        {
            jTextField7.setText("ADVERTISING");
            jTextField8.setText("DEVELOPMENT COMMUNICATION");
            jTextField9.setText("MASS MEDIA WRITING SKILLS");
            jTextField10.setText("DIGITAL JOURNALISM");
            jTextField11.setText("VIVA");
            
        }

        if(course.equals("BJMC") && semester.equals("VI"))
        {
            jTextField7.setText("PRACTICAL-VIVA (PRINT MEDIA)");
            jTextField8.setText("PRACTICAL-VIVA (RADIO)");
            jTextField9.setText("PRACTICAL-VIVA (TV)");
            jTextField10.setText("PRACTICAL-VIVA (NEW MEDIA)");
            jTextField11.setText("VIVA");
            
        }

        if(course.equals("BCOM") && semester.equals("1ST"))
        {
            jTextField7.setText("BUSINESS COMMUNICATION");
            jTextField8.setText("BUSINESS STATISTICS");
            jTextField9.setText("FINANCIAL ACCOUNTING");
            jTextField10.setText("REGULATORY FRAMEWORK");
            jTextField11.setText("BUSINESS ECONIMICS");
            
        }

        if(course.equals("BCOM") && semester.equals("2ND"))
        {
            jTextField7.setText("COMPANY LAW");
            jTextField8.setText("COST ACCOUNTING");
            jTextField9.setText("BUSINESS MANAGEMENT");
            jTextField10.setText("INCOME TAX");
            jTextField11.setText("INTRO. TO ENTREPRENEURSHIP");
            
        }

        if(course.equals("BCOM") && semester.equals("3RD"))
        {
            jTextField7.setText("CORPORATE ACCOUNTING");
            jTextField8.setText("AUDITING");
            jTextField9.setText("PRINCIPLE OF MARKETING");
            jTextField10.setText("ECONOMICS LAWS");
            jTextField11.setText("MANAGEMENT ACCOUNTING");
            
        }
    }
    
//    public void check(String s1,String s2,String s3,String s4,String s5)
//    {
//        int s_1=Integer.parseInt(s1);
//        int s_2=Integer.parseInt(s2);
//        int s_3=Integer.parseInt(s3);
//        int s_4=Integer.parseInt(s4);
//        int s_5=Integer.parseInt(s5);
//        
//        if(s_1<33)
//        {
//            jTextArea1.setText("sub1 is not qualified by you.");
//        }
//        if(s_2<33)
//        {
//            String s=jTextArea1.getText();
//            String new_s=s.concat("\nsub2 is not qualified by you.");
//            jTextArea1.setText(new_s);
//        }
//        if(s_3<33)
//        {
//            String s=jTextArea1.getText();
//            String new_s=s.concat("\nsub3 is not qualified by you.");
//            jTextArea1.setText(new_s);            
//        }
//        if(s_4<33)
//        {
//            String s=jTextArea1.getText();
//            String new_s=s.concat("\nsub4 is not qualified by you.");
//            jTextArea1.setText(new_s);
//        }
//        if(s_5<33)
//        {
//            String s=jTextArea1.getText();
//            String new_s=s.concat("\nsub5 is not qualified by you.");
//            jTextArea1.setText(new_s);
//        }
//        if(s_1>=33 && s_2>=33 && s_3>=33 && s_4>=33 && s_5>=33)
//        {
//            jTextArea1.setText("Congratulations!!!");
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setForeground(new java.awt.Color(204, 255, 255));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("RESULT");
        setToolTipText("");
        setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("NAME");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("YOUR ID*");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("CHECK RESULT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("RESULT");

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUB1", "SUB2", "SUB3", "SUB4", "SUB5", "TOTAL MARKS"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("FATHER's NAME");

        jTextField3.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("DOB");

        jTextField4.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("COURSE");

        jTextField5.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("SEMESTER");

        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("SUB1");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("SUB2");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("SUB3");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("SUB4");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("SUB5");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Download as PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1032, 1032, 1032)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField5)
                        .addGap(669, 669, 669))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
                .addGap(327, 327, 327))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField1, jTextField3, jTextField4, jTextField5, jTextField6});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int i=0;
        String id=jTextField2.getText();
        String name=null;
        String fname=null;
        String course=null;
        String sem=null;
        String dob=null;
        

        try
        {
            
            Connection con = c.connect();
            Statement st=con.createStatement();
            java.sql.ResultSet rs=st.executeQuery("Select * from student_details");
            while (rs.next())
            {
                if(id.equals(rs.getString("id")))
                {
                    
                    name=rs.getString("full_name");
                    fname=rs.getString("father_name");
                    dob=rs.getString("dob");
                    course=rs.getString("course");
                    sem="V";
                    
                    jTextField1.setText(name);
                    jTextField3.setText(fname);
                    jTextField4.setText(dob);
                    jTextField5.setText(course);
                    jTextField6.setText(sem);
                    
                    i=1;
                    break;
                }
            }
            if(i==1)
            {
                java.sql.PreparedStatement p=con.prepareStatement("select * from result_upload where id=?;");
                p.setString(1,id);
                java.sql.ResultSet r=p.executeQuery();
                subjects();
                jTable1.setModel(DbUtils.resultSetToTableModel(r));
            }
            else
            {
                jLabel5.setText("Result Status");
                jLabel6.setText("Not Found");
                JOptionPane.showMessageDialog(rootPane,"not found");
            }
            System.out.println("data retrieved successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ResultDownload rd=new ResultDownload(jTextField7.getText(),jTextField8.getText(),jTextField9.getText(),jTextField10.getText(),jTextField11.getText());
        rd.setVisible(true);
        rd.toFront();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
