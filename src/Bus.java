import java.util.List;
import java.util.Set;
public class Bus extends Transport implements Competing {

    public enum ReasonsCommand {
        RSN_WHEEL("Поменять колесо"), RSN_OIL("Поменять масло");
        public static ReasonsCommand findByVoiceCommand(String voiceCommand){
            for (ReasonsCommand reasons : values()) {
                if (reasons.getVoiceCommand().equals(voiceCommand)){
                  return reasons;
                }

            }
            return null;
        }
        private String voiceCommand;

        ReasonsCommand(String voiceCommand) {
            this.voiceCommand = voiceCommand;
        }

        public String getVoiceCommand() {
            return voiceCommand;
        }
    }

    private ReasonsCommand[] trainedReasons = new ReasonsCommand[0];

    public Bus(String brand, String model, int engineCapacity) {
        super(brand, model, engineCapacity);
    }

    @Override
    public boolean passDiagnostics() {
        return false;
    }

    @Override
    public String[] reasonForTheStop() {
        String[] reasons = new String[trainedReasons.length];
        for (int i = 0; i < trainedReasons.length; i++) {
            reasons[i] = trainedReasons[i].name();

        }

        return reasons;
    }

    @Override
    public String[] allReasons() {
        String[] reasons = new String[ReasonsCommand.values().length];
        for (int i = 0; i < reasons.length; i++) {
            reasons[i] = ReasonsCommand.values()[i].name();

        }
        return reasons;
    }

    public void doPitStop(String reasons) {
        System.out.println("Автобус " + getBrand() + getModel() + " заезжает на остановку на проверку. Нужно " + reasons);
        System.out.println("Автобус " + getBrand() + getModel() + " прошел проверку и уезжает с пит-стопа.");
        ReasonsCommand reasonsCommand = ReasonsCommand.valueOf(reasons);
        if (reasonsCommand == null){
            reasonsCommand = ReasonsCommand.findByVoiceCommand(reasons);
        }
        switch (reasonsCommand) {
            case RSN_WHEEL:
                System.out.println("Автобусу меняют колесо");
                break;
            case RSN_OIL:
                System.out.println("Автобусу меняют масло");
                break;
            default:
                System.out.println("Нет причины для остановки");
        }
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
        double result = Math.round(value1);
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
