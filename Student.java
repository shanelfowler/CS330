/*
Programmer: Shanel Fowler
Date: May 17, 2016
Course: Data Structures I
*/
public class Student extends Person
{
   private String sMajor;
   private double GPA;
   
   public Student()
   {
      super("Student","Male");
      sMajor = "Liberal Arts";
      GPA = 4.0;
   }
   public Student(String name, String gender, String major, double gpa)
   {
      super(name,gender);
      sMajor = major;
      GPA = gpa;
   }
   public void setMajor(String m)
   {
      sMajor = m;
   }
   public void setGPA(double g)
   {
      GPA = g;
   }
   public String getMajor()
   {
      return sMajor;
   }
   public double getGPA()
   {
      return GPA;
   }
}