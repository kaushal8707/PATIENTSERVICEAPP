package com.always.learner.PATIENTSERVICEAPP;

import com.always.learner.PATIENTSERVICEAPP.api.PatientServiceApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    private static Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private PatientServiceApi doctorsServiceApi;
    @GetMapping("/allPatients/{city}")
    public String patients(@PathVariable String city){
        logger.info("got hit on /allPatients/"+city);
        return doctorsServiceApi.getPatients(city);
    }
}
