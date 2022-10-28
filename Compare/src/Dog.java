public class Dog extends Animal {

  public Dog(String name, int age) {
    super(name, age);
  }

  public Dog() {
  }

//  @Override
//  public boolean equals(Object obj) {
//    if (this == obj) {
//      return true;
//    }
//
//    if (obj == null) {
//      return false;
//    }
//
//    if (!(obj instanceof Dog)) {
//      return false;
//    }
//
//    Dog dog = (Dog) obj;
//
//    return this.name == dog.name && this.age == dog.age;
//  }
//
//  @Override
//  public int hashCode() {
//    int result = name != null ? name.hashCode() : 0;
//    result = 31 * result + age;
//    return result;
//  }
}
