package workers;

import workers.Workable;

public class Cook implements Workable {

  private String name;

  public void work() {
    System.out.println("workers.Cook is cooking pizza");
  }

  public Cook(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
