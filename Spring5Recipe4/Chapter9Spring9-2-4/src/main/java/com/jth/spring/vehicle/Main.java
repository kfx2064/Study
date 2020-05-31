package com.jth.spring.vehicle;

import com.jth.spring.vehicle.config.VehicleConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfiguration.class);

        VehicleDao vehicleDao = context.getBean(VehicleDao.class);

        List<Vehicle> vehicles = vehicleDao.findAll();

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle No : " + vehicle.getVehicleNo());
            System.out.println("Color : " + vehicle.getColor());
            System.out.println("Wheel : " + vehicle.getWheel());
            System.out.println("Seat : " + vehicle.getSeat());
        }

    }

}
