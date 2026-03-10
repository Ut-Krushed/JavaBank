package Tree;

public class implementation {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+ "->");
        if(root.left!=null) System.out.print(root.left.val+ " ");
        if(root.right!=null) System.out.println(root.right.val);
        System.out.println();
        display(root.left);
        display(root.right);


    }

    public static void main(String[] args) {

        Node root = new Node(10);
        Node a = new Node(5);
        Node b = new Node(20);
        Node c = new Node(3);
        Node d = new Node(7);
        Node e = new Node(15);
        Node f = new Node(30);

        // connecting nodes
        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;
        display(root);
    }
}