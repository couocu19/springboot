package itcoucou.day01_quick_hello;

import itcoucou.day01_quick_hello.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class Day01QuickHelloApplicationTests {

    @Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
