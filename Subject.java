public interface Subject {
    
    public void register(Observer newObserver);
    public void unregister(Observer existingObserver);
    public void notifyObserver();
    
}
