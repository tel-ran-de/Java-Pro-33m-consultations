package people;

public abstract class Person {

  private int age;
  private String firstName;
  private String secondName;
  private int height;

  public Person(int age, String firstName, String secondName, int height) {
    this.age = age;
    this.firstName = firstName;
    this.secondName = secondName;
    this.height = height;
  }

  public Person() {
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  abstract void write(String write);
}
