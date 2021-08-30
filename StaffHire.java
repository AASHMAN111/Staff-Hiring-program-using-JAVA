  

public class StaffHire
{
    protected int vacancyNumber; //encapsulating the sensitive data using protected 
    protected String designation;
    protected String jobType;
    
public StaffHire(int vacancyNumber,String designation,String jobType) //making of constructor to initialize the values
    {
        this.vacancyNumber=vacancyNumber;
        this.designation=designation;
        this.jobType=jobType;
    }
    
public int getVacancyNumber() { //getter method for vacancyNumber
    return vacancyNumber;    
}
public void setVacancyNumber(int newVacancyNumber) { //setter method for vacancyNumber
    this.vacancyNumber=newVacancyNumber;
}
public String getDesignation() { //getter method for designation
    return designation;
}
public void setDesignation(String newDesignation) {
    this.designation=newDesignation;
}
public String getJobType() {
    return jobType;
}
public void setJobType(String newJobType) {
    this.jobType=newJobType;
}
public void Display()
{
    System.out.println("The Vacancy number is: "+getVacancyNumber());
    System.out.println("The designation is: "+getDesignation());
    System.out.println("The job type is: "+getJobType());
}
}

