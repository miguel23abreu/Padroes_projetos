package observer_1;

public class ConcreteObserver extends Observers {
    
    private ConcretSubject cs;
    public ConcreteObserver(ConcretSubject cs) {
        this.cs = cs;
        cs.attatch(this);
    }
    @Override
    public void update() {
        System.out.println("observer notificated - state: " + cs.getState());
    }
    
}
