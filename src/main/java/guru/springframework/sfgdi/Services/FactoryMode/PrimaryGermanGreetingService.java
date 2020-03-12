package guru.springframework.sfgdi.Services.FactoryMode;

import guru.springframework.sfgdi.Services.GreetingService;
import org.springframework.stereotype.Service;


public class PrimaryGermanGreetingService implements FactoryGreetingService {

    private FactoryGreetingRepository factoryGreetingRepository;

    public PrimaryGermanGreetingService(FactoryGreetingRepository factoryGreetingRepository) {
        this.factoryGreetingRepository = factoryGreetingRepository;
    }


    @Override
    public String greeting() {
        return factoryGreetingRepository.sayHelloInGerman();
    }
}
