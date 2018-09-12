/*
Programmer: Shanel Fowler
Date: May 17, 2016
Course: Data Structures I
*/
public class StudentList
{
   private StudentNode sHead;
   
   public StudentList()
   {
      sHead = null;
   }
   public void setShead(StudentNode sh)
   {
      sHead = sh;
   }
   public StudentNode getShead()
   {
      return sHead;
   }
   public void insertStudentNode(StudentNode sn)
   {
      StudentNode tracker = sHead;
      
      if(tracker.getSptr().getSptr() != null)
      {
         sHead.getSptr();
         tracker.getSptr().getSptr();
      }
      else
         sHead.setSptr(sn);
   }
   public void deleteStudentNode(StudentNode sn)
   {
      StudentNode tracker = sHead;
      
      if((tracker.getSptr().getSptr() != null) && sHead.getSptr() != sn)
      {
         tracker.getSptr().getSptr();
         sHead.getSptr();
      }
      else
         sHead.setSptr(tracker.getSptr().getSptr());
   }
   public StudentNode findStudentByName(String s)
   {
      if(!sHead.getStudent().getName().equals(s))
         sHead.getSptr();     
      
      return sHead;
   }
   public void printStudentListByName()
   {
      System.out.println("Name: "+sHead.getStudent().getName());
      sHead.getSptr();
   }
}