package observer_1;

public class ConcretSubject extends Subject{
    private String State;

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
        notifyObservers();
    }
    
}
