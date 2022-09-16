import fighters.Baraka;
import fighters.Fighter;
import fighters.SubZero;

import java.util.Random;

public class Fight {

  private static final Fighter baraka = new Baraka();
  private static final Fighter subZero = new SubZero();


  public static void main(String[] args) {

    final Random rand = new Random();
    double draw = rand.nextDouble(1.0);

    final Fighter first = draw > 0.5 ? baraka : subZero;
    final Fighter second = first.equals(baraka) ? subZero : baraka;

    while (first.getHealth() > 0 && second.getHealth() > 0) {
      fight(first, second);
      if (second.getHealth() > 0) {
        fight(second, first);
      }
    }

    printStatistic();

  }

  private static void fight(final Fighter hitter, final Fighter struck) {
    System.out.println("hitter: " + hitter.getName() + ", struck: " + struck.getName());
    if (hitter.isFight()) {
      hitter.addStrike();
      boolean isGetInjured = struck.injure();
      if (isGetInjured) {
        hitter.addTargetStrike();
        System.out.println(hitter.getName() + " hits " + struck.getName());
        System.out.println("Ring is " + hitter.getColor());
      }
      if (struck.getHealth() <= 0) {
        System.out.println("Win " + hitter.getName());
      }
    }
  }

  private static void printStatistic() {
    System.out.println(baraka.getName() + " hits " + baraka.getCounters().getAllStrikes());
    System.out.println(subZero.getName() + " hits " + subZero.getCounters().getAllStrikes());
    System.out.println(baraka.getName() + " hits target " + baraka.getCounters().getTargetStrike());
    System.out.println(subZero.getName() + " hits target " + subZero.getCounters().getTargetStrike());
    System.out.println(baraka.getName() + " received power " + baraka.getCounters().getReceivedPower());
    System.out.println(subZero.getName() + " received power " + subZero.getCounters().getReceivedPower());
  }

}

