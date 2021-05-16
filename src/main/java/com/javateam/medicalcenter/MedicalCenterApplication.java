package com.javateam.medicalcenter;

import com.javateam.medicalcenter.employees.domain.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MedicalCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicalCenterApplication.class, args);

        Util util = new Util();
        util.getConnection();


    }
}
