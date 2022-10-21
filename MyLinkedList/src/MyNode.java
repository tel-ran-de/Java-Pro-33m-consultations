public class MyNode {

  MyNode next;
  MyNode prev;
  Integer item;

  public MyNode(MyNode prev,  Integer item, MyNode next) {
    this.next = next;
    this.prev = prev;
    this.item = item;
  }
}
