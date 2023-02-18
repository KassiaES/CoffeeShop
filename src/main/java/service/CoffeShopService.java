package service;

import entity.CoffeShop;

public interface CoffeShopService {

    void toOpen(CoffeShop coffeShop);
    void toClose(CoffeShop coffeShop);
    void orderCoffe (CoffeShop coffeShop, int plusCoffe) throws Exception;
    void serveCoffe (CoffeShop coffeShop, int lessCoffe) throws Exception;
    String currentState (CoffeShop coffeShop);

}
