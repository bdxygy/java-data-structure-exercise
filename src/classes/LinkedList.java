package classes;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList() {
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length++;
    }

    public void print() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.value);
            tempNode = tempNode.next;
        }
    }

    /* Insert into last index */
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }

        this.tail = newNode;
        length++;
    }

    /* Remove last Node */
    public Node pop() {
        if (length == 0) return null;
        Node popperNode = head;
        Node tempNode = head;
        while (tempNode.next != null) {
            popperNode = tempNode;
            tempNode = tempNode.next;
        }
        popperNode.next = null;
        this.tail = popperNode;
        length--;
        if (length == 0) {
            this.head = null;
            this.tail = null;
        }

        return tempNode;
    }

    /* Insert into first index */
    public Node push(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        if (length == 0) {
            this.tail = newNode;
        }
        this.head = newNode;
        length++;
        return newNode;
    }

    /* Delete first index */
    public Node pick() {
        if (length == 0) return null;
        Node tempNode = this.head;
        this.head = this.head.next;
        tempNode.next = null;
        length--;
        if (length == 0) {
            this.head = null;
            this.tail = null;
        }
        return tempNode;
    }

    /* Get Node with specific index */
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node tempNode = this.head;

        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }

        return tempNode;
    }

    /* Set for replace Node with specific index */
    public boolean set(int index, int value) {
        if (index < 0 || index >= length) return false;

        Node tempNode = get(index);
        tempNode.value = value;

        return true;
    }

    /* Insert new Node into LinkedList */
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            push(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node tempNode = get(index - 1);

        newNode.next = tempNode.next;
        tempNode.next = newNode;
        length++;
        return true;
    }

    /* Remove Node with specific index */
    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return pick();
        if (index == length - 1) return pop();

        Node prevNode = get(index - 1);
        Node tempNode = prevNode.next;
        prevNode.next = tempNode.next;
        tempNode.next = null;
        length--;

        return tempNode;
    }

    public void reverse(){
        Node tempNode = this.head;
        Node afterNode = tempNode.next;
        Node beforeNode = null;
        this.head = this.tail;
        this.tail = tempNode;

        for(int i =0; i< length; i++){
            afterNode = tempNode.next;
            tempNode.next = beforeNode;
            beforeNode = tempNode;
            tempNode = afterNode;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}