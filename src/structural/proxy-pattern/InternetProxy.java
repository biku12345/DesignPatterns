public class InternetProxy implements Internet{

    private Internet internet = new RealInternet();
    private static  List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<>();
        bannedSites.add("www.gaurav.kumar");
    }


    @Override
    public void connectTo(String host) {
        if(bannedSites.contains(host)) {
            System.out.println("Access Dined");
            return;
        }

        System.out.println("Access Granted");
        internet.connectTo(host);
    }
}
