public class BinaryTreeDemo {
    public static void main(String[] args) throws Exception {
        BinaryNode root = new BinaryNode(5);
        root.binaryInsert(2);
        root.binaryInsert(7);
        root.binaryInsert(1);
        root.binaryInsert(3);
        root.binaryInsert(6);
        root.binaryInsert(9);
        root.inOrderTraversal(root);

        boolean found = root.binarySearch(root, 3);
        System.out.println("The value was found? " + found);

    }
}
