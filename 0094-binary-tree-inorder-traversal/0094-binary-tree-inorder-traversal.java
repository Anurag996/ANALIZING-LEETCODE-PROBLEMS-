class Solution {
    public void inorder(TreeNode root,List<Integer>al){
        if(root==null)return;
      
        inorder(root.left,al);
          al.add(root.val);
        inorder(root.right,al);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>al=new ArrayList<>();

        inorder(root,al);
        return al;
    }
}
