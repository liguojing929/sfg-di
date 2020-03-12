package guru.springframework.sfgdi.Controllers.FactoryMode;

import guru.springframework.sfgdi.Services.FactoryMode.FactoryGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FactoryController {

    private FactoryGreetingService factoryGreetingService;


    public FactoryController(FactoryGreetingService factoryGreetingService) {
        this.factoryGreetingService = factoryGreetingService;
    }

    public String hello() {
        System.out.println("Hello From Factory Controller");
        return factoryGreetingService.greeting();
    }
}
