package service;

import entity.CoffeShop;

public class MaintenanceServiceImpl implements MaintenanceService{
    @Override
    public void cleanUp(CoffeShop coffeShop) {
        if (coffeShop.isOpen()) {
                coffeShop.setClean(false);
        } else  {
            coffeShop.setClean(true);
        }


    }

    @Override
    public void stockReplenishment(CoffeShop coffeShop) {
        if (coffeShop.isOpen()) {
            coffeShop.setStockFull(false);
        } else {
            coffeShop.setStockFull(true);
        }
    }

}
