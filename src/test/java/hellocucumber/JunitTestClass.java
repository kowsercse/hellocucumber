package hellocucumber;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = Config.class)
public class JunitTestClass {

//  @Autowired
  private SingletonBean singletonBean;

  @Test
  public void testSingletonBean() {
//    singletonBean.doSingletonWork();
  }
}
