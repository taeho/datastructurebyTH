package ch08.queue;

public class ArraryQueue implements Queue {
	
	private int front;	// 저장된 원소 중에서 첫 번째 원소지정하여 삭제 연산만 수행
	private int rear;	// 다른쪽 끝은 삽입 연산만 수행하도록 제한
	private int queueSize;
	private char itemArray[];
	
	// 초기화 
	// 새로 생성하여 저장된 원소가 없는 공백큐 이므로 front/rear -1로 초기화 
	public ArraryQueue(int queueSize){
		front = -1;	
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front == rear);
	}
	
	public boolean isFull(){
		
		return (rear == this.queueSize -1);
	}

	@Override
	public void enQueue(char item) {
		// TODO Auto-generated method stub
		if(isFull())
			System.out.println("Inserting fail! Arary Queue is Full!!");
		else {
			itemArray[++rear] = item;
			System.out.println("Insert Item : " + item);
		}
		
	}

	@Override
	public char deQueue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Arary Queue is Emtpy!!");
			return 0;
		} else {
			return itemArray[++front];
		}
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Arary Queue is Emtpy!!");			
		} else {
			++front;
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("peeking fail! Arary Queue is Emtpy!!");
			return 0;
		} else {
			return itemArray[front + 1];
		}
	}
	
	public void printQueue(){
		if(isEmpty()) {
			System.out.println("Arary Queue is Emtpy!!");			
		} else {
			System.out.printf("Array Queue >> ");
			for(int i = front +1 ; i <= rear; i++){
				System.out.printf("%c", itemArray[i]);
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
