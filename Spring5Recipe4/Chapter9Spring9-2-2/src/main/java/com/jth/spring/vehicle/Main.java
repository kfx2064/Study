package com.jth.spring.vehicle;

import com.jth.spring.vehicle.config.VehicleConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfiguration.class);

        VehicleDao vehicleDao = context.getBean(VehicleDao.class);
        Vehicle vehicle1 = new Vehicle("TEM0015", "Blue", 4, 4);
        Vehicle vehicle2 = new Vehicle("TEM0016", "Black", 4, 6);
        Vehicle vehicle3 = new Vehicle("TEM0017", "Green", 4, 5);
        vehicleDao.insert(Arrays.asList(vehicle1, vehicle2, vehicle3));

        vehicleDao.findAll().forEach(System.out::println);
    }

}
