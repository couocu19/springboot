package itcoucou.day01_quick_hello.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Email;

@Component
@ConfigurationProperties(prefix = "person") //该注解定位的配置文件为全局配置文件
//@Validated
@PropertySource(value = {"classpath:person.properties"})
public class Person {
    private Integer id;
    //@Email 这个注解的意思是name的格式必须是邮箱的格式
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
