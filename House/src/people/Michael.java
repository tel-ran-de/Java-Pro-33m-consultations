package people;

import interfaces.Voice;

public class Michael extends Person implements Voice {

  public Michael(int age, String firstName, String secondName, int height) {
    super(age, firstName, secondName, height);
  }

  public Michael() {
  }

  @Override
  public void talk() {
    System.out.println("people.Michael is talking");
  }

  @Override
  void write(String write) {
    System.out.println(getFirstName() + "is writing" + write);
  }

  public void run() {
    System.out.println("Mickael is running");
  }
}
