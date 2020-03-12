package guru.springframework.sfgdi.Services.FactoryMode;

import org.springframework.stereotype.Service;

@Service
public class FactorySetterInjectedGreetingService implements FactoryGreetingService {
    @Override
    public String greeting() {
        return "Hello this is factory setter injected greeting service";
    }
}
