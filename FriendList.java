/*
Programmer: Shanel Fowler
Date: May 17, 2016
Course: Data Structures I
*/
public class FriendList
{
   private FriendNode fHead;
   
   public FriendList()
   {
      fHead = null;
   }
   public void setFhead(FriendNode f)
   {
      fHead = f;
   }
   public FriendNode getFhead()
   {
      return fHead;
   }
   public void insertFriendNode(FriendNode fn)
   {
      FriendNode tracker = fHead;
      
      if(tracker.getFptr().getFptr() != null)
      {
         fHead.getFptr();
         tracker.getFptr().getFptr();
      }
      else
         fHead.setFptr(fn);
   }
   public void deleteFriendNode(FriendNode fn)
   {
      FriendNode tracker = fHead;
      
      if((tracker.getFptr().getFptr() != null) && fHead.getFptr() != fn)
      {
         tracker.getFptr().getFptr();
         fHead.getFptr();
      }
      else
         fHead.setFptr(tracker.getFptr().getFptr());
   }
   public FriendNode findFriendByName(String fn)
   {
      if(!fHead.getSptr().getStudent().getName().equals(fn))
         fHead.getSptr();     
      
      return fHead;
   }
   public void printFriendListByName()
   {
      System.out.println("Name: "+fHead.getSptr().getStudent().getName());
      fHead.getSptr();
   }
}