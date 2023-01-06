import java.util.Objects;

public class Mechanic<G extends Transport> {
    private String fullName;
    private String company;
    private String category;
    private G car;

    public Mechanic(String fullName, String company, String category, G car) {
        this.fullName = fullName;
        this.company = company;
        this.category = category;
        this.car = car;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void doMaintenance() {
    }

    public void fixTheCar() {
    }

    public class MechanicB extends Mechanic<Passenger> {

        public MechanicB(String fullName, String company, String category, Passenger car) {
            super(fullName, company, category, car);
        }
    }

    public class MechanicC extends Mechanic<Truck> {

        public MechanicC(String fullName, String company, String category, Truck car) {
            super(fullName, company, category, car);
        }
    }

    public class MechanicD extends Mechanic<Bus> {
        public MechanicD(String fullName, String company, String category, Bus car) {
            super(fullName, company, category, car);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(fullName, mechanic.fullName) && Objects.equals(company, mechanic.company) && Objects.equals(category, mechanic.category) && Objects.equals(car, mechanic.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company, category, car);
    }


}
