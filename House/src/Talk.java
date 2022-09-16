import animals.Cat;
import animals.Dog;
import people.Michael;
import people.Nika;

public class Talk {

  public static void main(String[] args) {
    Michael person1 = new Michael(27, "Mickaek", "Smidt", 176);
    Michael mickael2 = new Michael();
    Nika person2 = new Nika(27, "people.Nika", "Smidt", 171);
    Dog animal1 = new Dog("Sharick", 3);
    Cat animal2 = new Cat("Pushok", 7);

    House house = new House(person1, person2, animal1, animal2);
    Garden garden = new Garden(person1, person2, animal1, animal2);

//    house.getPerson1().write(" Hi");
//    house.getPerson2().write(" Hello");
//    System.out.println(" Animal1 from house has " + house.getAnimal1().getNumOfLegs() + "legs");

//    ((people.Person) garden.getVoice1()).write(" Now I'm talking");
//    ((people.Michael)garden.getVoice2()).run();
//    garden.getVoice2().talk();
//    garden.getVoice3().talk();
//    garden.getVoice4().talk();
//
//    person1.talk();
//    person1.write("I can write");
//    person1.run();

//    System.out.println(mickael2.getFirstName());
    System.out.println(mickael2.getHeight());
  }
}
