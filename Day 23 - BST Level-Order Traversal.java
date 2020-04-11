public static void levelOrder(Node root) 
{
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) 
    {
        Node curr = queue.remove();
        System.out.print(curr.data + " ");

        if (curr.left != null) queue.add(curr.left);
        if (curr.right != null) queue.add(curr.right);
    }
}