package proxy;

// Implementação real da Internet
class InternetReal implements Internet {
    @Override
    public void conectar(String site) {
        System.out.println("Conectando ao site: " + site);
    }
}
