package guru.springframework.sfgdi.Services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## Constructor: LifeCycleDemoBean() =>" + "I'm in the LifeCycleBean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## setBeanFactory() => Bean Factory has been set.");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## setBeanName() => My Bean name is: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## destroy() => The Lifecycle bean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## afterPropertiesSet() => The LifeCycleBean has its properties set!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## setApplicationContext(ApplicationContext applicationContext) => Application context has been set.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## postConstruct() => The Post Construct annotated method has been called.");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## preDestroy() => The Predestroy annotated method has been called.");
    }

    public void beforeInit() {
        System.out.println("## beforeInit() => Before Init - Called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## afterInit() => After init called by Bean Post Processor.");
    }
}
