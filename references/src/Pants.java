public class Pants extends Clothing implements ManDressing, WomenDressing {

  public Pants(Size size, double price, String color) {
    super(size, price, color);
  }

  @Override
  public String dressMan() {
    return null;
  }

  @Override
  public String dressWomen() {
    return null;
  }
}
