package com.jth.spring.vehicle;

import com.jth.spring.vehicle.config.VehicleConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfiguration.class);

        VehicleDao vehicleDao = context.getBean(VehicleDao.class);

        Vehicle vehicle1 = new Vehicle("TEM0022", "Red", 4, 4);
        Vehicle vehicle2 = new Vehicle("TEM0023", "Red", 4, 4);
        vehicleDao.insert(Arrays.asList(vehicle1, vehicle2));

        vehicleDao.findAll().forEach(System.out::println);
    }

}
