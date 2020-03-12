package guru.springframework.sfgdi.Services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello world -- SetterInjected";
    }
}
