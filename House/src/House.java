import animals.Animal;
import people.Person;

public class House {

  Person person1;
  Person person2;

  Animal animal1;
  Animal animal2;

  public House(Person person1, Person person2, Animal animal1, Animal animal2) {
    this.person1 = person1;
    this.person2 = person2;
    this.animal1 = animal1;
    this.animal2 = animal2;
  }

  public Person getPerson1() {
    return person1;
  }

  public void setPerson1(Person person1) {
    this.person1 = person1;
  }

  public Person getPerson2() {
    return person2;
  }

  public void setPerson2(Person person2) {
    this.person2 = person2;
  }

  public Animal getAnimal1() {
    return animal1;
  }

  public void setAnimal1(Animal animal1) {
    if (animal1 != null) {
      this.animal1 = animal1;
    }
  }

  public Animal getAnimal2() {
    return animal2;
  }

  public void setAnimal2(Animal animal2) {
    this.animal2 = animal2;
  }
}
