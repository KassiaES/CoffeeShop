package service;

import entity.CoffeeShop;

public interface MaintenanceService {

    void cleanUp (CoffeeShop coffeeShop);
    void stockReplenishment(CoffeeShop coffeeShop);
}
