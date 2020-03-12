package guru.springframework.sfgdi.Services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"}) // express in this way will set the profile as default, and no need to specify activity in properties file.
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello World -- EN";
    }
}
