package src;
import java.time.*;  

public class Student {
  String name, dob;
  int age, ID;

  // 1st Constructor with name, birthdate, NRIC
  Student(String student_name, String birthdate, int student_id){
    this.name = student_name;
    
    this.dob = birthdate;

    LocalDate dob_date = LocalDate.parse(this.dob);
    this.age = LocalDate.now().getYear() - dob_date.getYear();
    
    this.ID = student_id;
  }
  // 2nd Constructor with name only
  Student(String student_name){
    this.name = student_name;
  }
}
