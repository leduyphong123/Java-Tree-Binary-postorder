import entity.BST;

public class Main{
    public static void main(String[] args){
        BST<Integer> bst = new BST<>();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);
        bst.insert(5);
        bst.insert(6);
        bst.insert(-2);
        bst.insert(-3);
        bst.insert(-4);
        bst.insert(-5);
        bst.insert(-6);
        bst.inorder();
    }
}