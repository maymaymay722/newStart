package Tree;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode parent;
}
public class Demo {

    // 判断两个二叉树是否相同
    public boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return p.val==q.val &&
                isSameTree(p.left,q.left) &&
                isSameTree(q.right,p.right);
    }

    // 给定两个非空二叉树，检验 s 中是否包含和 t 具有相同结构和节点值的子树
    public boolean isSubTree(TreeNode s,TreeNode t){
        return search01(s,t);
    }
    public boolean search01(TreeNode root,TreeNode t){
        if(root==null){
            return false;
        }
        if(root==t){
            return true;
        }
        if(search01(root.left,t)){
            return true;
        }
        return search01(root.right,t);
    }
    public boolean search02(TreeNode root,TreeNode t){
        if(root==null){
            return false;
        }
        if(isSameTree(root,t)){
            return true;
        }
        if(search02(root.left,t)){
            return true;
        }
        return search02(root.right,t);
    }
    public boolean search03(TreeNode root,int val){
        if(root==null){
            return false;
        }
        if(root.val==val){
            return true;
        }
        if(search03(root.left,val)){
            return true;
        }
        return search03(root.right,val);
    }

    // 给定一个二叉树，判断它是否是高度平衡的二叉树
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    public boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }
        if(!isBalanced(root.left)){
            return false;
        }
        if(!isBalanced(root.right)){
            return false;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        int diff=left-right;
        if(diff>=-1 && diff<=1){
            return true;
        }
        return false;
    }

    // 镜像二叉树
    public boolean isSy(TreeNode root){
        if(root==null){
            return false;
        }
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        return p.val==q.val && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }

    // 结点公共祖先
    public boolean search(TreeNode root,TreeNode t){
        if(root==null){
            return false;
        }
        if(root==t){
            return true;
        }
        if(search(root.left,t)){
            return true;
        }
        return search(root.right,t);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 若 p、q 中有一个为 root
        if(p==root || q==root){
            return root;
        }
        boolean pInleft=search(root.left,p);
        boolean qInleft=search(root.right,q);
        if(pInleft && qInleft){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(!pInleft && !qInleft){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
    public TreeNode lowestCommonAncestor02(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return root;
        }
        if(p==root || q==root){
            return root;
        }
        TreeNode left=lowestCommonAncestor02(root.left,p,q);
        TreeNode right=lowestCommonAncestor02(root.right,p,q);
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        return root;
    }

    // 求叶子结点的个数
    private static int leafSize=0;
    private static void getLeafSize(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            leafSize++;
        }
        getLeafSize(root.left);
        getLeafSize(root.right);
    }
    private static int getLeafSize02(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int left=getLeafSize02(root.left);
        int right=getLeafSize02(root.right);
        return left+right;
    }

    // 求二叉树高度
    public static int getHeight02(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=getHeight02(root.left);
        int right=getHeight02(root.right);
        return Math.max(left,right)+1;
    }

    // 求二叉树第k层结点的个数
    public static int getLevel(TreeNode root,int k){
        if(root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getLevel(root.left,k-1)+getLevel(root.right,k-1);
    }

    // 查找 val 所在结点
    public static TreeNode find(TreeNode root,int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        TreeNode n=find(root.left,val);
        if(n!=null){
            return n;
        }
        n=find(root.right,val);
        if(n!=null){
            return n;
        }
        return null;
    }
    public static boolean find02(TreeNode root,int val){
        if(root==null){
            return false;
        }
        if(root.val==val){
            return true;
        }
        if(find02(root.left,val)){
            return true;
        }
        return find02(root.right,val);
    }
    public static boolean find03(TreeNode root,int val){
        return root!=null
                &&(root.val==val
                || find03(root.left,val)
                || find03(root.right,val));
    }

    // 层序遍历
    public static void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode front=queue.poll();
            System.out.println(front.val);
            if(front.left!=null){
                queue.offer(front.left);
            }
            if(front.right!=null){
                queue.offer(front.right);
            }
        }
    }

    // 判断是否是完全二叉树
    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (true) {
            TreeNode front = queue.poll();
            // 判断 front 是不是空结点
            if (front == null) {
                break;
            }
            queue.offer(front.left);
            queue.offer(front.right);
        }
        // 去检查队列中是否全为 null 了
        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            if (n != null) {
                return false;
            }
        }
        return true;
    }

    // 深度优先遍历
    public static void preOrderTraversal(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 堆
    public static void shiftDown(int[] array,int size,int index){
        int left=2*index+1;
        while(left<size){
            int min=left;
            int right=2*index+2;
            if(right<size){
                if(array[right]<array[left]){
                    min=right;
                }
            }
            if(array[index]<=array[min]){
                break;
            }
            int t=array[index];
            array[index]=array[min];
            array[min]=t;
            index=min;
            left=2*index+1;
        }
    }
    // 建堆
    public static void createHeap(int[] array,int size){
        for(int i=(size-1)/2;i>=0;i--){
            shiftDown(array,size,i);
        }
    }

    // 入队列
    public static void shiftUp(int[] array,int index){
        while(index>0){
            int parent=(index-1)/2;
            if(array[parent]>=array[index]){
                break;
            }
            int t=array[parent];
            array[parent]=array[index];
            array[index]=t;

            index=parent;
        }
    }


}
