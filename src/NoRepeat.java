import java.util.HashSet;
import java.util.Set;

public class NoRepeat {
    private Set<Transport> transports = new HashSet<>();

    public void add(Transport transport) {
        if (transports.contains(transport)){
            throw new IllegalArgumentException("Такой транспорт уже есть");
        }
        transports.add(transport);
    }
    public void remove (Transport transport){
        transports.remove(transport);
    }

    private Set<Bus> buses = new HashSet<>();

    public void add(Bus bus) {
        if (transports.contains(bus)){
            throw new IllegalArgumentException("Такой транспорт уже есть");
        }
        transports.add(bus);
    }
    public void remove (Bus bus){
        transports.remove(bus);
    }
}
