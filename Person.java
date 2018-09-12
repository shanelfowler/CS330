/*
Programmer: Shanel Fowler
Date: May 17, 2016
Course: Data Structures I
*/
public class Person
{
   private String pName;
   private String pGender;
   
   public Person()
   {
      pName = "Person";
      pGender = "Male";
   }
   public Person(String name, String gender)
   {
      pName = name;
      pGender = gender;
   }
   public void setName(String n)
   {
      pName = n;
   }
   public void setGender(String g)
   {
      pGender = g;
   }
   public String getName()
   {
      return pName;
   }
   public String getGender()
   {
      return pGender;
   }
}