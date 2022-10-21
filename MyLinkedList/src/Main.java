import java.util.ArrayList;
import java.util.Collection;

public class Main {
  public static void main(String[] args) {
    MyDoublyLinkedList myDoublyLinkedList = new MyDoublyLinkedList();


    myDoublyLinkedList.linkFirst(5);
    myDoublyLinkedList.linkLast(7);
    myDoublyLinkedList.linkFirst(10);
    myDoublyLinkedList.linkLast(11);

//    myDoublyLinkedList.clear();
//    System.out.println(myDoublyLinkedList.getByIndex(1).item);

    Collection<Integer> newData = new ArrayList<Integer>();
    newData.add(1);
    newData.add(2);
    newData.add(3);

    final boolean isAddAll = myDoublyLinkedList.addAll(2, newData);
//    System.out.println(isAddAll);

    System.out.println(myDoublyLinkedList.getByIndex(2).item);

    final MyDoublyLinkedList.MyIterator myIterator = myDoublyLinkedList.listIter(2);
    if (myIterator.hasNext()) {
      myIterator.next();
      myIterator.remove();
    }

    System.out.println(myDoublyLinkedList.getByIndex(2).item);
  }
}
