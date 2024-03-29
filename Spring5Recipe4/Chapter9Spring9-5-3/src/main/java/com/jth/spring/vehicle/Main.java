package com.jth.spring.vehicle;

import com.jth.spring.vehicle.config.VehicleConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DataAccessException;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfiguration.class);

        VehicleDao vehicleDao = context.getBean(VehicleDao.class);

        Vehicle vehicle = new Vehicle("EX0001", "Green", 4, 4);
        try {
            vehicleDao.insert(vehicle);
        } catch(DataAccessException e) {
            SQLException sqle = (SQLException) e.getCause();
            System.out.println("Error code : " + sqle.getErrorCode());
            System.out.println("SQL state : " + sqle.getSQLState());
        }
    }

}
