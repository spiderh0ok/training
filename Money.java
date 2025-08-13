public enum Money {

    DOLLAR((double amount) -> 1*amount),
    SHEKEL((double amount) -> 0.3*amount),
    EURO((double amount) -> 1.15*amount),
    ST((double amount) -> 1+amount);

    final Exchange exchange;

    Money (Exchange exchange){
        this.exchange = exchange;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public double toDollar(double amount){
        return exchange.moneyExtcange(amount);

    }
}
