package abstract_factory;

import abstract_factory.modesto.carroModesto;
import abstract_factory.modesto.motoModesta;

public class veiculoModesto_fac implements veiculo_fac {

    @Override
    public carro CreateCarro() {
        System.out.println("Carro modesto criado");
        return new carroModesto();
    }

    @Override
    public moto CreateMoto() {
        System.out.println("Moto modesta criada");
        return new motoModesta();
    }
    
}
