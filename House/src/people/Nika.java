package people;

import interfaces.Voice;

public class Nika extends Person implements Voice {

  public Nika(int age, String firstName, String secondName, int height) {
    super(age, firstName, secondName, height);
  }

  @Override
  public void talk() {
    System.out.println("people.Nika is talking");
  }

  @Override
  void write(String write) {
    System.out.println(getFirstName() + "is writing" + write);
  }
}
