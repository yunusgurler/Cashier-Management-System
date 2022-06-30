

//node has a data, left node, right node, name, item number, and a price.
public class Node { 

		Node left;
		Node right;

		String name;
		int itemNo;
		int price;

		public Node( String name, int itemNo, int price) {
			left = null;
			right = null;
			this.name = name;
			this.itemNo = itemNo;
			this.price = price;

		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return name + " " + itemNo+ " " + price;
		}
	
	}


