package Tree;

public class sizeMaxSumHeight {
        static int size=0;
        public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static int size(Node root){
            if(root== null) return Integer.MIN_VALUE;
            return 1+ size(root.left)+ size(root.right);
    }
    public static int sum(Node root){
        if(root == null) return 0;

        return root.val + sum(root.left) + sum(root.right);
    }
    public static int height(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right==null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+ " ");
        // size++;
        preorder(root.left);
        preorder(root.right);
    }
    public static int max(Node root){
            if(root== null) return 0;
            int a=root.val;
            int b=max(root.left);
            int c=max(root.right);
            return Math.max(a,Math.max(b,c));
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
        preorder(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }
}
