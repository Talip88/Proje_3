package service;

import database.Database;
import entity.Item;
import exception.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ItemServiceImp implements ItemService {

    // GetAllItems methodu Database e gidip oradan butun item lari alir ve bir List olarak return eder...
    @Override
    public List<Item> getAllItems() {

        return Database.items;
        }
    // getItemById methodu parametre olarak aldigi id ile Database de boyle bir item var mi diye kontrol eder,
    // yoksa, ItemNotFound exception firlatir, varsa ilgili item i return eder...
    @Override
    public Item getItemById(int id) throws ItemNotFoundException {
        for (Item item : getAllItems()) {
            if (item.getId() == id) {
                return item;
            }
        }
        throw new ItemNotFoundException("Böyle bir ürün stoklarımızda bulunmamaktadır");
    }
        // addItem methodu, parametre olarak aldigi item i Database deki items listesine ekler...
    @Override
    public void addItem(Item item) {
        Database.items.add(item);
    }
    // deleteItemById methodu parametre olarak aldigi id ile Database de o urunu arar, bulamazsa ItemnotFound exception firlatir
    // ilgili item mevcut ise onu Database list inden siler...

    @Override
    public void deleteItemById(int id) throws ItemNotFoundException {
        for (Item item : getAllItems()) {
            if (item.getId() == id) {
                deleteItemById(id);
            }
        }
        throw new ItemNotFoundException("Böyle bir ürün stoklarımızda bulunmamaktadır");
    }
    // updateItem methodu parametre olarak aldigi Item i Database de arar, yoksa ItemNotFound exception firlatir,
    // Varsa Datalase deki items listesinden silip, guncel halini Database List ine ekler...
    @Override
    public void updateItem(Item item) throws ItemNotFoundException {
        for (Item item1 : getAllItems()) {
        if(item1.getId()== item.getId()){
            Database.items.remove(item.getId());
            addItem(item);
        }

        }
        throw new ItemNotFoundException("Böyle bir ürün stoklarımızda bulunmamaktadır");
    }























}
