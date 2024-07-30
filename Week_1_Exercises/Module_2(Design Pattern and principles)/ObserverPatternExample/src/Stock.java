//This is the subject interface with methods to register, de_register, and notify observers.

public interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}
