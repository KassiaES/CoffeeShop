package service;

import entity.CoffeShop;

public class MaintenanceService {

    public void cleanUp(CoffeShop coffeShop) {
        coffeShop.setClean(true);
    }

    public void stockReplenishment(CoffeShop coffeShop) {
        coffeShop.setStockFull(true);
    }

}
