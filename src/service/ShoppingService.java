package service;

import entity.Cart;
import entity.User;
import exception.ItemNotFoundException;

public interface ShoppingService {



    void completePurchase(User currentUser, Cart shoppingCart) throws ItemNotFoundException;
}
