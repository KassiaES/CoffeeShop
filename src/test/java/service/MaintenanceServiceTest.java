package service;

import entity.CoffeeShop;
import junit.framework.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MaintenanceServiceTest {

    @Mock
    CoffeeShop coffeeShop;
    @InjectMocks
    MaintenanceServiceImpl maintenanceService;

    @BeforeEach
    public void before() {
        MaintenanceService maintenanceService = new MaintenanceServiceImpl();
        MockitoAnnotations.openMocks(this);
        System.out.println("Before");
    }

    @AfterEach
    public void after() {
        System.out.println("After");
    }

    // testes metodo cleanup
    @Test
    public void coffeShopOnlyCleanAfterClose() {
        CoffeeShop coffeeShop = new CoffeeShop("CoffeHolic", "Batman Alley", "999-9999", 30, true);
        coffeeShop.setClean(false);
        maintenanceService.cleanUp(coffeeShop);
        Assert.assertFalse(coffeeShop.isClean());
        System.out.println("Coffe Shop can only clean after close");
    }
    @Test
    public void coffeShopMustCleanCorrectly() {
        CoffeeShop coffeeShop = new CoffeeShop("CoffeHolic", "Batman Alley", "999-9999", 30,false);
        maintenanceService.cleanUp(coffeeShop);
        Assert.assertTrue(coffeeShop.isClean());
        System.out.println("Coffe Shop must clean properly");
    }

    // testes metodo stockReplenishment
    @Test
    public void coffeShopOnlyRestockAfterClose() {
        CoffeeShop coffeeShop = new CoffeeShop("CoffeHolic", "Batman Alley", "999-9999", 30, true);
        coffeeShop.setStockFull(false);
        maintenanceService.stockReplenishment(coffeeShop);
        Assert.assertFalse(coffeeShop.isStockFull());
        System.out.println("Coffe Shop can only restock after close");
    }
    @Test
    public void coffeShopMustRestockCorrectly() {
        CoffeeShop coffeeShop = new CoffeeShop("CoffeHolic", "Batman Alley", "999-9999", 30, false);
        coffeeShop.setStockFull(false);
        maintenanceService.stockReplenishment(coffeeShop);
        Assert.assertTrue(coffeeShop.isStockFull());
        System.out.println("Coffe Shop must restock after properly");
    }
}
