package BehavioralPattern.Builder.concreteBuilder;

import BehavioralPattern.Builder.builder.OrderBuilder;
import BehavioralPattern.Builder.product.order.Order;
import BehavioralPattern.Builder.product.type.BreadType;
import BehavioralPattern.Builder.product.type.OrderType;
import BehavioralPattern.Builder.product.type.SauceType;
import BehavioralPattern.Builder.product.type.VegetableType;


public class FastFoodOrderBuilder implements OrderBuilder {

    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }

}