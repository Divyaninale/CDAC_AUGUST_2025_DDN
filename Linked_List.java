import java.util.*;
public class Linked_List
{
    public class Node
    {
        int data;
        Node next;


        public Node(int data)
        {
            this.data=data;
            this.next=null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) 
    {
        Node newNode=new Node(data);

        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }


    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            newNode.next=head;
            return ;
        }

        tail.next=newNode;
        tail=newNode;



    } 

    public void display()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("List is empty");
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[])
    {
        Linked_List ll=new Linked_List();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.display();

    }
}
