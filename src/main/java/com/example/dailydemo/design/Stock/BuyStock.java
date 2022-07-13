package com.example.dailydemo.design.Stock;

/**
 * @author: dyb
 * @Date: 2022/6/29
 * @Description:
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}