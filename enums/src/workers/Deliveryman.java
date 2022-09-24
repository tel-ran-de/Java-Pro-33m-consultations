package workers;

import workers.Workable;

public class Deliveryman implements Workable {

  String name;

  @Override
  public void work() {
    System.out.println("workers.Deliveryman is delivering pizza");
  }

  public Deliveryman(String name) {
    this.name = name;
  }
}
