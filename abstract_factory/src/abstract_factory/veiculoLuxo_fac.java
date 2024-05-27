package abstract_factory;

import abstract_factory.Luxo.carroLuxo;
import abstract_factory.Luxo.motoLuxo;

public class veiculoLuxo_fac implements veiculo_fac {

    @Override
    public carro CreateCarro() {
        System.out.println("Carro de luxo criado");
        return new carroLuxo();
    }

    @Override
    public moto CreateMoto() {
        System.out.println("Moto de luxo criada");
        return new motoLuxo();
    }
    
}
