import java.util.Objects;
import java.util.StringJoiner;

public class Animal implements Comparable<Animal> {

  private String name;
  protected int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Animal() {
  }


  public void setName(String name) {
    this.name = name;
  }


  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }


  @Override
  public int compareTo(Animal animal) {
    if (this.name.compareTo(animal.getName()) != 0) {
      return this.name.compareTo(animal.getName());
    } else {
      return this.age - animal.age;
    }
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
//    if (!(obj instanceof Animal)) {
//      return false;
//    }
//
//    Animal animal = (Animal) obj;
//
//    return this.name == animal.name && this.age == animal.age;
//  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + age;
    return result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Animal animal = (Animal) o;

    if (age != animal.age) return false;
    return Objects.equals(name, animal.name);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Animal.class.getSimpleName() + "[", "]")
      .add("name='" + name + "'")
      .add("age=" + age)
      .toString();
  }

}
