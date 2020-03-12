package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.Services.ConstructorGreetingService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    public void setUp() {
        System.out.println("start");
        this.controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @AfterEach
    public void finish() {
        System.out.println("finalize");
    }




    @Test
    void sayHello() {
        System.out.println("test1");
        System.out.println(this.controller.sayHello());
    }
    @Test
    void sayHello2() {
        System.out.println("test2");
        System.out.println(this.controller.sayHello());
    }
}