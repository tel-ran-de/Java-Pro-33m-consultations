public class Tie extends Clothing implements ManDressing {

  public Tie(Size size, double price, String color) {
    super(size, price, color);
  }

  @Override
  public String dressMan() {
    return null;
  }
}
