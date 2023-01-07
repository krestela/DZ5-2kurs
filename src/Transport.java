import java.util.*;
import java.util.Set;

public class Transport {
    private static int count;

    public static int getCount() {
        return count;
    }

    private String brand;

    private String model;


    private int engineCapacity;

    private boolean diagnosticPassed;

    private Set<Sponsor> sponsor;

    private Set<Driver> driver;

    private Set<Mechanic> mechanic;

    public Transport(String brand, String model, int engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;

        sponsor = new HashSet<>();
        driver = new HashSet<>();
        mechanic = new HashSet<>();
        count++;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isDiagnosticPassed() {
        return diagnosticPassed;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        if (engineCapacity == Integer.parseInt(null)) {
            this.engineCapacity = engineCapacity;
        }
    }

    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void stopMoving() {
        System.out.println("Закончить движение");
    }


    public String toString() {
        return brand + ". Mодель " + model + ". Объем двигателя: " + engineCapacity + " л.";

    }

    public boolean passDiagnostics() {
        return false;
    }

    public Set<Sponsor> getSponsor() {
        return getSponsor();
    }

    public void addSponsor(Sponsor sponsor) {
        this.sponsor.add(sponsor);
        System.out.println(sponsor.getName() + " спонсирует " + getBrand());
    }

    public Set<Driver> getDriver() {
        return getDriver();
    }

    public void addDriver(Driver driver) {
        this.driver.add(driver);
        System.out.println(driver.getFullName() + " водит " + getBrand());
    }

    public Set<Mechanic> getMechanic() {
        return getMechanic();
    }

    public void addMechanic(Mechanic mechanic) {
        this.mechanic.add(mechanic);
        System.out.println(mechanic.getFullName() + " чинит " + getBrand());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return engineCapacity == transport.engineCapacity && diagnosticPassed == transport.diagnosticPassed && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(sponsor, transport.sponsor) && Objects.equals(driver, transport.driver) && Objects.equals(mechanic, transport.mechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineCapacity, diagnosticPassed, sponsor, driver, mechanic);
    }
}
