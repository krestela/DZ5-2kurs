public interface Competing {
    String [] reasonForTheStop();
    String [] allReasons();

    void doPitStop(String reasons);

    void showBestTimeOfCircle();

    void showMaxSpeed();
}
