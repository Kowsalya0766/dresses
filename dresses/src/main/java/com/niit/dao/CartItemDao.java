package com.niit.dao;

import java.util.List;

import com.niit.model.CartItem;
import com.niit.model.CustomerOrder;
import com.niit.model.User;

public interface CartItemDao {
	
	void addToCart(CartItem cartItem);
	User getUser(String email);
	List<CartItem>getCart(String email); //select * from cartitem where user_email=?
    void removeCartItem(int cartItemId);
    CustomerOrder createCustomerOrder(CustomerOrder customerOrder);
}

