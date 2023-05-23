package entity;

public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    TreeNode(E element) {
        this.element = element;
    }
}
