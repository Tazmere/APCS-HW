
public class BST {
	private Node root;
	
	public BST(){
		root = null;
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public void insert(int data){
		root = insert(root,data);
	}
	private Node insert(Node n, int data){
		if(n == null){
			n = new Node(data);
		}
		else{
			if(data <= n.getData()){
				n.left = insert(n.left, data);
			}
			else{
				n.right = insert(n.right, data);
			}
		}
		return n;
	}
	
	public boolean search(int val){
		return search(root, val);
	}
	private boolean search(Node n, int val){
		boolean found = false;
		while((n != null) && !found){
			int rval = n.getData();
			if(val < rval){
				n = n.getLeft();
			}
			else if(val > rval){
				n = n.getRight();
			}
			else{
				found = true;
				break;
			}
			found = search(n, val);
		}
		return found;
	}
	
	public boolean search2(Node root, Node n){
		if(root == null || n == null){
			return false;
		}
		if(root.getData() > n.getData()){
			return search2(root.getLeft(),n);
		}
		else if(root.getData() < n.getData()){
			return search2(root.getRight(), n);
		}
		return true;
	}
	
}
