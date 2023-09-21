public class SocketAdapterImpl extends Socket implements SocketAdapter{



    @Override
    public Volt getVolt120() {
       Volt v = getVolt();
       return new Volt(v.getVolt());
    }

    @Override
    public Volt getVolt12() {
        Volt v = getVolt();
        return  new Volt(v.getVolt()/10);
    }

    @Override
    public Volt getVolt3() {
        Volt v = getVolt();
        return new Volt(v.getVolt()/40);

    }
}
