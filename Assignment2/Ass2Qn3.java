package Assignment2;

import java.util.Scanner;

class Person // base class

{

private String firstName, lastName;

// constructor

public Person(String firstName, String lastName){

this.firstName = firstName;

this.lastName = lastName;

}

//set and get methods

public void setFirstName(String firstName)

{

this.firstName = firstName;

}

public String getFirstName()

{

return firstName;

}

public void setLastName(String lastName)

{

this.lastName = lastName;

}

public String getLastName()

{

return lastName;

}

  

public String toString()

{

return "\nFirstname : "+firstName+" LastName : "+lastName ;

}

};

class Date

{

private int day, year, month;

public Date(int day,int month, int year)

{

this.day = day;

this.month = month;

this.year = year;

}

public void setDay(){}


public int getDay()

{

return day;

}

public void setMonth(int month)

{

this.month = month;

}

public int getMonth()

{

return month;

}

public void setYear(int year)

{

this.year = year;

}

public int getYear()

{

return year;

}

public String toString()

{

return "\n"+day+"/"+month+"/"+year;

}

};

class Doctor extends Person

{

private String speciality;

public Doctor(String firstName,String lastName,String speciality)

{

super(firstName,lastName); // sending arguments to base class constructor

this.speciality = speciality;

}

public void SetSpeciality(String Speciality){}

public String getSpeciality()

{

return speciality;

}

public String toString()

{

return "\nDoctor : "+ super.toString()+ " Speciality : "+speciality;

}

}

class Patient extends Person

{

private int patientID, patientAge;

private Date dob,dateAdmitted,dateDismissed;

private Doctor physicianName;

Patient(String firstName,String lastName,int patientID,int patientAge,Date dob,Date dateAdmitted,Date dateDismissed,Doctor physicianName)

{

super(firstName,lastName);

this.patientID = patientID;

this.patientAge = patientAge;

this.dob = dob;

this.dateAdmitted = dateAdmitted;

this.dateDismissed = dateDismissed;

this.physicianName = physicianName;

}

public String toString()

{

return super.toString()+" Patient ID : "+patientID+" Age : "+patientAge+" Date of Birth : "+dob+

" Date Admitted: "+dateAdmitted +" Date dismissed : "+dateDismissed+" Physician "+physicianName;

}

}

class Bill

{

private int patientId;

private double medicineCharge;

private double doctorFee;

private double roomCharges;

public Bill(int id,double mCharge,double dFee,double rCharges)

{

patientId = id;

medicineCharge = mCharge;

doctorFee = dFee;

roomCharges = rCharges;

}

public String toString()

{

return "\nPatient Id : "+patientId+ "\nTotal Bill : $"+(medicineCharge+doctorFee+roomCharges);

}

}

class Test

{

public static void main (String[] args)

{

try (Scanner input = new Scanner(System.in)) {
        String firstName,firstName1,lastName,lastName1,speciality;
        
        int patientId,age,day,day1,day2,month,month1,month2,year,year1,year2;
        
        Doctor dt = new Doctor("Harris","Jones","Heart");
        
        System.out.println(dt);
        
        Patient[] pt = new Patient[2];
        
        for(int i=0;i<2;i++)
        
        {
        
        System.out.println("Enter patient first Name : ");
        
        firstName = input.next();
        
        System.out.println("Enter patient last Name : ");
        
        lastName = input.next();
        
        System.out.println("Enter patient id : ");
        
        patientId = input.nextInt();
        
        System.out.println("Enter the age of patient : ");
        
        age = input.nextInt();
        
        System.out.println("Enter the date of birth of patient : ");
        
        day = input.nextInt();
        
        month = input.nextInt();
        
        year = input.nextInt();
        
        Date dob = new Date(day,month,year);
        
        System.out.println("Enter the date of admission : ");
        
        day1 = input.nextInt();
        
        month1 = input.nextInt();
        
        year1 = input.nextInt();
        
        Date dateAdmitted = new Date(day1,month1,year1);
        
        System.out.println("Enter the date of dismissed : ");
        
        day2 = input.nextInt();
        
        month2 = input.nextInt();
        
        year2 = input.nextInt();
        
        Date dateDismissed = new Date(day2,month2,year2);
        
        System.out.println("Enter the physician firstName,lastName and speciality : ");
        
        firstName1 = input.next();
        
        lastName1 = input.next();
        
        speciality = input.next();
        
        Doctor dt1 = new Doctor(firstName1,lastName1,speciality);
        
        pt[i] = new Patient(firstName,lastName,patientId,age,dob,dateAdmitted,dateDismissed,dt1);
        
        System.out.println(pt[i]);
        
        }
}

Bill bt = new Bill(1005,56.7,451.50,34.8);

System.out.println(bt);

}

}