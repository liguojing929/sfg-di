package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.Services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;


    @BeforeEach
    void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    public void getGreeting() {
        System.out.println(this.setterInjectedController.sayHello());
    }


}