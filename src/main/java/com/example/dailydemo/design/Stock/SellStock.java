package com.example.dailydemo.design.Stock;

/**
 * @author: dyb
 * @Date: 2022/6/29
 * @Description:
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
