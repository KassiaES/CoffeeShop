package service;

import entity.CoffeeShop;

public class MaintenanceServiceImpl implements MaintenanceService{
    @Override
    public void cleanUp(CoffeeShop coffeeShop) {
        if (coffeeShop.isOpen()) {
                coffeeShop.setClean(false);
        } else  {
            coffeeShop.setClean(true);
        }


    }

    @Override
    public void stockReplenishment(CoffeeShop coffeeShop) {
        if (coffeeShop.isOpen()) {
            coffeeShop.setStockFull(false);
        } else {
            coffeeShop.setStockFull(true);
        }
    }

}
