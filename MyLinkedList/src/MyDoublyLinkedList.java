import java.util.Collection;
import java.util.Iterator;

public class MyDoublyLinkedList {

  MyNode first;
  MyNode last;

  int size = 0;

  public MyDoublyLinkedList() {
  }

  void linkFirst(Integer item) {
    MyNode f = first;
    MyNode newNode = new MyNode(null, item, f);
    first = newNode;
    if (f == null) {
      last = newNode;
    } else {
      f.prev = newNode;
    }
    size++;
  }

  void linkLast(Integer item) {
    MyNode l = last;
    MyNode newNode = new MyNode(l, item, null);
    last = newNode;
    if (l == null) {
      first = newNode;
    } else {
      l.next = newNode;
    }
    size++;
  }

  void linkBefore(Integer item, MyNode curr) {
    if (!checkNode(curr)) {
      MyNode pred = curr.prev;
      MyNode newNode = new MyNode(pred, item, curr);
      curr.prev = newNode;
      if (pred == null) {
        first = newNode;
      } else {
        pred.next = newNode;
      }
      size++;
    }
  }

  Integer unlinkFirst() {
    if (first == null) {
      return null;
    }
    Integer item = first.item;
    MyNode next = first.next;
//    first.item = null;
//    first.next = null;
    first = next;
    if (next == null) {
      last = null;
    } else {
      next.prev = null;
    }
    size--;
    return item;
  }

  Integer unlinkLast() {
    if (checkNode(last)) {
      return null;
    }
    Integer item = last.item;
    MyNode prev = last.prev;
    last = prev;
    if (prev == null) {
      first = null;
    } else {
      prev.next = null;
    }
    size--;
    return item;
  }

  Integer getFirst() {
    if (checkNode(first)) {
      return null;
    }
    return first.item;
  }

  Integer getLast() {
    if (checkNode(last)) {
      return null;
    }
    return last.item;
  }

  int size() {
    return size;
  }

  void clear() {
    for (MyNode x = first; x != null; ) {
      MyNode next = x.next;
      x.item = null;
      x.next = null;
      x.prev = null;
      x = next;
    }
    first = last = null;
    size = 0;
  }

  boolean addAll(int index, Collection<Integer> c) {
    if (index < 0 || index > size()) {
      return false;
    }

    Object[] a = c.toArray();
    int numNew = a.length;
    if (numNew == 0) {
      return false;
    }

    MyNode pred, curr;
    if (index == size) {
      curr = null;
      pred = last;
    } else {
      curr = getByIndex(index);
      pred = curr.prev;
    }

    for (Object o : a) {
      Integer item = (Integer) o;
      MyNode newNode = new MyNode(pred, item, null);
      if (pred == null) {
        first = newNode;
      } else {
        pred.next = newNode;
      }
      pred = newNode;
    }

    if (curr == null) {
      last = pred;
    } else {
      pred.next = curr;
      curr.prev = pred;
    }

    size += numNew;
    return true;
  }

  MyNode getByIndex(int index) {
    if (first == null) {
      return null;
    }
    if (index < 0 || index > size()) {
      return null;
    }

    MyNode myNode = first;
    int count = -1;
    while (myNode != null) {
      count++;
      if (count == index) {
        return myNode;
      }
      myNode = myNode.next;
    }
    return null;
  }

  Integer unlink(MyNode x) {
    Integer item = x.item;
    MyNode next = x.next;
    MyNode prev = x.prev;

    if (prev == null) {
      first = next;
    } else {
      prev.next = next;
//      x.prev = null;
    }

    if (next == null) {
      last = prev;
    } else {
      next.prev = prev;
//      x.next = null;
    }

//    x.item = null;
    size--;
    return item;
  }

  private boolean checkNode(MyNode myNode) {
    return myNode == null;
  }

  public MyIterator listIter(int index) {
    return new MyDoublyLinkedList.MyIterator(index);
  }


  public class MyIterator implements Iterator<Integer> {

    private MyNode lastReturned;
    private MyNode next;
    private int nextIndex;

    public MyIterator(int index) {
      next = (index == size) ? null : getByIndex(index);
      this.nextIndex = index;
    }

    @Override
    public boolean hasNext() {
      return nextIndex < size();
    }

    @Override
    public Integer next() {
      if (!hasNext()) {
        return null;
      }
      lastReturned = next;
      next = next.next;
      nextIndex++;
      return lastReturned.item;
    }

    @Override
    public void remove() {
      if (lastReturned != null) {
        MyNode lastNext = lastReturned.next;
        unlink(lastReturned);
        if (next == lastReturned) {
          next = lastNext;
        } else {
          nextIndex--;
        }
        lastReturned = null;
      }
    }
  }


}
