package me.whiteship.springinit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
class SpringinitApplicationTests {

    @Autowired
    Environment environment;

    @Test
    public void contextLoads() {
        Assertions.assertThat(environment.getProperty("keesun.name"))
                    .isEqualTo("keesun2");
    }

}
