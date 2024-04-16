package org.example.exo2;

public class OrderController {
    private OrderService orderService;

    // Constructeur
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // Méthode pour créer une commande
    public void createOrder(Order order) {
        orderService.createOrder(order);
    }
}
