/*
Programmer: Shanel Fowler
Date: May 17, 2016
Course: Data Structures I
*/
public class PersonNode
{
   private Person person;
   private PersonNode next;
   
   public PersonNode()
   {
      person = null;
      next = null;
   }
   public PersonNode(Person p)
   {
      person = p;
   }
   public Person getPerson()
   {
      return person;
   }
   public void setPerson(Person p)
   {
      person = p;
   }
   public PersonNode getNext()
   {
      return next;
   }
   public void setNext(PersonNode n)
   {
      next = n;
   }
}