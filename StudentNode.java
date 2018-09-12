/*
Programmer: Shanel Fowler
Date: May 17, 2016
Course: Data Structures I
*/
 public class StudentNode
 {
   private Student student;
   private StudentNode Sptr;
   private FriendList Fptr;
  
   public StudentNode()
   {
      student = null;
   }
   public StudentNode(Student s)
   {
      student = s;
   }
   public void setStudent(Student s)
   {
      student = s;
   }
   public Student getStudent()
   {
      return student;
   }
   public void setSptr(StudentNode s)
   {
      Sptr = s;
   }
   public StudentNode getSptr()
   {
      return Sptr;
   }
   public void setFptr(FriendList f)
   {
      Fptr = f;
   }
   public FriendList getFptr()
   {
      return Fptr;
   }
   public boolean isFriends(String fn)
   {
      boolean b = false;
      
      if(Sptr.getStudent().getName().equals(fn))
         b = true;
      
      return b;
   }
 }