
public class TestQueue  {

	public static void main(String[] args)  {

		Queue q = new Queue();
		
	
		NodeQueue customer = new NodeQueue("Yunus Emre", "Gurler");
		NodeQueue customer2 = new NodeQueue("Ahmet", "");

		q.enQueue(customer);
		q.enQueue(customer2);

		
		q.show();









	}






}


