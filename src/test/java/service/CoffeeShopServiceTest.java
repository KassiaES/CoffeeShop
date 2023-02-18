package service;

import entity.CoffeeShop;
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
public class CoffeeShopServiceTest {
    @Mock
    CoffeeShop coffeeShop;

    @InjectMocks
    CoffeeShopServiceImpl coffeShopService;


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

    // testes metodo toOpen
    @Test
    public void coffeShopMustOpenCorrectly() {
        CoffeeShop coffeeShop = new CoffeeShop("CoffeHolic", "Batman Alley", "999-9999", 30,false);
        coffeShopService.toOpen(coffeeShop);
        Assertions.assertTrue(coffeeShop.isOpen());
    }

    // testes metodo toClose
    @Test
    public void coffeShopMustCloseCorrectly() {
        CoffeeShop coffeeShop = new CoffeeShop("CoffeHolic", "Batman Alley", "999-9999", 30,true);
        coffeShopService.toClose(coffeeShop);
        Assertions.assertFalse(coffeeShop.isOpen());
    }

    // testes metodo orderCoffe
    @Test
    public void orderCoffeMustRegisterOrderCorrectly() throws Exception {
        CoffeeShop coffeeShop = new CoffeeShop("CoffeHolic", "Batman Alley", "999-9999", 30,true);
        coffeeShop.setCurrentcapacity(5);
        coffeShopService.orderCoffe(coffeeShop,5);
        Assertions.assertEquals(coffeeShop.getCurrentcapacity(),10);
    }

    @Test
    public void orderCoffeMustThrowExceptionForNegativeOrder() throws Exception {
        CoffeeShop coffeeShop = new CoffeeShop("CoffeHolic", "Batman Alley", "999-9999", 30,true);
        coffeeShop.setCurrentcapacity(5);
        coffeShopService.orderCoffe(coffeeShop,-10);
        Assertions.assertEquals("A velocidade deve ser maior que zero", throwable.getMessage());
    }


    // testes metodo serverCoffe


    // testes currentState
    @Test
    public void coffeShopShowCurrentStatus() {
        CoffeeShop coffeeShop = new CoffeeShop("CoffeHolic", "Batman Alley", "999-9999", 30,true);
        Assertions.assertNotNull(coffeShopService.currentState(coffeeShop));
    }


}
