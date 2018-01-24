package client;

public class ConverterClient {
    public static void main(String[] args){
        CurrencyConverterService converterService = new CurrencyConverterService();
        CurrencyConverter portCurrencyConverter = converterService.getCurrencyConverterPort();
        System.out.println("portCurrencyConverter.usdToEur = "+portCurrencyConverter.usdToEur(20));
    }
}
