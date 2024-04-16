package org.example.exo2;

public class OrderService {
    private OrderDao orderDao;

    // Constructeur
    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void createOrder(Order order) {
        orderDao.saveOrder(order);
    }

}