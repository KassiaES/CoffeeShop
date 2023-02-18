package service;

import entity.CoffeeShop;

public class CoffeeShopServiceImpl implements CoffeeShopService {



    @Override
    public void toOpen(CoffeeShop coffeeShop) {
        coffeeShop.setOpen(true);
    }

    @Override
    public void toClose(CoffeeShop coffeeShop) {
        if (coffeeShop.getCurrentcapacity() == 0) {
            coffeeShop.setOpen(false);
        } else {
            coffeeShop.setOpen(true);
        }

    }

    @Override
    public void orderCoffe(CoffeeShop coffeeShop, int plusCoffe) throws Exception {
        if(plusCoffe <= 0) {
            throw new Exception("number of coffees must be greater than zero");
        }
        if(coffeeShop.isOpen()) {
            if (coffeeShop.getCurrentcapacity() == coffeeShop.getMaximumCapacity()){
                coffeeShop.setCurrentcapacity(coffeeShop.getMaximumCapacity());
            } else {
                coffeeShop.setCurrentcapacity(coffeeShop.getCurrentcapacity() + plusCoffe);
            }

        } else coffeeShop.setCurrentcapacity(0);
    }

    @Override
    public void serveCoffe(CoffeeShop coffeeShop, int lessCoffe) throws Exception {
        if(lessCoffe < 1) {
            throw new Exception("number of coffes must be greater than zero");
        }
        if((coffeeShop.getCurrentcapacity() - lessCoffe) <= 0) {
            coffeeShop.setCurrentcapacity(0);
        } else {
            coffeeShop.setCurrentcapacity(coffeeShop.getCurrentcapacity() - lessCoffe);
        }
        coffeeShop.setClean(false);
        coffeeShop.setStockFull(false);
    }

    @Override
    public String currentState(CoffeeShop coffeeShop) {
        return "The Coffe Shop is open? " +
                coffeeShop.isOpen() +
                "we are serving: " +
                coffeeShop.getCurrentcapacity() +
                " people";
    }
}
