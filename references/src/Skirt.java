public class Skirt extends Clothing implements WomenDressing {

  public Skirt(Size size, double price, String color) {
    super(size, price, color);
  }

  @Override
  public String dressWomen() {
    return null;
  }
}
