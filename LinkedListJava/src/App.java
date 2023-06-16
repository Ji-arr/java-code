class node
{
    int data;
    node next;
}
class Linkedlist 
{
    
    node head;
    public void insertAtLast(int data)
    {
        node n = new node();
        n.data = data;
            if (head == null)
            {
                head = n;
            }
            else
            {
              node ptr = head;
              while(ptr.next != null)
              {
                ptr = ptr.next;
              }
              ptr.next = n;   
            }
    }
    public void insertAtHead(int data)
    {
        node n = new node();
        n.data = data;
        n.next = head;
        head = n;
    }
    public void show()
    {
        node temp = head;
        
        while(temp.next != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}


public class App {

    public static void main(String[] args) throws Exception {
        Linkedlist nodelist = new Linkedlist();
        nodelist.insertAtLast(10);
        nodelist.insertAtLast(20);
        nodelist.insertAtHead(5);
        nodelist.show();
    }
}
