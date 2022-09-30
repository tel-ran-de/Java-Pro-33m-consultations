import java.io.Serializable;

public class Address implements Serializable {

  String country;
  String city;
  String street;
  int houseNumber;
  int index;


  public Address() {
  }

  public Address(String country, String city, String street, int houseNumber, int index) {
    this.country = country;
    this.city = city;
    this.street = street;
    this.houseNumber = houseNumber;
    this.index = index;
  }

//  @Override
//  protected Address clone() {
//    try {
//      return (Address) super.clone();
//    } catch (Throwable e) {
//      return new Address();
//    }
//  }

//  @Override
//  protected Address clone() throws CloneNotSupportedException {
//    return (Address) super.clone();
//  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(int houseNumber) {
    this.houseNumber = houseNumber;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }
}
