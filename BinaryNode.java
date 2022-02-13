public class BinaryNode {
    private int nodeValue;
    private BinaryNode left;
    private BinaryNode right; 

    public BinaryNode(int nodeValue) {
        this.nodeValue = nodeValue;
        left = null;
        right = null;
    }
    public int getNodeValue() {
        return nodeValue;
    }
    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }
    public BinaryNode getLeft() {
        return left;
    }
    public void setLeft(BinaryNode left) {
        this.left = left;
    }
    public BinaryNode getRight() {
        return right;
    }
    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public void inOrderTraversal(BinaryNode node)
    {
        if(node != null)
        {
            if(node.left != null)
            {
                inOrderTraversal(node.left);
            }
            System.out.println(node.nodeValue);
            if(node.right != null)
            {
                inOrderTraversal(node.right);
            }
        }
    }

    public boolean binarySearch(BinaryNode node, int searchValue)
    {
        if(node == null)
        {
            return false;
        }
        if(searchValue == node.nodeValue)
        {
            return true;
        }
        else if (searchValue < node.nodeValue)
        {
            return binarySearch(node.left, searchValue);
        }
        else
        {
            return binarySearch(node.right, searchValue);
        }
    }

    public void binaryInsert(int value)
    {
        BinaryNode current = this;
        while (current != null)
        {
            if(value < current.nodeValue)
            {
                if(current.left == null)
                {
                    current.left = new BinaryNode(value);
                    break;
                }
                else
                    current = current.left;
            }
            else if(value > current.nodeValue)
            {
                if(current.right == null)
                {
                    current.right = new BinaryNode(value);
                    break;
                }
                else
                    current = current.right;
            }
            else
            {
                break;
            }
        }
    }

}
