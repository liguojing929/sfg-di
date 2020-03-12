package guru.springframework.sfgdi.Controllers.FactoryMode;

import guru.springframework.sfgdi.Services.FactoryMode.FactoryGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FactoryPropertyInjectedController {
    @Autowired
    @Qualifier("factoryPropertyInjectedGreetingService")
    private FactoryGreetingService factoryGreetingService;

    public String sayHello() {
        return factoryGreetingService.greeting();
    }
}
