package entity;

public class BST<E extends Comparable<E>> extends AbtractTree<E>{
    private TreeNode<E> root;
    private int size=0;
    public BST(){}
    @Override
    public boolean insert(E e) {
        if(root==null){
            root= new TreeNode<>(e);
            size+=1;
        }else {
            TreeNode<E> parent=null;
            TreeNode<E> current=root;
            while(current !=null){
                if(e.compareTo(current.element)>0){
                    parent=current;
                    current=current.right;
                }else if(e.compareTo(current.element)<0){
                    parent=current;
                    current=current.left;
                }else {
                    return false;
                }
            }
            if(e.compareTo(parent.element)>0){
                parent.right = new TreeNode<E>(e);
            }else {
                parent.left = new TreeNode<E>(e);
            }
        }
        size+=1;
        return true;
    }

    @Override
    public int getSize() {
        return this.size;
    }
    @Override
    public void inorder(){
        inorder(this.root.left);
        inorder(this.root.right);
        System.out.println("element root: "+this.root.element);
    }
    public void inorder(TreeNode<E> root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println("element : " + root.element);
        inorder(root.right);
    }
}
