import java.util.*;
class BinarySearchTree{ 
  
  
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  

    Node root; 
  
   
    BinarySearchTree2() {  
        root = null;  
    } 
  
   
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
   
    Node insertRec(Node root, int key) { 
  
      
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        return root; 
    } 
  
  
    void inorder()  { 
       inorderRec(root); 
    } 
	void preorder()
	{
		preorder(root);
	}
	void postorder()
	{
		postorder(root);
	}
  
  
    void inorderRec(Node root) { 
        if (root != null) {
			inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
	void  preorder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.key);
			preorder(root.left);
			preorder(root.right);
		}
	}
	void  postorder(Node root)
	{
		if(root != null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.key);
		}
	}
  
  
    public static void main(String[] args) { 
        BinarySearchTree2 tree = new BinarySearchTree2(); 

   	
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=0;i<n;i++)
     {
         	tree.insert(sc.nextInt());
     } 
       System.out.println("inorder :");
 tree.inorder();
          
		  System.out.println("preorder :");
         tree.preorder();
		 	  System.out.println("postorder :");
          tree.postorder();		  
    } 
} 
