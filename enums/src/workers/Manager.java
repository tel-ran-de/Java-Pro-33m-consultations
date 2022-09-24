package workers;

import workers.Workable;

public class Manager implements Workable {

  String name;

  @Override
  public void work() {
    System.out.println("Taking a call");
  }

  public Manager(String name) {
    this.name = name;
  }
}
