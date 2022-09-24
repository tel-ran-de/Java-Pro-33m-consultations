package pizza;

import workers.Cook;
import workers.Deliveryman;
import workers.Manager;
import workers.Workable;

public enum PizzaStatus implements WhatsGoingOn {

  ORDERED(7, "pizza is ordered", new Manager("Mickael")) {
    @Override
    public boolean isOrdered() {
      return true;
    }
  },
  READY(5, "pizza is ready, waiting for delivery", new Cook("Miron")) {
    @Override
    public boolean isReady() {
      return true;
    }
  },
  DELIVERED(1, "pizza is delivered", new Deliveryman("Vasiliy")) {
    @Override
    public boolean isDelivered() {
      return true;
    }
  };

  private int timeToOperationInHour;
  private String whatsGoingOn;

  Workable worker;

  PizzaStatus(int timeToOperationInHour, String whatsGoingOn, Workable worker) {
    this.timeToOperationInHour = timeToOperationInHour;
    this.whatsGoingOn = whatsGoingOn;
    this.worker = worker;
  }

  public Workable getWorker() {
    return worker;
  }

  public int getTimeToOperationInHour() {
    return timeToOperationInHour;
  }

  public String getWhatsGoingOn() {
    return whatsGoingOn;
  }

  @Override
  public String toString() {
    return getWhatsGoingOn();
  }

  @Override
  public boolean isOrdered() {
    return false;
  }

  @Override
  public boolean isReady() {
    return false;
  }

  @Override
  public boolean isDelivered() {
    return false;
  }
}
