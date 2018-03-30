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



                }

            }



        }
    }





}
