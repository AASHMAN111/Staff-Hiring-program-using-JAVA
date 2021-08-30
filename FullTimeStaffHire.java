public class FullTimeStaffHire extends StaffHire
{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private Boolean joined;
    
public FullTimeStaffHire(int salary,int workingHour,int vacancyNumber,String designation,String jobType)
{
    super(vacancyNumber,designation,jobType);
    this.salary=salary;
    this.workingHour=workingHour;
    this.staffName="";
    this.joiningDate="";
    this.qualification="";
    this.appointedBy="";
    this.joined=false;    
}

public void setSalary(int salary)
{
    this.salary=salary;
}
public int getSalary()
{
    return this.salary;
}
public void setWorkingHour(int workingHour)
{
    this.workingHour=workingHour;
}
public int getWorkingHour()
{
    return this.workingHour;
}
public void setStaffName(String staffName)
{
    this.staffName=staffName;
}
public String getStaffName()
{
    return this.staffName;
}
public void setJoiningDate(String joiningDate)
{
    this.joiningDate=joiningDate;
}
public String getJoiningDate()
{
    return this.joiningDate;
}
public void setQualification(String qualification)
{
    this.qualification=qualification;
}
public String getQualification()
{
    return this.qualification;
}
public void setAppointedBy(String appointedBy)
{
    this.appointedBy=appointedBy;
}
public String getAppointedBy()
{
    return this.appointedBy;
}
public void setJoined(Boolean joined)
{
    this.joined=joined;
}
public boolean getJoined()
{
    return this.joined;
}
public void newSalary(int salary)
{
    if (this.joined)
    {
        System.out.println("It is not possible to change the salary");
    }else
    {
        this.salary = salary;
    }
}
public void WorkingHour(int newWorkingHour)
{
    workingHour=newWorkingHour;
}
public void HireFullTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy)
{
    if (this.joined)
    {
        System.out.println("The name of the staff is :"+getStaffName());
        System.out.println("The date when the staff joined is :"+getJoiningDate());
    }else
    {
        this.staffName=staffName;
        this.joiningDate=joiningDate;
        this.qualification=qualification;
        this.appointedBy=appointedBy;
        this.joined=true;
    }
    
}
public void PartTimeStaff()
{
    super.Display();
    if(joined)
    {
        System.out.println("The staff name is: "+getStaffName());
        System.out.println("The salary of the staff is: "+getSalary());
        System.out.println("The working hour of the staff is: "+getWorkingHour());
        System.out.println("The joining date of staff is: "+getJoiningDate());
        System.out.println("The qualification of staff is: "+getQualification());
        System.out.println("The staff was appointed by: "+getAppointedBy());
    }
    

}
    
    
}
