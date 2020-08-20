package Creational.Builder2.builder;

import Creational.Builder2.product.order.Order;
import Creational.Builder2.product.type.BreadType;
import Creational.Builder2.product.type.OrderType;
import Creational.Builder2.product.type.SauceType;
import Creational.Builder2.product.type.VegetableType;

public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}