package animals;

public abstract class Animal {

  static int DEFAULT_NUM_LEGS = 4;

  public Animal(String nickName, int age) {
    this.nickName = nickName;
    this.age = age;
    this.numOfLegs = DEFAULT_NUM_LEGS;
  }

  private String nickName;
  private int age;
  private int numOfLegs;

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public int getAge() {
    return age;
  }

  public int getNumOfLegs() {
    return numOfLegs;
  }

  public void setNumOfLegs(int numOfLegs) {
    this.numOfLegs = numOfLegs;
  }
}
