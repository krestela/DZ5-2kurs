import java.util.List;
import java.util.Set;
public class Passenger extends Transport implements Competing {
    public Passenger(String brand, String model, int engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public boolean passDiagnostics() {
        return false;
    }


    @Override
    public String[] reasonForTheStop() {
        return new String[0];
    }

    @Override
    public String[] allReasons() {
        return new String[0];
    }

    @Override
    public void doPitStop(String reasons) {
        System.out.println("Автомобиль " + getBrand() + getModel() + " заезжает на остановку для проверки.");
        System.out.println("Автомобиль " + getBrand() + getModel() + " прошел проверку и уезжает с пит-стопа.");
    }

    @Override
    public void showBestTimeOfCircle() {
        double anyNumber = 2.0f;
        double anyNumber1 = 1 + Math.random() * (anyNumber);
        double result1 = Math.round(anyNumber1);
        System.out.printf("Лучшее время " + getBrand() + getModel() + " составляет " + result1 + " минут\n");

    }

    @Override
    public void showMaxSpeed() {
        double value = 200.f;
        double value1 = 100 + Math.random() * value;
        double result = Math.round (value1);
        System.out.format("Максимальная скорость автомобиля " + getBrand() + getModel() + " составляет " + result + " км/ч\n");
    }

    @Override
    public Set<Sponsor> getSponsor() {
        return super.getSponsor();
    }

    @Override
    public void addSponsor(Sponsor sponsor) {
        super.addSponsor(sponsor);
    }

    @Override
    public Set<Driver> getDriver() {
        return super.getDriver();
    }

    @Override
    public void addDriver(Driver driver) {
        super.addDriver(driver);
    }

    @Override
    public Set<Mechanic> getMechanic() {
        return super.getMechanic();
    }

    @Override
    public void addMechanic(Mechanic mechanic) {
        super.addMechanic(mechanic);
    }

}
