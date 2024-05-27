package proxy;

// Interface para a Internet
// Classe de teste
public class Proxy {
    public static void main(String[] args) {
        Internet internet = new InternetProxy();

        internet.conectar("site1.com");
        internet.conectar("site3.com");
        internet.conectar("musica.com");
        internet.conectar("facul.com");
        
    }
}
