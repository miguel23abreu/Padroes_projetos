package abstract_factory;

import abstract_factory.economico.carroEconomico;
import abstract_factory.economico.motoEconomico;

public class veiculoEconomico_fac implements veiculo_fac {

    @Override
    public carro CreateCarro() {
        System.out.println("Carro economico criado");
        return new carroEconomico();
    }

    @Override
    public moto CreateMoto() {
        System.out.println("Moto economico economico");
        return new motoEconomico();
    }
    
}
