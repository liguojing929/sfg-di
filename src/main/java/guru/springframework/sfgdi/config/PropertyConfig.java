package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.SampleDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    @Value("${guru.username}") // wired the properties field
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String url;

    @Bean
    public SampleDataSource sampleDataSource() {
        SampleDataSource sampleDataSource = new SampleDataSource();
        sampleDataSource.setUsername(user);
        sampleDataSource.setPassword(password);
        sampleDataSource.setDbURL(url);
        return sampleDataSource;
    }

    @Bean // the "PropertySourcePlaceHolderConfigurer" will scan and read the properties file for us
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
