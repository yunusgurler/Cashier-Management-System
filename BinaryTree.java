
public class BinaryTree { 


	static Node root = null;
	static String name;
	static int itemNo;
	static int price;

	public BinaryTree() {
		
	}

	public static void addItem (Node newItem) {

		 newItem = new Node(null , 0 , 0);

		if(root == null) {
			root = newItem;
		}else {
			Node current = root;

			Node parent ;

			while(true) {
				parent = current;

				if(price <= current.price) {
					current = current.left;

					if(current == null) {
						parent.left = newItem;
					}
				}else {
					current = current.right;

					if(current == null) {
						parent.right = newItem;
						return;
					}
				}

			}
		}	
	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + itemNo + price;
	}
}