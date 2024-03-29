class MyCircularQueue {
    int size;
    int front;
    int rear;
    int[] queue = new int[1000];
    
    public MyCircularQueue(int k) {
        size = k+1;
        front = 0;
        rear = 0;
    }
    
    public boolean enQueue(int value) {
        
        if(!isFull()){
            int tmp = (rear+1) % size;
            queue[rear] = value;
            rear = tmp;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty())
        {
            front = (front + 1) % size;
            return true;   
        }
        return false;
    }
    
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if(isEmpty()){ 
            return -1;
        }
        return queue[((rear-1)+size)%size];
    }
    
    public boolean isEmpty() {
        if(front == rear){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if((rear+1) % size == front){
            return true;
        }
        return false;
    }
}
