package observer;

/**
 *
 * @author Luan Gomes
 */
public interface Subject {
    
    public void removeObserver(Observer observer);
    
    public void addObserver(Observer observer);
    
    public void notifyObservers();
    
}
