package statistics;

public class Counters {

  private static final int ZERO = 0;

  private int currentStrike = 0;
  private int allStrikes = 0;
  private int targetStrike = 0;

  private int receivedPower = 0;
  private int power = 3;

  public Counters() {
  }

  public void resetCurrentStrike() {
    currentStrike = ZERO;
  }

  public void plusCurrentStrike() {
    currentStrike++;
  }

  public void plusTargetStrike() {
    targetStrike++;
  }

  public void plusAllStrike() {
    allStrikes++;
  }

  public void plusPower() {
    power++;
    receivedPower++;
  }

  public void minusPower() {
    this.power--;
  }

  public int getCurrentStrike() {
    return currentStrike;
  }

  public int getAllStrikes() {
    return allStrikes;
  }

  public int getTargetStrike() {
    return targetStrike;
  }

  public int getPower() {
    return power;
  }

  public int getReceivedPower() {
    return receivedPower;
  }

}
