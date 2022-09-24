import pizza.Pizza;
import pizza.PizzaName;
import pizza.PizzaSize;

public class Main {
  public static void main(String[] args) {

    Pizza pizzaPepperoni = new Pizza(PizzaName.PEPERONI, PizzaSize.EXTRALEGAL);
    System.out.println(pizzaPepperoni.getPizzaStatus());

    System.out.println(pizzaPepperoni.isReady());

    Boolean x = null;
    Integer y = null;
//    if(x != null){
    System.out.println(Boolean.TRUE.equals(x));
//    }

//
//    System.out.println(pizzaPepperoni.getPizzaSize().getSize());
//    System.out.println(pizzaPepperoni.getPizzaSize().getWeight());
//    System.out.println(pizzaPepperoni.getPizzaStatus().isOrdered());
//    pizzaPepperoni.getPizzaStatus().getWorker().work();
//
//    pizzaPepperoni.setPizzaStatus(PizzaStatus.READY);

//    final PizzaStatus ready = PizzaStatus.valueOf("READY");
//    System.out.println(ready.isOrdered());


  }

}
