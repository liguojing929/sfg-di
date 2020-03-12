package guru.springframework.sfgdi.Services.FactoryMode;

import org.springframework.stereotype.Service;

@Service
public class FactoryGreetingServiceImpl implements FactoryGreetingService {
    @Override
    public String greeting() {
        return "Hello This is Impl";
    }
}
