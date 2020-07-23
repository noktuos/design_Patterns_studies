package company.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private Internet internet = new AccessToInternet();
    private static List<String> bannedUrl;

    static{
        bannedUrl = new ArrayList<>();
        bannedUrl.add("twitter.com");
        bannedUrl.add("facebook.com");
    }

    @Override
    public void connectTo(String URL) throws Exception {
        if(bannedUrl.contains(URL)){
            System.out.println("Url bloqueada: "+URL);
            throw new Exception("URL BLOQUEADA - CONSULTA CON TU PROVEEDOR");

        }
        internet.connectTo(URL);
    }
}
