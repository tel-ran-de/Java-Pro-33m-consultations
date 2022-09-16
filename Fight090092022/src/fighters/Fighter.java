package fighters;

import statistics.Counters;

import java.util.Random;

public interface Fighter {

  Random RAND = new Random();
  int DAMAGE = 10;

  String getName();

  default boolean isFight() {
    final boolean isFight = RAND.nextDouble() <= 0.4;
    System.out.println(getName() + " have " + isFight + " " +
      "for fight");
    if (!isFight) {
      getCounters().resetCurrentStrike();
    }
    return isFight;
  }

  default void addStrike() {
    final Counters counters = getCounters();
    counters.plusAllStrike();
    counters.plusCurrentStrike();
    if (counters.getCurrentStrike() == 2) {
      counters.plusPower();
      counters.resetCurrentStrike();
    }
  }

  default void addTargetStrike() {
    getCounters().plusTargetStrike();
  }

  boolean injure();

  default boolean hasShield() {
    return getCounters().getPower() > 0;
  }

  int getHealth();

  String getColor();

  Counters getCounters();

  private void doSom() {
    System.out.println("doSom");
  }

}
