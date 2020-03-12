package guru.springframework.sfgdi.Services.FactoryMode;

import org.springframework.stereotype.Service;


public class PrimarySpanishGreetingService implements FactoryGreetingService {

    private FactoryGreetingRepository factoryGreetingRepository;

    public PrimarySpanishGreetingService(FactoryGreetingRepository factoryGreetingRepository) {
        this.factoryGreetingRepository = factoryGreetingRepository;
    }


    @Override
    public String greeting() {
        return factoryGreetingRepository.sayHelloInSpanish();
    }
}
