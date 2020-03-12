package guru.springframework.sfgdi.Controllers.FactoryMode;

import guru.springframework.sfgdi.Services.FactoryMode.FactoryGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FactoryConstructorInjectedController {
    private FactoryGreetingService factoryGreetingService;

    public FactoryConstructorInjectedController(@Qualifier("factoryConstructorGreetingService") FactoryGreetingService factoryGreetingService) {
        this.factoryGreetingService = factoryGreetingService;
    }

    public String sayHello() {
        return factoryGreetingService.greeting();
    }
}
