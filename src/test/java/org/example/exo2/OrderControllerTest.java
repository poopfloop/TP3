package org.example.exo2;

import org.example.exo1.User;
import org.example.exo1.UserRepository;
import org.example.exo1.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderControllerTest {
    OrderService orderService = mock(OrderService.class);
    OrderDao orderDao = mock(OrderDao.class);

    Order testedOrder = new Order(1, "Product A", 5, 100.0);
    @Test
    public void createOrderSucces(){

        OrderController orderController = new OrderController(orderService);
        orderController.createOrder(testedOrder);
        verify(orderService).createOrder(testedOrder);
        //verify(orderDao).saveOrder(testedOrder);

    }

    @Test
    public void createOrderFailure(){



    }

}