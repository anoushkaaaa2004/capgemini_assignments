package com.capgemini.junit_testing;

public class OrderService {

    public boolean canCancel(OrderStatus status) 
    {
        return status == OrderStatus.NEW;
    }
}
