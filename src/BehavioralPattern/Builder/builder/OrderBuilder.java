package BehavioralPattern.Builder.builder;

import BehavioralPattern.Builder.product.order.Order;
import BehavioralPattern.Builder.product.type.BreadType;
import BehavioralPattern.Builder.product.type.OrderType;
import BehavioralPattern.Builder.product.type.SauceType;
import BehavioralPattern.Builder.product.type.VegetableType;

public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}