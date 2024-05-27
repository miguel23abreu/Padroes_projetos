package observer_1;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observers> observers = new ArrayList<>(); 
    
    public void attatch(Observers o){ //método da qual adicionará o observer na lista "observers"
        this.observers.add(o);
    }
    
    public void detach(Observers o){ //método da qual removerá o observer na lista "observers"
        this.observers.remove(o);
    }
    public void notifyObservers(){ //método da qual notificará o observer na lista "observers"
        for(Observers observer : observers){
            observer.update();
        }
    }

//    void setState(String novo_estado) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    void setState(String novo_estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}