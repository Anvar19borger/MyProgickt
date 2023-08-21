package lesson_23;

public class AutoPilotBus {

    private final int id;
    private String model;

    private final Bus bus;

    private boolean isActive; // false

    static int counter;

    public AutoPilotBus(String model, Bus bus) {
        this.model = model;
        this.bus = bus;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Bus getBus() {
        return bus;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void driveBus() {
        turnOn();
        System.out.println("Автопилот id:" + id +
                " управляет автобусом id:"
                + bus.getId() + " " + bus.getModel());
    }

    public void turnOff() {
        isActive = false;
        System.out.println("Автопилот " + id + " выключен");
    }

    public void turnOn() {
        isActive = true;
        System.out.println("Автопилот " + id + " включен");
    }

    public String toString() {
        return "{id:" + id +
                "; model:" + model +
                "; встроен в автобус id:" + bus.getId()
                + "}";
    }
}
