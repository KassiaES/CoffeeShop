package service;

import entity.CoffeShop;
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
    CoffeShop coffeShop;
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
        CoffeShop coffeShop = new CoffeShop("CoffeHolic", "Batman Alley", "999-9999", 30, true);
        coffeShop.setClean(false);
        maintenanceService.cleanUp(coffeShop);
        Assert.assertFalse(coffeShop.isClean());
        System.out.println("Coffe Shop can only clean after close");
    }
    @Test
    public void coffeShopMustCleanProperly() {
        CoffeShop coffeShop = new CoffeShop("CoffeHolic", "Batman Alley", "999-9999", 30,false);
        maintenanceService.cleanUp(coffeShop);
        Assert.assertTrue(coffeShop.isClean());
        System.out.println("Coffe Shop must clean properly");
    }

    // testes metodo stockReplenishment
    @Test
    public void coffeShopOnlyRestockAfterClose() {
        CoffeShop coffeShop = new CoffeShop("CoffeHolic", "Batman Alley", "999-9999", 30, true);
        coffeShop.setStockFull(false);
        maintenanceService.stockReplenishment(coffeShop);
        Assert.assertFalse(coffeShop.isStockFull());
        System.out.println("Coffe Shop can only restock after close");
    }
    @Test
    public void coffeShopMustRestockProperly() {
        CoffeShop coffeShop = new CoffeShop("CoffeHolic", "Batman Alley", "999-9999", 30, false);
        coffeShop.setStockFull(false);
        maintenanceService.stockReplenishment(coffeShop);
        Assert.assertTrue(coffeShop.isStockFull());
        System.out.println("Coffe Shop must restock after properly");
    }
}
