
public class PartTimeStaffHire extends StaffHire
{
   private int workingHour; //restricted access
   private int wagesPerHour; 
   private String staffName;
   private String joiningDate;
   private String qualification;
   private String appointedBy;
   private String shifts;
   private Boolean joined;
   private Boolean terminated;
   
public PartTimeStaffHire(int vacancyNumber,String designation,String jobType,int workingHour,int wagesPerHour,String shifts)
{
    super(vacancyNumber,designation,jobType); //calling from parent class constructor using super keyword in java
    this.staffName=""; //initializing the values of instance variables using this keyword
    this.joiningDate="";
    this.qualification="";
    this.appointedBy="";
    this.joined=false;
    this.terminated=false;
    this.workingHour=workingHour;
    this.wagesPerHour=wagesPerHour;
    this.shifts=shifts;      
}

public int getWorkingHour()
{
    return workingHour;
}
public void setWorkingHour(int workingHour)
{
    this.workingHour=workingHour;
}
public int getWagesPerHour()
{
    return wagesPerHour;
}
public void setWagesPerHour(int wagesPerHour)
{
    this.wagesPerHour=wagesPerHour;
}
public String getStaffName()
{
    return staffName;
}
public void setStaffName(String staffName)
{
    this.staffName=staffName;
}
public String getJoiningDate()
{
    return joiningDate;
}
public void setJoiningDate(String joiningDate)
{
    this.joiningDate=joiningDate;
} 
public String getQualification()
{
    return qualification;
}
public void setQualification(String qualification)
{
    this.qualification=qualification;
}
public String getAppointedBy()
{
    return appointedBy;
}
public void setAppointedBy(String appointedBy)
{
    this.appointedBy=appointedBy;
}
public String getShifts()
{
    return shifts;
}
public void setShifts(String shifts)
{
    this.shifts=shifts;
}
public Boolean getJoined()
{
    return joined;
}
public void setJoined(Boolean joined)
{
    this.joined=joined;
}
public Boolean getTerminated()
{
    return terminated;
}
public void setTerminated(Boolean terminated)
{
    this.terminated=terminated;
}
public void WorkingShifts(String newWorkingShifts)
{
    if(joined)
    {
        System.out.println("It is not possible to change working hours");
    }else
    {
        setShifts(newWorkingShifts);
    }
}
public void HirePartTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy)
{
    if(joined)
    {
        System.out.println("The staff name is: "+getStaffName());
        System.out.println("The joining date of staff is: "+getJoiningDate());    
    }else
    {
        this.staffName=staffName;
        this.joiningDate=joiningDate;
        this.qualification=qualification;
        this.appointedBy=appointedBy;
        this.joined=true;
        this.terminated=false;
    }

}
public void TerminateStaff()
{
    if(terminated)
    {
        System.out.println("The staff has been terminated already");
    }else
    {
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
        this.terminated=true;
    }
}
public int IncomePerDay(int incomePerDay)
{
    incomePerDay=(wagesPerHour*workingHour);
    return incomePerDay;
}
public void partTimeStaffRequired()
{
    super.Display();
    if(joined)
    {
       System.out.println("The name of staff is: "+getStaffName()); 
       System.out.println("The per hour wage of staff is: "+getWagesPerHour());
       System.out.println("The working hour of staff is: "+getWorkingHour()); 
       System.out.println("The date when staff joined is: "+getJoiningDate()); 
       System.out.println("The qualification of staff is: "+getQualification()); 
       System.out.println("The staff was appointed by: "+getAppointedBy()); 
       System.out.println("The income of staff per day is: "+IncomePerDay(1956)); 
    }
}
          
}
