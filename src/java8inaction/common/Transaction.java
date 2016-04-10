package java8inaction.common;

import lombok.Data;

/**
 * Created by arahansa on 2016-04-10.
 */
@Data
public class Transaction {
    private Currency currency;
    private Trader trader;
    private int year;
    private double value;

    public Transaction(Trader trader, int year, int value)
    {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
    public Transaction(Currency currency, double value) {
        this.currency = currency;
        this.value = value;
    }

    public Trader getTrader(){
        return this.trader;
    }

    public int getYear(){
        return this.year;
    }

    public double getValue(){
        return this.value;
    }

    public String toString(){
        return "{" + this.trader + ", " +
                "year: "+this.year+", " +
                "value:" + this.value +"}";
    }
}
