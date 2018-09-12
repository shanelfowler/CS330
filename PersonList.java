/*
Programmer: Shanel Fowler
Date: May 17, 2016
Course: Data Structures I
*/
public class PersonList
{
   private PersonNode head;
   
   public PersonList()
   {
      head = null;
   }
   public PersonNode getHead()
   {
      return head;
   }
   public void setHead(PersonNode n)
   {
      head = n;
   }
   public void insertHead(PersonNode n)
   {
      if(head != null)
      {
         n.setNext(head);
         head = n;
      }
      else
         head = n;
   }
   public void insertTail(PersonNode n)
   {
      PersonNode track = head;
      while(track.getNext().getNext() != null)
      {
         track.getNext().getNext();
         head.getNext();
      }
      if(track.getNext().getNext() == null)
         head.setNext(n);
   }
   public void displayList()
   {
      System.out.print("Name: "+head.getPerson().getName()+"\nGender: "+head.getPerson().getGender());
   }
}