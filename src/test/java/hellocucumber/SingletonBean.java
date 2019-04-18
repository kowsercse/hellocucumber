package hellocucumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean {

  @Autowired
  private PrototypeBean prototypeBean;
  @Autowired
  private CucumberGlueBean cucumberGlueBean;

  public SingletonBean() {
    System.out.println("Singleton constructor: " + this);
  }

  public void doSingletonWork() {
    System.out.println("-----------------");
    System.out.println("Singleton bean method: " + this);
    prototypeBean.doPrototypeWork();
    cucumberGlueBean.doSomething();
    System.out.println("-----------------");
  }
}
