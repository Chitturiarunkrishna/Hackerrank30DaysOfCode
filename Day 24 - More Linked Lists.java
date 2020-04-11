 public static Node removeDuplicates(Node head) 
    {
      Node curr = head;
        while ((curr != null) && (curr.next != null)) 
        {
            while ((curr.next != null) && (curr.data == curr.next.data)) 
            {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }