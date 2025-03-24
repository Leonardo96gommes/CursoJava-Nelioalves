package application;

import entities.OrderS;
import entities.enums.OrderStatus;

import java.util.Date;

public class Enum {
    public static void main(String[] args) {
        OrderS order = new OrderS (1080, new Date(), OrderStatus.PENDING);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
