package service;

import entity.Item;
import exception.ItemNotFoundException;

import java.util.List;

public interface ItemService {


    List<Item> getAllItems();

    Item getItemById(int id) throws ItemNotFoundException;

    void addItem(Item item);

    void deleteItemById(int id) throws ItemNotFoundException;

    void updateItem(Item item) throws ItemNotFoundException;


}
