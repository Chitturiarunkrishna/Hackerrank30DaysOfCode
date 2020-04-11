public static  Node insert(Node head,int data) 
    {
         if (head == null) 
         head = new Node(data);
         else
         {
              Node curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = new Node(data);
         }
         return head;
    }