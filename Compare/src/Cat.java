public class Cat extends Animal {

  private String name;
  protected int age;

  public Cat(String name, int age) {
    super(name, age);
    this.name = name;
    this.age = age;
  }

  public Cat() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null) {
      return false;
    }

    if (!(obj instanceof Cat)) {
      return false;
    }

    Cat cat = (Cat) obj;

    return this.name == cat.name && this.age == cat.age;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + age;
    return result;
  }
}
