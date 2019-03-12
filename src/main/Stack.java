package main;

public class Stack {
    private static class Node{
        private int data;
        private Node next;

        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
        public int getData(){
            return data;
        }
        public void setData(int data){
            this.data = data;
        }
        public Node getNext(){
            return  next;
        }
        public void setNext(Node next){
           this.next = next;
        }
    }private Node top = null;
    private int size = 0;

    // this method will push an item on to the top of the stack
    public void push(int data) {
        //  steps to push a data item on to the top
        //  create a new node for the new data item
        Node newNode = new Node(data, this.top);
        //  update the reference of the top
        this.top = newNode;
        //  increment the size of the stack
        this.size++;
    }

    public int pop() {
        int response = -1;
        if (this.top != null) {
            response = this.top.getData();
            this.top = this.top.getNext();
            this.size--;
        } else {
            System.out.println("Stack is empty!");
        }
        return response;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack);
        for (int i = 0; i < 5; i++) {
            stack.push(i + 1);
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        Node temp = this.top;
        while (temp != null) {
            result.append(temp.getData());
            if (temp.getNext() != null) {
                result.append(" --> ");
            }
            temp = temp.getNext();
        }
        result.append("]");
        return result.toString();
    }
}



