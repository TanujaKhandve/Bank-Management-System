package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
   
    JTextField pan, aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;
    
 SignupTwo(String formno){
   this.formno=formno;
     setLayout(null);                //Only setbounds will not work ,we need to use setlayout
    
    setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
   

    JLabel additionalDetails=new JLabel("Page 2: Additional Details");
    additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
    additionalDetails.setBounds(290,80,400,30);           
    add(additionalDetails);
    
    JLabel name=new JLabel("Religion: ");
    name.setFont(new Font("Raleway",Font.BOLD,20));
    name.setBounds(100,140,100,30);           
    add(name);
    String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
    religion=new JComboBox(valReligion);
    religion.setBounds(300, 140, 400, 30);
    religion.setBackground(Color.white);
    add(religion);
    
   /* nameTextField=new JTextField();
    nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    nameTextField.setBounds(300, 140, 400, 30);
    add(nameTextField);*/
    
    JLabel fname=new JLabel("Category: ");
    fname.setFont(new Font("Raleway",Font.BOLD,20));
    fname.setBounds(100,190,200,30);           
    add(fname);
    
    String valCategory[]={"General","OBC","SC","ST","OTHER"};
    category=new JComboBox(valCategory);
    category.setBounds(300, 190, 400, 30);
    category.setBackground(Color.white);
    add(category);
    
    JLabel dob=new JLabel("Income: ");
    dob.setFont(new Font("Raleway",Font.BOLD,20));
    dob.setBounds(100,240,200,30);           
    add(dob);
    
    String incomeCategory[]={"NULL","<1,50,000",">2,50,000","<5,00,000","Upto 10,00,000"};
    income=new JComboBox(incomeCategory);
    income.setBounds(300, 240, 400, 30);
    income.setBackground(Color.white);
    add(income);
    
  /* dateChooser=new JDateChooser();
   dateChooser.setBounds(300,240,400,30);
   dateChooser.setForeground(new Color(105,105,105));
   add(dateChooser);
    */
    
    JLabel educations=new JLabel("Educational: ");
    educations.setFont(new Font("Raleway",Font.BOLD,20));
    educations.setBounds(100,290,200,30);           
    add(educations);
    
   
    
    JLabel qualification=new JLabel("Qualification: ");
    qualification.setFont(new Font("Raleway",Font.BOLD,20));
    qualification.setBounds(100,315,200,30);           
    add(qualification);
    
    String educationValues[]={"Non-Graduation","Graduate","Post-Graduation","Doctrate","Others"};
    education=new JComboBox(educationValues);
    education.setBounds(300, 315, 400, 30);
    education.setBackground(Color.white);
    add(education);
    
    
    
    JLabel Occupations=new JLabel("Occupation: ");
    Occupations.setFont(new Font("Raleway",Font.BOLD,20));
    Occupations.setBounds(100,390,200,30);           
    add(Occupations);
    
    String occupationValues[]={"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
    occupation=new JComboBox(occupationValues);
    occupation.setBounds(300, 390, 400, 30);
    occupation.setBackground(Color.white);
    add(occupation);
    
    
    
    
    JLabel address=new JLabel("PAN Number: ");
    address.setFont(new Font("Raleway",Font.BOLD,20));
    address.setBounds(100,440,200,30);           
    add(address);
    
    pan=new JTextField();
    pan.setFont(new Font("Raleway",Font.BOLD,14));
    pan.setBounds(300, 440, 400, 30);
    add(pan);
    
    JLabel city=new JLabel("Adhar Number: ");
    city.setFont(new Font("Raleway",Font.BOLD,20));
    city.setBounds(100,490,200,30);           
    add(city);
    
    aadhar=new JTextField();
    aadhar.setFont(new Font("Raleway",Font.BOLD,14));
    aadhar.setBounds(300, 490, 400, 30);
    add(aadhar);
    
    JLabel state=new JLabel("Senior Citizen: ");
    state.setFont(new Font("Raleway",Font.BOLD,20));
    state.setBounds(100,540,300,30);           
    add(state);
    
    syes=new JRadioButton("yes");
    syes.setBounds(300,540,100,30);
    syes.setBackground(Color.white);
    add(syes);
    
    sno=new JRadioButton("No");
    sno.setBounds(450,540,100,30);
    sno.setBackground(Color.white);
    add(sno);
    
    ButtonGroup emaritalgroup=new ButtonGroup();
    emaritalgroup.add(syes);
    emaritalgroup.add(sno);
    
  /*  stateTextField=new JTextField();
    stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
    stateTextField.setBounds(300, 540, 400, 30);
    add(stateTextField);*/
    
    JLabel pincode=new JLabel("Existing Account: ");
    pincode.setFont(new Font("Raleway",Font.BOLD,20));
    pincode.setBounds(100,590,300,30);           
    add(pincode);
    
    eyes=new JRadioButton("yes");
    eyes.setBounds(300,590,100,30);
    eyes.setBackground(Color.white);
    add(eyes);
    
    eno=new JRadioButton("No");
    eno.setBounds(450,590,100,30);
    eno.setBackground(Color.white);
    add(eno);
    
   ButtonGroup maritalgroup=new ButtonGroup();
    maritalgroup.add(eyes);
    maritalgroup.add(eno);
    
    /*pincodeTextField=new JTextField();
    pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
    pincodeTextField.setBounds(300, 590, 400, 30);
    add(pincodeTextField);*/
    
    next=new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway",Font.BOLD,14));
    next.setBounds(620,660,80,30);
    next.addActionListener(this);
    add(next);    
    
    getContentPane().setBackground(Color.white);
    setSize(850,800);
    setLocation(350,10);
    setVisible(true);
    
}
 
 public void actionPerformed(ActionEvent ae){
     
    // String formno=first; //long
     String sreligion=(String)religion.getSelectedItem();
     String scategory =(String)category.getSelectedItem();
     String sincome=(String)income.getSelectedItem();
     String seducation=(String)education.getSelectedItem();
     String soccupation=(String)occupation.getSelectedItem();
     String seniercitizen=null;

     
     if(syes.isSelected()){
        seniercitizen ="Yes";
     }else if(sno.isSelected()){
         seniercitizen="No";
     }
     
     //String email=emailTextField.getText();
     String existingaccount=null;
     if(eyes.isSelected()){
         existingaccount="Yes";
     }else if(eno.isSelected()){
         existingaccount="No";
     }
     String span=pan.getText();
     String saadhar=aadhar.getText();
     
     
     try{
        
            Conn c=new Conn();
            String query="insert into signupTwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniercitizen+"','"+existingaccount+"')";
            c.s.executeUpdate(query);
         
            //signup3 object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
            
            
     }catch(Exception e){
         System.out.println(e);
     }
     

     
     
 }
       public static void main(String args[]) {
        new SignupTwo("");
    }
}
