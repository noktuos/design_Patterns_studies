package company.structural.proxy;



public class AccessToInternet implements Internet{


    @Override
    public void connectTo(String URL) throws Exception {
        System.out.println("Connectando.");
        System.out.println("Connectando..");
        System.out.println("Connectando... a " + URL);
    }
}
