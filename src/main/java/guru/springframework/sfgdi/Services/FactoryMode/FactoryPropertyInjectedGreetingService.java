package guru.springframework.sfgdi.Services.FactoryMode;

import org.springframework.stereotype.Service;

@Service
public class FactoryPropertyInjectedGreetingService implements FactoryGreetingService {
    @Override
    public String greeting() {
        return "Hello this is factory property injected greeting service.";
    }
}
