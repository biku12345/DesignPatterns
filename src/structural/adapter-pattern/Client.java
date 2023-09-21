public class Client {

    public static void main(String[] args) {
        Socket socket = new Socket();
        SocketAdapterImpl socketAdapter = new SocketAdapterImpl();
        Volt v1 = socketAdapter.getVolt3();
        System.out.println("Printing Volt");
        System.out.println(v1.getVolt());

        Volt v2 = socketAdapter.getVolt12();
        System.out.println("Printing Volt");
        System.out.println(v2.getVolt());

    }
}