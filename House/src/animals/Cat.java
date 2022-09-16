package animals;

import interfaces.Voice;

public class Cat extends Animal implements Voice {
  public Cat(String nickName, int age) {
    super(nickName, age);
  }

  @Override
  public void talk() {
    System.out.println("animals.Cat is meowing");
  }
}
