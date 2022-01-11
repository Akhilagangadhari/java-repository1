package com.ani;
import com.ani.car.Car;
import org.springframework.beans.factory.annotation.Autowired;


public class Driver1 {
    @Autowired
    private Car car;
    // hey spring there is bean called car,  in a bean configuration
    // kindly refer/point to that bean, so we can access it as needed
    @Autowired
    private Car car;
}
}
