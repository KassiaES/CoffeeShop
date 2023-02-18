package service;

import entity.CoffeShop;

public class CoffeShopServiceImpl implements CoffeShopService {



    @Override
    public void toOpen(CoffeShop coffeShop) {
        coffeShop.setOpen(true);
    }

    @Override
    public void toClose(CoffeShop coffeShop) {
        if (coffeShop.getCurrentcapacity() == 0) {
            coffeShop.setOpen(false);
        } else {
            coffeShop.setOpen(true);
        }

    }

    @Override
    public void orderCoffe(CoffeShop coffeShop, int plusCoffe) throws Exception {
        if(plusCoffe <= 0) {
            throw new Exception("number of coffees must be greater than zero");
        }
        if(coffeShop.isOpen()) {
            if (coffeShop.getCurrentcapacity() == coffeShop.getMaximumCapacity()){
                coffeShop.setCurrentcapacity(coffeShop.getMaximumCapacity());
            } else {
                coffeShop.setCurrentcapacity(coffeShop.getCurrentcapacity() + plusCoffe);
            }

        } else coffeShop.setCurrentcapacity(0);
    }

    @Override
    public void serveCoffe(CoffeShop coffeShop, int lessCoffe) throws Exception {
        if(lessCoffe < 1) {
            throw new Exception("number of coffees must be greater than zero");
        }
        if((coffeShop.getCurrentcapacity() - lessCoffe) <= 0) {
            coffeShop.setCurrentcapacity(0);
        } else {
            coffeShop.setCurrentcapacity(coffeShop.getCurrentcapacity() - lessCoffe);
        }
        coffeShop.setClean(false);
        coffeShop.setStockFull(false);
    }

    @Override
    public String currentState(CoffeShop coffeShop) {
        return "The Coffe Shop is open? " +
                coffeShop.isOpen() +
                "we are serving: " +
                coffeShop.getCurrentcapacity() +
                " people";
    }
}
