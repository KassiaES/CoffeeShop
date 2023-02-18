package service;

import entity.CoffeShop;

public interface MaintenanceService {

    void cleanUp (CoffeShop coffeShop);
    void stockReplenishment(CoffeShop coffeShop);
}
