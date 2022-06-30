
public class Queue {

	NodeQueue Queue[]= new NodeQueue[10];
	public int front;
	public int rear;
	public int size;


	public void enQueue(NodeQueue customer) {

		if(!isFull()) {	
			Queue[rear]=customer;
			rear = rear + 1;
			size = size + 1;
		}
		else
			System.out.println("Queue is Full");
	}

	public void show() {

		System.out.println("Customer:  ");
		for (int  i= 0;i<size;i++) 
		{

			System.out.print(Queue[front+i] + "  ");			

		}

	}

	public NodeQueue deQueue() {

		NodeQueue customer = Queue[front];
		if(!isEmpty()) {
			front= front+1;
			size= size-1;
		}
		else
			System.out.println("Queue is Empty");

		return customer;
	}


	public int getSize() {

		return size;

	}

	public boolean isEmpty() {

		return getSize() == 0;


	}
	public boolean isFull() {

		return getSize() == 10;
	}



	}







