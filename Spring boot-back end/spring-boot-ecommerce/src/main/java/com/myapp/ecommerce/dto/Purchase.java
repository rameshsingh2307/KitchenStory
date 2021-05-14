package com.myapp.ecommerce.dto;

import java.util.Set;

import com.myapp.ecommerce.entity.Customer;
import com.myapp.ecommerce.entity.Order;
import com.myapp.ecommerce.entity.OrderItem;

import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Order order;
    private Set<OrderItem> orderItems;

}
