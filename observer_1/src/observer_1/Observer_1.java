package observer_1;

public class Observer_1 {
    public static void main(String[] args) {
        Subject s = new ConcretSubject();
        
        Observers o1 = new ConcreteObserver((ConcretSubject) s);
        Observers o2 = new ConcreteObserver((ConcretSubject) s);
        Observers o3 = new ConcreteObserver((ConcretSubject) s);
        
        s.detach(o1);
        //s.detach(o2);
        
        s.setState("novo estado");
        s.setState("estado atualizado");
    }
    
}
