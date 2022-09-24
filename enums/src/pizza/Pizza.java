package pizza;

public class Pizza {

  private PizzaName pizzaName;
  private PizzaSize pizzaSize;
  private PizzaStatus pizzaStatus;

  public Pizza(PizzaName pizzaName, PizzaSize pizzaSize) {
    this.pizzaName = pizzaName;
    this.pizzaSize = pizzaSize;
  }

  public boolean isReady() {
//    return pizzaStatus == PizzaStatus.READY;
    return PizzaStatus.READY.equals(pizzaStatus);
//    return pizzaStatus.equals(PizzaStatus.READY);
  }

  public PizzaName getPizzaName() {
    return pizzaName;
  }

  public void setPizzaName(PizzaName pizzaName) {
    this.pizzaName = pizzaName;
  }

  public PizzaSize getPizzaSize() {
    return pizzaSize;
  }

  public void setPizzaSize(PizzaSize pizzaSize) {
    this.pizzaSize = pizzaSize;
  }

  public PizzaStatus getPizzaStatus() {
    return pizzaStatus;
  }

  public void setPizzaStatus(PizzaStatus pizzaStatus) {
    this.pizzaStatus = pizzaStatus;
  }

//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
//
//    Pizza pizza = (Pizza) o;
//
//    if (pizzaName != pizza.pizzaName) return false;
//    if (pizzaSize != pizza.pizzaSize) return false;
//    return pizzaStatus == pizza.pizzaStatus;
//  }
//
//  @Override
//  public int hashCode() {
//    int result = pizzaName != null ? pizzaName.hashCode() : 0;
//    result = 31 * result + (pizzaSize != null ? pizzaSize.hashCode() : 0);
//    result = 31 * result + (pizzaStatus != null ? pizzaStatus.hashCode() : 0);
//    return result;
//  }


//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//
//    if (o == null || getClass() != o.getClass()) return false;
//
//    Pizza pizza = (Pizza) o;
//
//    return new org.apache.commons.lang.builder.EqualsBuilder().append(pizzaName, pizza.pizzaName).append(pizzaSize, pizza.pizzaSize).append(pizzaStatus, pizza.pizzaStatus).isEquals();
//  }
//
//  @Override
//  public int hashCode() {
//    return new org.apache.commons.lang.builder.HashCodeBuilder(17, 37).append(pizzaName).append(pizzaSize).append(pizzaStatus).toHashCode();
//  }
}
