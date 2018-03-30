package BaseTree;

/**
 * Created by lijiahe on 2018/3/30.
 */
public class BinaryTree {
    private TreeNode root;
    public BinaryTree(){
        root=null;
    }
    //根据给定的key去遍历查找节点
    public TreeNode findCurrentNode(int key){
        TreeNode currentNode=root;
        while(currentNode.key!=key){
            if(key<currentNode.key){
                currentNode=currentNode.leftNode;
            }else if(key>=currentNode.key){
                currentNode=currentNode.rightNode;
            }
            if(currentNode==null){
                return null;
            }
        }
        return  currentNode;
    }
    //给树插入节点
    public void insertCurrentNode(TreeNode treeNode){
        if(root==null){
            root=treeNode;
        }else{
            TreeNode currentNode=root;
            TreeNode parentNode;
            while (true){
                parentNode=currentNode;
                if(treeNode.key<currentNode.key){
                    currentNode=currentNode.leftNode;
                    if(currentNode==null){
                        currentNode.leftNode=treeNode;
                        treeNode.parent=parentNode;
                        return;
                    }
                }else{
                    currentNode=currentNode.rightNode;
                    if(currentNode==null){
                        currentNode.rightNode=treeNode;
                        treeNode.parent=parentNode;
                        return;
                    }
                }

            }
        }
    }


    //前序，中序，后序遍历二叉树
    public void traverse(int traverseType) {
        switch(traverseType)
        {
            case 1: System.out.println("Preorder traversal:");
                preOrder(root);//前向遍历
                break;
            case 2: System.out.println("Inorder traversal:");
                inOrder(root);//中向遍历
                break;
            case 3: System.out.println("Postorder traversal:");
                postOrder(root);//后向遍历
                break;
            default: System.out.println("Inorder traversal:");
                inOrder(root);
                break;
        }
        System.out.println("");
    }

    //先序遍历   根-左-右
    public void preOrder(TreeNode root){
         if(root!=null){
             System.out.println(root.key+":"+root.value);
             preOrder(root.leftNode);
             preOrder(root.rightNode);
         }

    }
     //中序遍历  左-根-右
    public void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.leftNode);
            System.out.println(root.key+":"+root.value);
            inOrder(root.leftNode);
        }

    }
     //后序遍历  左--右--根
    public void postOrder(TreeNode root){
        if(root!=null){
            postOrder(root.leftNode);
            postOrder(root.rightNode);
            System.out.println(root.key+":"+root.value);
        }
    }
    //遍历寻找最大值
    public double MaxValueFind(){
        double dd=0.0;

        return dd;
    }





}
