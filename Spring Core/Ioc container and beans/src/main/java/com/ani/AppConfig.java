package com.ani;
import com.ani.car.Car;
import com.ani.driver.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.ani")
@Configuration
@Bean
public Car car() {
        return new Car();
        }

@Bean
public Driver driver() {
        return new Driver();
        }

public class AppConfig {
}
