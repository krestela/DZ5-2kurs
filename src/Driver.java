import java.util.Objects;

public class Driver <T extends Transport> {
    public class DriverB extends Driver<Passenger>{

        public DriverB(String fullName, Passenger car) {
            super(fullName, car);
        }
    }
    public class DriverC extends Driver<Truck>{

        public DriverC(String fullName, String driverLicense, int experience, Truck car) {
            super(fullName, driverLicense, experience, car);
        }

        public DriverC(String fullName, Truck car) {
            super(fullName, car);
        }
    }

    public class DriverD extends Driver<Bus>{
        public DriverD(String fullName, String driverLicense, int experience, Bus car) {
            super(fullName, driverLicense, experience, car);
        }

        public DriverD(String fullName, Bus car) {
            super(fullName, car);
        }
    }
    private String fullName;

    private String driverLicense;

    private int experience;

    private T car;

    public Driver(String fullName, String driverLicense, int experience, T car) {
        this.fullName = fullName;
        this.driverLicense = driverLicense;
        this.experience = experience;
        this.car = car;
    }
    public Driver(String fullName, T car) {
        this.fullName = fullName;
        this.car = car;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.isEmpty() && !fullName.isBlank()) {
            this.fullName = fullName;
        }
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        if (driverLicense != null && !driverLicense.isEmpty() && !driverLicense.isBlank()) {
            this.driverLicense = fullName;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience == Integer.parseInt(null)) {
            this.experience = experience;
        }
    }

    public void doPitStop(T car) {

        }

    public void startWay(){
        System.out.println("Начать движение");
    }
    public void stop(){
        System.out.println("Остановить движение");
    }

    public void refuelTheCar(){
        System.out.println("Заправить машину");
    }

    @Override
    public String toString() {
        return "Bодитель " + fullName+ " управляет автомобилем " + car.getBrand() + car.getModel() + " и будет участвовать в заезде";
    }

    public static Boolean validateLicense(Boolean value) throws NoLicenseException{
        if (value == null || !value){
            throw new NoLicenseException("Не указана лицензия");
        }
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return experience == driver.experience && Objects.equals(fullName, driver.fullName) && Objects.equals(driverLicense, driver.driverLicense) && Objects.equals(car, driver.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experience, car);
    }
}
