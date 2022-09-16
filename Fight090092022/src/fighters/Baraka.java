package fighters;

import statistics.Counters;

public class Baraka implements Fighter {

  private static final String NAME = "Baraka";
  private static final String COLOR = "GREEN";
  private int health = 100;
  private Counters counters;

  public Baraka() {
    this.counters = new Counters();
  }

  @Override
  public String getName() {
    return NAME;
  }


  public int getHealth() {
    return health;
  }

  @Override
  public Counters getCounters() {
    return counters;
  }

  @Override
  public boolean injure() {
    if (hasShield()) {
      System.out.println(NAME + " defended, has power: " + counters.getPower());
      getCounters().minusPower();
      return false;
    } else {
      health -= DAMAGE;
      System.out.println(NAME + " get damaged. Health: " + health);
      return true;
    }
  }

  public String getColor() {
    return COLOR;
  }


//  private void doSom() {
//    System.out.println("Baraka doSom");
//  }


}
