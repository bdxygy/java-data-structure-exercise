import classes.LinkedList;
import classes.Node;
import entities.Person;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedListA = new LinkedList();
        linkedListA.append(1);
        linkedListA.append(2);
        linkedListA.append(3);
        linkedListA.append(4);

        Node middleNode = linkedListA.findMiddleNode();

        System.out.println(middleNode);
    }
}