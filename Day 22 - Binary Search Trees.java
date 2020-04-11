public static int getHeight(Node root) 
{

    return root == null ? -1 : 1 + Math.max(getHeight(root.left), getHeight(root.right));
}