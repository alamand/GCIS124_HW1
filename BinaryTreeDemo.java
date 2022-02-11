public class BinaryTreeDemo {
    public static void main(String[] args) throws Exception {
        BinaryNode root = new BinaryNode(5);
        root.binaryInsertIterative(2);
        root.binaryInsertIterative(7);
        root.binaryInsertIterative(1);
        root.binaryInsertIterative(3);
        root.binaryInsertIterative(6);
        root.binaryInsertIterative(9);
        root.inOrderTraversal(root);

        boolean found = root.binarySearch(root, 3);
        System.out.println("The value was found? " + found);

    }
}
