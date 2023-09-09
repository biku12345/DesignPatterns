public class CurrencyFactory {


    public Currency getCurrency(String currencyType){

        switch (currencyType) {
            case "Indian":
                return new IndianRupee();
            default:
                return new AmericanDollar();

        }


    }
}