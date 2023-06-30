import classes.LinkedList;
import entities.Person;

public class Main {
    public static void main(String[] args) {
        Person budi = new Person(1, "Budi");
        Person ibra = new Person(2, "Ibra");
        Person akin = new Person(3, "Akin");

        LinkedList<Person> linkedListA = new LinkedList();
        linkedListA.push(budi);
        linkedListA.push(ibra);
        linkedListA.append(ibra);
        System.out.println(linkedListA);
        linkedListA.pick();
        linkedListA.append(ibra);
        linkedListA.set(1, akin);
        linkedListA.remove(1);

//        linkedListA.push(akin);

//        linkedListA.append(ibra);
//        linkedListA.pop();
//        linkedListA.append(akin);

//        linkedListA.append(2);
//        linkedListA.append(3);
//        linkedListA.print();
        System.out.println(linkedListA);
    }
}