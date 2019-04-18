package hellocucumber;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "cucumber-glue", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CucumberGlueBean {
  public CucumberGlueBean() {
    System.out.println("CucumberGlue constructor: " + this);
  }

  public void doSomething() {
    System.out.println("Cucumber glue method: " + this);
  }
}
