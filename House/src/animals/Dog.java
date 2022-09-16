package animals;

import interfaces.Voice;

public class Dog extends Animal implements Voice {

  public Dog(String nickName, int age) {
    super(nickName, age);
  }

  @Override
  public void talk() {
    System.out.println("animals.Dog is woof-woof");
  }
}
