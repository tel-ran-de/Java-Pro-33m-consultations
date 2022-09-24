package pizza;

public enum PizzaSize {

  SMALL(10, 0.2),
  MIDDLE(15, 0.4),
  LARGE(20, 0.8),
  EXTRALEGAL(30, 1.5);

  private int size;
  private double weight;

  PizzaSize(int size, double weight) {
    this.size = size;
    this.weight = weight;
  }

  public int getSize() {
    return size;
  }

  public double getWeight() {
    return weight;
  }
}
