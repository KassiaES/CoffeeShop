package service;

import entity.CoffeeShop;

public interface CoffeeShopService {

    void toOpen(CoffeeShop coffeeShop);
    void toClose(CoffeeShop coffeeShop);
    void orderCoffe (CoffeeShop coffeeShop, int plusCoffe) throws Exception;
    void serveCoffe (CoffeeShop coffeeShop, int lessCoffe) throws Exception;
    String currentState (CoffeeShop coffeeShop);

}
