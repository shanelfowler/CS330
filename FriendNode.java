/*
Programmer: Shanel Fowler
Date: May 17, 2016
Course: Data Structures I
*/
public class FriendNode
{
   private StudentNode Sptr;
   private FriendNode Fptr;
   
   public FriendNode()
   {
      Fptr = null;
   }
   public FriendNode(StudentNode s)
   {
      Fptr = Sptr.getFptr().getFhead();
   }
   public void setSptr(StudentNode s)
   {
      Sptr = s;
   }
   public StudentNode getSptr()
   {
      return Sptr;
   }
   public void setFptr(FriendNode f)
   {
      Fptr = f;
   }
   public FriendNode getFptr()
   {
      return Fptr;
   }
}