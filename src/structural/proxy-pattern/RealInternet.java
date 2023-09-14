public class RealInternet implements Internet{




    @Override
    public void connectTo(String host) {
        System.out.println("Connect To Internet +"+ host);
    }
}