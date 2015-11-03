public class treeNode{
	private treeNode head;
	private int value;
	private treeNode next;
	public treeNode(int x){
		value = x;
		next = null;
		head = this;
	}
	public treeNode(int x, treeNode head){
		value = x;
		next = null;
		this.head = head;
	}
	public void insert(int newValue){
		treeNode x = this;
		while(x.next != null){
			x = x.next;
		}
		x.next = new treeNode(newValue);
	}

	public void reverseList(){
	    if(this !=null){
	        head = reverseListNodes(null , head);
	    }
	}

	private treeNode reverseListNodes(treeNode parent , treeNode child ){
	    treeNode next = child.next;
	    child.next = parent;
	    return (next==null)?child:reverseListNodes(child, next);
	}

	public void printValues(){
		treeNode head = this;
		treeNode x = this;
		while(x.next != null && x.next != head){
			System.out.print(x.value);
			System.out.print("->");
			x = x.next;
		}
		System.out.print(x.value);
	}
	/*public void inOrderTraversal(treeNode x){
		if(x == null){
			return;
		}
		x.inOrderTraversal(x.left);
		System.out.println(x.value);
		x.inOrderTraversal(x.right);
		return;
	}*/
	
	

}