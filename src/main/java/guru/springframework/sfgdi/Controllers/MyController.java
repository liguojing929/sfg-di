package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public GreetingService primaryGreetingService;

    public MyController(GreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }

    public String sayHello() {
        return primaryGreetingService.sayHello();
    }
}
