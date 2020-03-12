package guru.springframework.sfgdi.Services.FactoryMode;

import org.springframework.stereotype.Service;

@Service
public class FactoryConstructorGreetingService implements FactoryGreetingService {
    @Override
    public String greeting() {
        return "Hello this is factory constructor greeting service.";
    }
}
