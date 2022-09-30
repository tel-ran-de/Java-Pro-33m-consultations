import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

//    Tshirt tshirt = new Tshirt(Size.M, 100, "red");
//    Pants pants = new Pants(Size.L, 120, "blue");
//    Tie tie = new Tie(Size.XL, 25, "black");
//    Skirt skirt = new Skirt(Size.XXXL, 80, "yellow");
//
//    List<Clothing> allClothing1 = Arrays.asList(tie, skirt);
//    List<Clothing> allClothing2 = Arrays.asList(tshirt, pants);
//
//
//    Address address1 = new Address("Germany", "Berlin", "HoultSt", 10, 234786);
////    Address address2 = new Address("Germany", "Berlin", "HoultSt", 33, 234786);
//    Atelier atelier1 = new Atelier(allClothing1, 11, 100, address1);
//    Atelier atelier2 = Atelier.newAtelier(atelier1);

//    atelier2.setNumOfWorkers(30);
//    System.out.println(atelier1.getNumOfWorkers());
//
//    atelier2.setSquare(30);
//    System.out.println(atelier2.getSquare());

//    atelier1.getAddress().setIndex(123);
//    System.out.println(atelier2.getAddress().getIndex());

//    Address address2 = address1;
//    Address address2 = address1.clone();
//    address2.setIndex(9876);
//    System.out.println(address1.getIndex());
//    System.out.println(address2.getIndex());


    Address address1 = new Address("Germany", "Berlin", "HoultSt", 10, 234786);

    ByteArrayOutputStream outputByte = new ByteArrayOutputStream();
    ObjectOutputStream outputStream = new ObjectOutputStream(outputByte);
    outputStream.writeObject(address1);

    ByteArrayInputStream input = new ByteArrayInputStream(outputByte.toByteArray());
    ObjectInputStream inputAdd = new ObjectInputStream(input);

    Address newAddress = (Address) inputAdd.readObject();
    newAddress.setCity("Dublin");


    System.out.println(newAddress.getCity());

  }
}
