import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Passenger bmw = new Passenger("BMW", "Z8", 215);
        Passenger kia = new Passenger("KIA", "Sportage 4-го поколения", 180);
        Passenger lada = new Passenger("Lada", "110", 120);
        Passenger kia2 = new Passenger("KIA", "Picanto", 180);

        Truck gaz = new Truck("Газ", "3221", 120);
        Truck ural = new Truck("Урал", "Next", 200);
        Truck kamaz = new Truck("Камаз", "5320", 160);
        Truck kamaz2 = new Truck("Камаз", "4310", 160);

        Bus gaz1 = new Bus("Газ", "3221", 120);
        Bus mercedes = new Bus("Mercedes-Benz", "O407", 190);
        Bus mercedes1 = new Bus("Mercedes-Benz", "O879", 190);
        Bus gaz2 = new Bus("Газ", "O879", 190);


        Driver<Bus> kirill = new Driver<>("Иванов Кирилл Алексеевич", gaz1);
        Driver<Bus> lari = new Driver<>("Лари Иванов", gaz2);
        kirill.doPitStop(gaz1);
        Mechanic<Bus> tim = new Mechanic<>("Тимур Шалиев", "Моторс", "Только автобусы", gaz1);
        Mechanic hans = new Mechanic("Ганс Андерсон", "Красная шапочка", "Любые машины", kia2);
        Sponsor infinity = new Sponsor("компания Инфинити", 250000);
        ural.addSponsor(infinity);

//        System.out.println(bmw);
//        bmw.doPitStop(String reasons);
//        bmw.showBestTimeOfCircle();
//        bmw.showMaxSpeed();
//
//        System.out.println(kia);
//        kia.doPitStop();
//        kia.showBestTimeOfCircle();
//        kia.showMaxSpeed();
//        System.out.println(lada);
//        lada.doPitStop();
//        lada.showBestTimeOfCircle();
//        lada.showMaxSpeed();
//        System.out.println(kia2);
//        kia2.doPitStop();
//        kia2.showBestTimeOfCircle();
//        kia2.showMaxSpeed();

//        System.out.println(gaz);
//        gaz.doPitStop();
//        gaz.showBestTimeOfCircle();
//        gaz.showMaxSpeed();
//        System.out.println(ural);
//        ural.doPitStop();
//        ural.showBestTimeOfCircle();
//        ural.showMaxSpeed();
//        System.out.println(kamaz);
//        kamaz.doPitStop();
//        kamaz.showBestTimeOfCircle();
//        kamaz.showMaxSpeed();
//        System.out.println(kamaz2);
//        kamaz2.doPitStop();
//        kamaz2.showBestTimeOfCircle();
//        kamaz2.showMaxSpeed();

//        System.out.println(gaz1);
        gaz1.doPitStop(Bus.ReasonsCommand.RSN_OIL.name());
//        gaz1.showBestTimeOfCircle();
//        gaz1.showMaxSpeed();
//        System.out.println(mercedes);
//        mercedes.doPitStop();
//        mercedes.showBestTimeOfCircle();
//        mercedes.showMaxSpeed();
//        System.out.println(mercedes1);
//        mercedes1.doPitStop();
//        mercedes1.showBestTimeOfCircle();
//        mercedes1.showMaxSpeed();
//        System.out.println(gaz2);
//        gaz2.doPitStop();
//        gaz2.showBestTimeOfCircle();
//        gaz2.showMaxSpeed();
        gaz1.addDriver(kirill);
        gaz1.addMechanic(tim);
        gaz1.addSponsor(infinity);

        HashMap<Transport, Mechanic> auto = new HashMap<>();
        auto.put(gaz2, tim);
        auto.put(kia2, hans);
        System.out.println(auto);

        Set<Driver> drivers = new HashSet<>();
        drivers.add(kirill);
        drivers.add(lari);

        for (Driver driver : drivers) {
            System.out.println(drivers);
        }
    }


    public static void checkCar(Transport... transports) {
        int count = 0;
        for (Transport transport : transports) {
            if (!transport.passDiagnostics()) {
                try {
                    throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");

                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                count++;
            }
        }
        System.out.println("Диагностику прошли " + count + " iz " + transports.length + " auto ");
    }


}
