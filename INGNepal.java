//* Needed import elements have been imported so as to make GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class INGNepal implements ActionListener //As we will be needing to handle the events in our GUI so we need to implement ActionListener in our class i.e INGNepal
{
    JFrame f;
    
    JPanel p1,p2 ; //making two separate panels for FullTimeStaffHire and PartTimeStaffHire
    
    //JLabels and JTextfields for full time staff hire:
    
    //JLabels::::
    
    JLabel l_FullTime,l_VacancyNumberF,l_DesignationF,l_JobTypeF,l_SalaryF,l_WorkingHourF,l_StaffNameF,l_QualificationF,l_JoiningDateF,l_AppointedByF,l_VacNumAppointF,l_VacNumDisplayF; //"F" at the end of variable name denotes FullTimeStaffHire
    
    //JTextFields::::
    
    JTextField t_VacNumF,t_DesignationF,t_JobTypeF,t_SalaryF,t_WorkingHourF,t_StaffNameF,t_QualificationF,t_JoiningDateF,t_AppointedByF,t_VacNumAppointFullTime,t_VacNumDisplayFullTime;
    
    //JLabels and JTextFields for part time staff hire::::
    
    JLabel l_PartTime,l_VacNumP,l_DesignationP,l_JobTypeP,l_WorkingHourP,l_WorkingShiftsP,l_WagesPerHourP,l_VacNumAoointP,l_StaffNameP,l_QualificationP,l_JoinDateP,l_AppointedByP,l_VacNumTerminateP,l_VacNumDisplayP; //"P" at the end of variable name denotes PartTimeStaffHirE

    JTextField t_VacNumP,t_DesignationP,t_JobTypeP,t_WorkingHourP,t_WorkingShiftsP,t_WagesPerHourP,t_VacNumAppointP,t_StaffNameP,t_QualificationP,t_JoiningDateP,t_AppointedByP,t_VacNumTerminateP,t_VacNumDisplayP;

    //JButtons needed in GUI:
    
    JButton vacancyF,vacancyP,appointF,appointP,terminateP,displayF,clearF,displayP,clearP;

    /*This is the functionality in Java through which we can access the child classes by declaring the data type of arraylist as that of parent class. As our parent class is StaffHire in this project,
     *  we directly gave the data type as StaffHire instead of doing it two times by declaring it once FullTimeStaffHire and PartTimeStaffHire
     */
    
    ArrayList<StaffHire> staff_List = new ArrayList<StaffHire>();

    public void INGNepal()
    {
        f = new JFrame("Staff Hire");
        f.setLayout(null);
        Container container = f.getContentPane();
        
        p2 = new JPanel();
        p2.setBounds(5,5,975,410);
        p2.setLayout(null);
        p2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        container.add(p2);
        
        l_FullTime = new JLabel("**For Full Time Staff**");
        l_FullTime.setFont(new Font("Ariel", Font.PLAIN,35));
        l_FullTime.setBounds(300,10,700,40);
        p2.add(l_FullTime);
        
        l_VacancyNumberF = new JLabel("Vacancy Number:");
        l_VacancyNumberF.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_VacancyNumberF.setBounds(5,60,170,25);
        p2.add(l_VacancyNumberF);
        
        t_VacNumF = new JTextField();
        t_VacNumF.setBounds(180,60,150,25);
        p2.add(t_VacNumF);
        
        l_DesignationF = new JLabel("Designation:");
        l_DesignationF.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_DesignationF.setBounds(5,95,170,25);
        p2.add(l_DesignationF);
        
        t_DesignationF = new JTextField();
        t_DesignationF.setBounds(180,95,150,25);
        p2.add(t_DesignationF);
        
        l_JobTypeF =  new JLabel("Job Type:");
        l_JobTypeF.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_JobTypeF.setBounds(5,130,170,25);
        p2.add(l_JobTypeF);
        
        t_JobTypeF = new JTextField();
        t_JobTypeF.setBounds(180,130,150,25);
        p2.add(t_JobTypeF);
        
        l_WorkingHourF = new JLabel("Working Hour:");
        l_WorkingHourF.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_WorkingHourF.setBounds(5,165,170,25);
        p2.add(l_WorkingHourF);
        
        t_WorkingHourF = new JTextField();
        t_WorkingHourF.setBounds(180,165,150,25);
        p2.add(t_WorkingHourF);
        
        l_SalaryF = new JLabel("Salary:");
        l_SalaryF.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_SalaryF.setBounds(5,200,170,25);
        p2.add(l_SalaryF);
        
        t_SalaryF = new JTextField();
        t_SalaryF.setBounds(180,200,150,25);
        p2.add(t_SalaryF);
        
        l_VacNumAppointF = new JLabel("Vacancy Number:");
        l_VacNumAppointF.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_VacNumAppointF.setBounds(640,60,170,25);
        p2.add(l_VacNumAppointF);
        
        t_VacNumAppointFullTime = new JTextField();
        t_VacNumAppointFullTime.setBounds(815,60,150,25);
        p2.add(t_VacNumAppointFullTime);
        
        l_StaffNameF = new JLabel("Staff Name:");
        l_StaffNameF.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_StaffNameF.setBounds(640,95,170,25);
        p2.add(l_StaffNameF);
        
        t_StaffNameF = new JTextField();
        t_StaffNameF.setBounds(815,95,150,25);
        p2.add(t_StaffNameF);
        
        l_QualificationF = new JLabel("Qualification:");
        l_QualificationF.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_QualificationF.setBounds(640,130,170,25);
        p2.add(l_QualificationF);
        
        t_QualificationF = new JTextField();
        t_QualificationF.setBounds(815,130,150,25);
        p2.add(t_QualificationF);
        
        l_JoiningDateF = new JLabel("Joining Date:");
        l_JoiningDateF.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_JoiningDateF.setBounds(640,165,170,25);
        p2.add(l_JoiningDateF);
        
        t_JoiningDateF = new JTextField();
        t_JoiningDateF.setBounds(815,165,150,25);
        p2.add(t_JoiningDateF);
        
        l_AppointedByF = new JLabel("Appointed By:");
        l_AppointedByF.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_AppointedByF.setBounds(640,200,170,25);
        p2.add(l_AppointedByF);
        
        t_AppointedByF = new JTextField();
        t_AppointedByF.setBounds(815,200,150,25);
        p2.add(t_AppointedByF);
        
        JLabel l_VacNumDisplayF = new JLabel("Vacancy Number to display information:");
        l_VacNumDisplayF.setFont(new Font("Ariel", Font.PLAIN,16));
        l_VacNumDisplayF.setBounds(5,315,325,15);
        p2.add(l_VacNumDisplayF);
        
        t_VacNumDisplayFullTime = new JTextField();
        t_VacNumDisplayFullTime.setBounds(330,315,150,25);
        p2.add(t_VacNumDisplayFullTime);
        
        vacancyF = new JButton("Add Vacancy");
        vacancyF.setBounds(5,240,325,35);
        vacancyF.setFont(new Font("Ariel", Font.PLAIN,25));
        p2.add(vacancyF);
        vacancyF.addActionListener(this);
        
        appointF = new JButton("Appoint Full Time");
        appointF.setBounds(640,240,325,35);
        appointF.setFont(new Font("Ariel", Font.PLAIN,25));
        p2.add(appointF);
        appointF.addActionListener(this);
        
        displayF = new JButton("Display");
        displayF.setBounds(5,340,150,60);
        displayF.setFont(new Font("Ariel", Font.PLAIN,25));
        p2.add(displayF);
        displayF.addActionListener(this);
        
        clearF = new JButton("Clear");
        clearF.setBounds(815,340,150,60);
        clearF.setFont(new Font("Ariel", Font.PLAIN,25));
        p2.add(clearF);
        clearF.addActionListener(this);

        p1 = new JPanel();
        p1.setBounds(5,420,975,535);
        p1.setLayout(null);
        p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        container.add(p1);

        l_PartTime = new JLabel("**For Part Time Staff**");
        l_PartTime.setFont(new Font("Ariel", Font.PLAIN,35));
        l_PartTime.setBounds(300,10,700,40);
        p1.add(l_PartTime);
        
        l_VacNumP = new JLabel("Vacancy Number:");
        l_VacNumP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_VacNumP.setBounds(5,60,170,25);
        p1.add(l_VacNumP);
        
        t_VacNumP = new JTextField();
        t_VacNumP.setBounds(180,60,150,25);
        p1.add(t_VacNumP);
        
        l_DesignationP = new JLabel("Designation:");
        l_DesignationP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_DesignationP.setBounds(5,95,170,25);
        p1.add(l_DesignationP);
        
        t_DesignationP = new JTextField();
        t_DesignationP.setBounds(180,95,150,25);
        p1.add(t_DesignationP);
        
        l_JobTypeP =  new JLabel("Job Type:");
        l_JobTypeP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_JobTypeP.setBounds(5,130,170,25);
        p1.add(l_JobTypeP);
        
        t_JobTypeP = new JTextField();
        t_JobTypeP.setBounds(180,130,150,25);
        p1.add(t_JobTypeP);
        
        l_WorkingHourP = new JLabel("Working Hour:");
        l_WorkingHourP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_WorkingHourP.setBounds(5,165,170,25);
        p1.add(l_WorkingHourP);
        
        t_WorkingHourP = new JTextField();
        t_WorkingHourP.setBounds(180,165,150,25);
        p1.add(t_WorkingHourP);
        
        l_WorkingShiftsP = new JLabel("Working Shifts:");
        l_WorkingShiftsP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_WorkingShiftsP.setBounds(5,200,170,25);
        p1.add(l_WorkingShiftsP);
        
        t_WorkingShiftsP = new JTextField();
        t_WorkingShiftsP.setBounds(180,200,150,25);
        p1.add(t_WorkingShiftsP);
        
        l_WagesPerHourP = new JLabel("Wages Per Hour:");
        l_WagesPerHourP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_WagesPerHourP.setBounds(5,235,170,25);
        p1.add(l_WagesPerHourP);
        
        t_WagesPerHourP = new JTextField();
        t_WagesPerHourP.setBounds(180,235,150,25);
        p1.add(t_WagesPerHourP);
        
        l_VacNumAoointP = new JLabel("Vacancy Number:");
        l_VacNumAoointP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_VacNumAoointP.setBounds(640,60,170,25);
        p1.add(l_VacNumAoointP);
        
        t_VacNumAppointP = new JTextField();
        t_VacNumAppointP.setBounds(815,60,150,25);
        p1.add(t_VacNumAppointP);
        
        l_StaffNameP = new JLabel("Staff Name:");
        l_StaffNameP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_StaffNameP.setBounds(640,95,170,25);
        p1.add(l_StaffNameP);
        
        t_StaffNameP = new JTextField();
        t_StaffNameP.setBounds(815,95,150,25);
        p1.add(t_StaffNameP);
        
        l_QualificationP = new JLabel("Qualification:");
        l_QualificationP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_QualificationP.setBounds(640,130,170,25);
        p1.add(l_QualificationP);
        
        t_QualificationP = new JTextField();
        t_QualificationP.setBounds(815,130,150,25);
        p1.add(t_QualificationP);
        
        l_JoinDateP = new JLabel("Joining Date:");
        l_JoinDateP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_JoinDateP.setBounds(640,165,170,25);
        p1.add(l_JoinDateP);
        
        t_JoiningDateP = new JTextField();
        t_JoiningDateP.setBounds(815,165,150,25);
        p1.add(t_JoiningDateP);
        
        l_AppointedByP = new JLabel("Appointed By:");
        l_AppointedByP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_AppointedByP.setBounds(640,200,170,25);
        p1.add(l_AppointedByP);
        
        t_AppointedByP = new JTextField();
        t_AppointedByP.setBounds(815,200,150,25);
        p1.add(t_AppointedByP);
        
        l_VacNumTerminateP = new JLabel("Vacancy Number:");
        l_VacNumTerminateP.setFont(new Font("TimesRoman", Font.PLAIN, 18));
        l_VacNumTerminateP.setBounds(640,330,170,25);
        p1.add(l_VacNumTerminateP);
        
        t_VacNumTerminateP = new JTextField();
        t_VacNumTerminateP.setBounds(815,330,150,25);
        p1.add(t_VacNumTerminateP);

        JLabel l_VacNumDisplayP = new JLabel("Vacancy Number to display information:");
        l_VacNumDisplayP.setFont(new Font("Ariel", Font.PLAIN,16));
        l_VacNumDisplayP.setBounds(5,440,325,15);
        p1.add(l_VacNumDisplayP);
        
        t_VacNumDisplayP = new JTextField();
        t_VacNumDisplayP.setBounds(330,440,150,25);
        p1.add(t_VacNumDisplayP);

        vacancyP = new JButton("Add Vacancy");
        vacancyP.setBounds(5,275,325,35);
        vacancyP.setFont(new Font("Ariel", Font.PLAIN,25));
        p1.add(vacancyP);

        appointP = new JButton("Appoint Part Time");
        appointP.setBounds(640,240,325,35);
        appointP.setFont(new Font("Ariel", Font.PLAIN,25));
        p1.add(appointP);
       
        terminateP = new JButton("Terminate Staff");
        terminateP.setBounds(640,370,325,35);
        terminateP.setFont(new Font("Ariel", Font.PLAIN,25));
        p1.add(terminateP);
   
        displayP = new JButton("Display");
        displayP.setBounds(5,465,150,60);
        displayP.setFont(new Font("Ariel", Font.PLAIN,25));
        p1.add(displayP);

        clearP = new JButton("Clear");
        clearP.setBounds(815,465,150,60);
        clearP.setFont(new Font("Ariel", Font.PLAIN,25));
        p1.add(clearP);
        
        f.setSize(1000,1000);
        f.setVisible(true);
        
        vacancyP.addActionListener(this);
        appointP.addActionListener(this);
        terminateP.addActionListener(this);
        displayP.addActionListener(this);
        clearP.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent click)
    {
        if(click.getSource()==vacancyF)
        {
            try
            {
                if(t_VacNumF.getText().isEmpty() || t_DesignationF.getText().isEmpty() || t_JobTypeF.getText().isEmpty() || t_SalaryF.getText().isEmpty() || t_WorkingHourF.getText().isEmpty())
                {
                    throw new NumberFormatException("The text fields are empty. Please fill the boxes with their respective fields.");
            
                }
                
                char[]vac = t_VacNumF.getText().toCharArray();
                for(int i=0;i<vac.length;i++)
                {
                    if(Character.isDigit(vac[i]))
                    {
                        continue;
                    }
                
                    else
                    {
                        throw new NumberFormatException("Invalid vacancy number. Please, re-enter the vacancy number by checking.");
                
                    }
                }
              
                char[]sal = t_SalaryF.getText().toCharArray();
                for(int i=0;i<sal.length;i++)
                {
                    if(Character.isDigit(sal[i]))
                    {
                        continue;
                    }
                
                    else
                    {
                        throw new NumberFormatException("Invalid Salary.");
                
                    }
               
                }
            
                char[]work_Hour = t_WorkingHourF.getText().toCharArray();
                for(int i=0;i<work_Hour.length;i++)
                {
                    if(Character.isDigit(work_Hour[i]))
                    {
                        continue;
                    }
                
                    else
                    { 
                        throw new NumberFormatException("The working hour is invalid.");
                
                    }
                }

                int vacancyNumber = Integer.parseInt(t_VacNumF.getText());
                String designation = t_DesignationF.getText();
                String jobType = t_JobTypeF.getText();
                int salary = Integer.parseInt(t_SalaryF.getText());
                int workingHour = Integer.parseInt(t_WorkingHourF.getText());
                boolean check = false;
                
                if (vacancyNumber == 0 || vacancyNumber > 1000000)
                {
                 
                    throw new NumberFormatException("It sounds unnatural for the vacancy number to be 0 or more than 1000000, isn't it?");
                
                }
                
                if (workingHour < 1 || workingHour > 24)
                {
                    throw new NumberFormatException("How can you work more than 24 hours a day? Please enter valid working hour.");
                
                }
                
                if (salary < 1000 || salary > 1000000)
                {
                    throw new NumberFormatException("The staff can have a minimum salary of 1000 and maximum of 1000000. So, please check and enter.");
                }
                
                for (StaffHire staff:staff_List)
                {
                    if (staff instanceof FullTimeStaffHire) 
                    {
                        FullTimeStaffHire full = (FullTimeStaffHire)staff;
                         if ((full.getVacancyNumber() == vacancyNumber ))
                        {
                            JOptionPane.showMessageDialog(f,"This vacancy number is already associated with another full time staff. So, please add another vacancy number.");
                            check = true;
                        }
                        
                    }   
                }
               
                if (check == false)
                {
                     FullTimeStaffHire full_Time = new FullTimeStaffHire(salary,workingHour,vacancyNumber,designation,jobType);
                     staff_List.add(full_Time);
                     JOptionPane.showMessageDialog(f,"A full time vacancy with vacancynumber: "+ vacancyNumber + " has been added. Thank you!!");
                
                }

            }
            
            catch(NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(f,exception.getMessage());
            }
        }
        
        
        if (click.getSource() == appointF)
        {
            try
            {
                if(t_VacNumAppointFullTime.getText().isEmpty() || t_StaffNameF.getText().isEmpty() || t_QualificationF.getText().isEmpty() || t_JoiningDateF.getText().isEmpty() || t_AppointedByF.getText().isEmpty())
                {
                    throw new NumberFormatException("The text fields are empty. Please fill the textboxes with their respective fields..");
            
                }
            
                char[]vac = t_VacNumAppointFullTime.getText().toCharArray();
                for(int i=0;i<vac.length;i++)
                {
                    if(Character.isDigit(vac[i]))
                    {
                        continue;
                    }
                
                    else
                    {
                        throw new NumberFormatException("Invalid vacancy number. Please enter a valid vacancy number by checking.");
                
                    }
                }
                
                char[]staff_Name = t_StaffNameF.getText().toCharArray();
                for(int i = 0;i<staff_Name.length;i++)
                {
                    if(Character.isDigit(staff_Name[i]) == false)
                    {
                        continue;
                    }
                    
                    else
                    {
                        throw new NumberFormatException("From when did names start to contain numbers ?? Please enter a string value in staff name field.");
                
                    }
                
                }
                
                char[]appoint = t_AppointedByF.getText().toCharArray();
                for(int i = 0;i<appoint.length;i++)
                {
                    if(Character.isDigit(appoint[i]) == false)
                    {
                        continue;
                    }
                    
                    else
                    {
                        throw new NumberFormatException("From when did names start to contain numbers ?? Please enter a string value in appointed by field.");
                
                    }
                }
   
                int vacancy_Number = Integer.parseInt(t_VacNumAppointFullTime.getText());
                String name  = t_StaffNameF.getText();
                String join = t_JoiningDateF.getText();
                String qualification = t_QualificationF.getText();
                String appointed_By = t_AppointedByF.getText();
                boolean check = false;
                
                 if (vacancy_Number == 0 || vacancy_Number > 1000000)
                {
                 
                    throw new NumberFormatException("The vacancy number cannot be zero or more than 1000000");
                
                }
    
                
                for (StaffHire staff:staff_List)
                {
                    if (staff instanceof FullTimeStaffHire) 
                    {
                        FullTimeStaffHire full = (FullTimeStaffHire)staff;
                         if ((full.getVacancyNumber() == vacancy_Number ) && (full.getJoined() == true))
                        {
                            JOptionPane.showMessageDialog(f,"A full time staff named  " + full.getStaffName() + " associated with this vacancy number was already hired on " + full.getJoiningDate() + " . Please enter another vacancy number.");
                            check = true;
                           
                        }
                        if ((full.getVacancyNumber() == vacancy_Number ) && (full.getJoined() == false))
                        {
                            full.HireFullTimeStaff(name,join,qualification,appointed_By);
                            JOptionPane.showMessageDialog(f,"A full time staff having name " + name  +" has been added to the vacancy number " + vacancy_Number); 
                            check = true;
                            
                             
                        }

                    }   
                }
              
                
                if (check == false)
                {
                    JOptionPane.showMessageDialog(f,"Please enter a valid vacancy number.");
                }
                
                
            }
          
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(f,ex.getMessage());  
            }
             
        }
         
        if(click.getSource()==displayF)
        {
            try
            {
                if(t_VacNumDisplayFullTime.getText().isEmpty())
                {
                    throw new NumberFormatException("Please enter a vacancy number.");
            
                }
            
                char[]vac = t_VacNumDisplayFullTime.getText().toCharArray();
                for(int i=0;i<vac.length;i++)
                {
                    if(Character.isDigit(vac[i]))
                    {
                        continue;
                    }
                
                    else
                    {
                        throw new NumberFormatException("Please enter a valid vacancy number.");
                
                    }
                }
                
                int vacancy_Number = Integer.parseInt(t_VacNumDisplayFullTime.getText());
                boolean check = false;
                
                for (StaffHire staff:staff_List)
                {
                    if (staff instanceof FullTimeStaffHire) 
                    {
                        FullTimeStaffHire full = (FullTimeStaffHire)staff;
                         if (full.getVacancyNumber() == vacancy_Number)
                        {
                            full.Display();
                            check = true;
                            JOptionPane.showMessageDialog(f,"Information regarding the entered vacancy number is displayed on the terminal window.");
              
                        }
                        
                    }   
                }
                
                if (check == false)
                {
                    JOptionPane.showMessageDialog(f,"Please enter a valid vacancy number.");
                }
                
            }
            
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(f,ex.getMessage()); 
            }
           
        }
        
        if (click.getSource()==clearF)
        {
            
            t_VacNumF.setText("");
            t_DesignationF.setText("");
            t_JobTypeF.setText("");
            t_SalaryF.setText("");
            t_WorkingHourF.setText("");
            t_VacNumAppointFullTime.setText("");
            t_StaffNameF.setText("");
            t_QualificationF.setText("");
            t_JoiningDateF.setText("");
            t_AppointedByF.setText("");
            t_VacNumDisplayFullTime.setText("");
        }
        
         if(click.getSource()==vacancyP)
        {
            try
            {
                if(t_VacNumP.getText().isEmpty() || t_DesignationP.getText().isEmpty() || t_JobTypeP.getText().isEmpty() || t_WagesPerHourP.getText().isEmpty() || t_WorkingHourP.getText().isEmpty() || t_WorkingShiftsP.getText().isEmpty())
                {
                    throw new NumberFormatException("Text boxes can not be empty. Please fill the boxes with appropriate texts.");
            
                }
            
                char[]vac = t_VacNumP.getText().toCharArray();
                for(int i=0;i<vac.length;i++)
                {
                    if(Character.isDigit(vac[i]))
                    {
                        continue;
                    }
                
                    else
                    {
                        throw new NumberFormatException("Invalid vacancy number.");
                
                    }
                }
            
                char[]wages = t_WagesPerHourP.getText().toCharArray();
                for(int i=0;i<wages.length;i++)
                {
                    if(Character.isDigit(wages[i]))
                    {
                        continue;
                    }
                
                    else
                    {
                        throw new NumberFormatException("Invalid wages per hour input detected.");
                
                    }
               
                }
            
                char[]work_Hour = t_WorkingHourP.getText().toCharArray();
                for(int i=0;i<work_Hour.length;i++)
                {
                    if(Character.isDigit(work_Hour[i]))
                    {
                        continue;
                    }
                
                    else
                    { 
                        throw new NumberFormatException("Please enter a valid working hour.");
                
                    }
                }
                
                int vacancyNumber = Integer.parseInt(t_VacNumP.getText());
                String designation = t_DesignationP.getText();
                String jobType = t_JobTypeP.getText();
                int workingHour = Integer.parseInt(t_WorkingHourP.getText());
                int wagesPerHour = Integer.parseInt(t_WagesPerHourP.getText());
                String shifts = t_WorkingShiftsP.getText();
                boolean check = false;
                
                 if (vacancyNumber == 0 || vacancyNumber > 1000000)
                {
                 
                    throw new NumberFormatException("The vacancy number cannot be zero or more than 1000000");
                
                }
                
                if (workingHour < 1 || workingHour > 24)
                {
                    throw new NumberFormatException("How can you work more than 24 hours a day as a day itself has 24 hours. The working hour per day is in range of 1-24");
                
                }
                
                
                if(wagesPerHour < 100 || wagesPerHour > 50000)
                {
                    throw new NumberFormatException("The minimum wages per hour is 100 whereas maximum wages per hour is 50000 which makes a sense too. Re-enter wages per hour.");
                }
                
                for (StaffHire staff:staff_List)
                {
                    if (staff instanceof PartTimeStaffHire) 
                    {
                        PartTimeStaffHire part = (PartTimeStaffHire)staff;
                         if ((part.getVacancyNumber() == vacancyNumber ))
                        {
                            JOptionPane.showMessageDialog(f,"A part time staffv with same  vacancy number has already been added.So, please input another vacancy number.");
                            check = true;
                        }
                        
                    }   
                }
                
                if (check == false)
                {
                    PartTimeStaffHire part_Time = new PartTimeStaffHire(vacancyNumber,designation,jobType,workingHour,wagesPerHour,shifts);
                    staff_List.add(part_Time);
                    JOptionPane.showMessageDialog(f,"A part time vacancy with vacancy number: " + vacancyNumber +  " has been added. Thank you!!");
                }

            }
            
            catch(NumberFormatException exception)
            {
                JOptionPane.showMessageDialog(f,exception.getMessage());
            }
         }
         
         if (click.getSource() == appointP)
        {
            try
            {
                if(t_VacNumAppointP.getText().isEmpty() || t_StaffNameP.getText().isEmpty() || t_QualificationP.getText().isEmpty() || t_JoiningDateP.getText().isEmpty() || t_AppointedByP.getText().isEmpty())
                {
                    throw new NumberFormatException("Empty TextBox Detected. Please make sure to enter Vacancy number, staff name, qualification,joining date and appointed by on their respective textbox.");
            
                }
            
                char[]vac = t_VacNumAppointP.getText().toCharArray();
                for(int i=0;i<vac.length;i++)
                {
                    if(Character.isDigit(vac[i]))
                    {
                        continue;
                    }

                    else
                    {
                        throw new NumberFormatException("Please enter a valid vacancy number.");

                    }
                }
                
                char[]staff_Name = t_StaffNameP.getText().toCharArray();
                for(int i = 0;i<staff_Name.length;i++)
                {
                    if(Character.isDigit(staff_Name[i]) == false)
                    {
                        continue;
                    }
                    
                    else
                    {
                        throw new NumberFormatException("Please enter a valid staff name.(Staff name cannot contain numeric values.)");
                
                    }
                
                }
                
                char[]appoint = t_AppointedByP.getText().toCharArray();
                for(int i = 0;i<appoint.length;i++)
                {
                    if(Character.isDigit(appoint[i]) == false)
                    {
                        continue;
                    }
                    
                    else
                    {
                        throw new NumberFormatException("Please enter a valid value on appointed by text field.(Name cannot contain numeric values.)");
                
                    }
                
                }
                
                
                int vacancy_Number = Integer.parseInt(t_VacNumAppointP.getText());
                
                 if (vacancy_Number == 0 || vacancy_Number > 1000000)
                {
                 
                    throw new NumberFormatException("The vacancy number cannot be zero or more than 1000000");
                
                }
                
                String staffName  = t_StaffNameP.getText();
                String joiningDate = t_JoiningDateP.getText();
                String qualification = t_QualificationP.getText();
                String appointedBy = t_AppointedByP.getText();
                boolean check = false;
                
                for (StaffHire staff:staff_List)
                {
                    if (staff instanceof PartTimeStaffHire) 
                    {
                        PartTimeStaffHire part = (PartTimeStaffHire)staff;
                         if ((part.getVacancyNumber() == vacancy_Number ) && (part.getJoined() == true))
                        {
                            JOptionPane.showMessageDialog(f,"A part time staff " + part.getStaffName() + " was already hired on " + part.getJoiningDate() + " . Please enter another vacancy number");
                            check = true;
                        }
                        if ((part.getVacancyNumber() == vacancy_Number ) && (part.getJoined() == false))
                        {
                            part.HirePartTimeStaff(staffName,joiningDate,qualification,appointedBy);
                            JOptionPane.showMessageDialog(f,"A part time staff named " + staffName  + "  is now hired."); 
                            check = true;
                             
                        }
                       
                 
           
                    }   
                }
              
                if (check == false)
                {
                    JOptionPane.showMessageDialog(f,"Please enter a valid vacancy number.");
                }
                
                
            }
          
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(f,ex.getMessage());  
            }
         
        }
        
        if (click.getSource() == terminateP)
        {
            try
            {
                if(t_VacNumTerminateP.getText().isEmpty())
                {
                    throw new NumberFormatException("Please enter a vacancy number.");
            
                }
            
                char[]vac = t_VacNumTerminateP.getText().toCharArray();
                for(int i=0;i<vac.length;i++)
                {
                    if(Character.isDigit(vac[i]))
                    {
                        continue;
                    }
                
                    else
                    {
                        throw new NumberFormatException("Please enter a valid vacancy number.");
                
                    }
                }
                
                int vacancy_Number = Integer.parseInt(t_VacNumTerminateP.getText());
                boolean check = false;
                
                for (StaffHire staff:staff_List)
                {
                    if (staff instanceof PartTimeStaffHire) 
                    {
                        PartTimeStaffHire part = (PartTimeStaffHire)staff;
                         if ((part.getVacancyNumber() == vacancy_Number ) && (part.getTerminated() == true))
                        {
                            JOptionPane.showMessageDialog(f,"The part time staff associated with this vacancy number was already hired.");
                            check = true;
                        }
                        if ((part.getVacancyNumber() == vacancy_Number ) && (part.getTerminated() == false) && (part.getJoined() == true))
                        {
                            
                            JOptionPane.showMessageDialog(f,"Part time staff with associated vacancy number has now been terminated."); 
                            part.TerminateStaff();
                            check = true;
                             
                        }
               
                    }   
                }
              
                
                if (check == false)
                {
                    JOptionPane.showMessageDialog(f,"Please enter a valid vacancy number.");
                }
                
                
            }
          
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(f,ex.getMessage());  
            }
        
        }
        
        if (click.getSource() == displayP)
        {
            try
            {
                if(t_VacNumDisplayP.getText().isEmpty())
                {
                    throw new NumberFormatException("Please enter a vacancy number.");
            
                }
            
                char[]vac = t_VacNumDisplayP.getText().toCharArray();
                for(int i=0;i<vac.length;i++)
                {
                    if(Character.isDigit(vac[i]))
                    {
                        continue;
                    }
                
                    else
                    {
                        throw new NumberFormatException("Invalid vacancy number.");
                
                    }
                }
                
                int vacancy_Number = Integer.parseInt(t_VacNumDisplayP.getText());
                boolean check = false;
                
                 if (vacancy_Number == 0 || vacancy_Number > 1000000)
                {
                 
                    throw new NumberFormatException("The vacancy number cannot be zero or more than 1000000");
                
                }
                
                for (StaffHire staff:staff_List)
                {
                    if (staff instanceof PartTimeStaffHire) 
                    {
                        PartTimeStaffHire part = (PartTimeStaffHire)staff;
                         if (part.getVacancyNumber() == vacancy_Number)
                        {
                            part.Display();
                            check = true;
                            JOptionPane.showMessageDialog(f,"Please check another window.");
                        }
                        
                      
                    }   
                }
                
                if (check == false)
                {
                    JOptionPane.showMessageDialog(f,"Invalid vacancy number.");
                }
                
            }
            
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(f,ex.getMessage()); 
            }
     
        }
        
        if (click.getSource() == clearP)
        {
            t_VacNumP.setText("");
            t_DesignationP.setText("");
            t_JobTypeP.setText("");
            t_WorkingHourP.setText("");
            t_WorkingShiftsP.setText("");
            t_WagesPerHourP.setText("");
            t_VacNumAppointP.setText("");
            t_StaffNameP.setText("");
            t_QualificationP.setText("");
            t_JoiningDateP.setText("");
            t_AppointedByP.setText("");
            t_VacNumTerminateP.setText("");
            t_VacNumDisplayP.setText("");
        
        }
    } 
    public static void main(String args[]){
        INGNepal obj=new INGNepal();
        obj.INGNepal();
    }
}
