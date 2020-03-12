package guru.springframework.sfgdi.Controllers.FactoryMode;

import guru.springframework.sfgdi.Services.FactoryMode.FactoryGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FactorySetterInjectedController {
    private FactoryGreetingService factoryGreetingService;

    public FactorySetterInjectedController(@Qualifier("factorySetterInjectedGreetingService") FactoryGreetingService factoryGreetingService) {
        this.factoryGreetingService = factoryGreetingService;
    }

    public String sayHello() {
        return factoryGreetingService.greeting();
    }
}
