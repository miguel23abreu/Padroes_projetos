package abstract_factory;

public class Abstract_factory {
        public static void main(String[] args) {
            veiculoEconomico_fac veiculo_economico = new veiculoEconomico_fac();
            System.out.println(veiculo_economico.CreateCarro());
            veiculoLuxo_fac veiculo_luxo = new veiculoLuxo_fac();
            System.out.println(veiculo_luxo.CreateMoto());
            veiculoModesto_fac veiculo_modesto = new veiculoModesto_fac();
            System.out.println(veiculo_modesto.CreateCarro());
            
    }
    
}
