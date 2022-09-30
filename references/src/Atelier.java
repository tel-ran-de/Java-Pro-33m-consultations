import java.util.ArrayList;
import java.util.List;

public class Atelier implements Cloneable {

  private List<Clothing> allClothing;
  private int numOfWorkers;
  private Integer square;
  private Address address;

  public Atelier() {
  }

  public Atelier(List<Clothing> allClothing, int numOfWorkers, Integer square, Address address) {
    this.allClothing = allClothing;
    this.numOfWorkers = numOfWorkers;
    this.square = square;
    this.address = address;
  }

  public Atelier(Atelier atelier) {
    this.allClothing = new ArrayList<>(atelier.allClothing);
    this.numOfWorkers = atelier.numOfWorkers;
    this.square = atelier.square;
    final Address newAddress = atelier.getAddress();
    this.address = new Address(newAddress.getCountry(), newAddress.getCity(), newAddress.getStreet(), newAddress.getHouseNumber(), newAddress.getIndex());
  }

  public static Atelier newAtelier(Atelier atelier){
    final Address newAddress = atelier.getAddress();
    Address address =
      new Address(newAddress.getCountry(), newAddress.getCity(), newAddress.getStreet(), newAddress.getHouseNumber(), newAddress.getIndex());
    return new Atelier(new ArrayList<>(atelier.allClothing), atelier.numOfWorkers, atelier.square, address);
  }

  public Atelier getNewAtelier(Atelier atelier) {
    final Address newAddress = atelier.getAddress();
    Address address =
      new Address(newAddress.getCountry(), newAddress.getCity(), newAddress.getStreet(), newAddress.getHouseNumber(), newAddress.getIndex());
    return new Atelier(new ArrayList<>(atelier.allClothing), atelier.numOfWorkers, atelier.square, address);
  }

  @Override
  protected Atelier clone() {
    try {
      return (Atelier) super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println(e.getMessage());
    }
    return new Atelier();
  }

  public List<Clothing> getAllClothing() {
    return allClothing;
  }

  public void setAllClothing(List<Clothing> allClothing) {
    this.allClothing = allClothing;
  }

  public int getNumOfWorkers() {
    return numOfWorkers;
  }

  public void setNumOfWorkers(int numOfWorkers) {
    this.numOfWorkers = numOfWorkers;
  }

  public Integer getSquare() {
    return square;
  }

  public void setSquare(Integer square) {
    this.square = square;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
