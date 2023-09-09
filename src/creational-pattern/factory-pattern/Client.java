
public class Client {

    public static void main(String[] args) {

        CurrencyFactory currencyFactory = new CurrencyFactory();
         Currency currency = currencyFactory.getCurrency("Indian");

        System.out.println("The Currency Symbol of Indian Rupee ==>" + currency.getSymbol());

    }
}