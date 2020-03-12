package guru.springframework.sfgdi.Services.FactoryMode;

import org.springframework.stereotype.Service;


public class PrimaryEnglishGreetingService implements FactoryGreetingService {

    private FactoryGreetingRepository factoryGreetingRepository;

    public PrimaryEnglishGreetingService(FactoryGreetingRepository factoryGreetingRepository) {
        this.factoryGreetingRepository = factoryGreetingRepository;
    }

    @Override
    public String greeting() {
        return factoryGreetingRepository.sayHelloInEnglish();
    }
}
