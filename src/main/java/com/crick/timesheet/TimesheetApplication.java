package com.crick.timesheet;

import com.crick.timesheet.entity.Customer;
import com.crick.timesheet.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class TimesheetApplication {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private  CustomerRepository customerRepository;


    public static void main(String[] args) {
        SpringApplication.run(TimesheetApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Funziona, forza crick yahoooo!";
    }

    @RequestMapping("/insert")
    @ResponseBody
    String insert() {
        Customer customerToInsert = new Customer();
        customerToInsert.firstName = "Cristiano";
        customerRepository.insert(customerToInsert);
        return "Funziona, forza crick yahoooo!";
    }
}
