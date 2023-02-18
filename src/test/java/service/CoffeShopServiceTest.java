package service;

import entity.CoffeShop;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CoffeShopServiceTest {
    @Mock
    CoffeShop coffeShop;

    @InjectMocks
    CoffeShopServiceImpl coffeShopService;


    @BeforeEach
    public void before() {
        MockitoAnnotations.openMocks(this);
        MaintenanceService maintenanceService = new MaintenanceServiceImpl();
        System.out.println("Before");
    }

    @AfterEach
    public void after() {
        System.out.println("After");
    }
    @Test
    public void deveabrircorretamente() {
        CoffeShop coffeShop = new CoffeShop("CoffeHolic", "Batman Alley", "999-9999", 30,false);
        coffeShopService.toOpen(coffeShop);
        Assertions.assertTrue(coffeShop.isOpen());
    }
}
