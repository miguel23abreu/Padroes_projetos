package proxy;

/// Proxy para controlar o acesso à Internet
class InternetProxy implements Internet {
    private InternetReal internetReal = new InternetReal();
    private static final String[] SITES_PROIBIDOS = {"site1.com", "site2.com", "jogos.com"};

    @Override
    public void conectar(String site) {
        if (verificarPermissao(site)) {
            internetReal.conectar(site);
        } else {
            System.out.println("Acesso negado ao site: " + site);
        }
    }

    private boolean verificarPermissao(String site) {
        for (String siteProibido : SITES_PROIBIDOS) {
            if (site.equalsIgnoreCase(siteProibido)) {
                return false;
            }
        }
        return true;
    }
}