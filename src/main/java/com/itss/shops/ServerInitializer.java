package com.itss.shops;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.File;

import static com.itss.shops.common.constant.Constants.DATA_DIR;

/**
 * Created by hungdd-cadpro on 05/07/2017.
 */

@Component
public class ServerInitializer implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        File theDir = new File(DATA_DIR);
        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir.getPath());
            boolean result = false;

            try {
                result = theDir.mkdir();
            } catch (SecurityException se) {
                System.out.println("can not create data directory!");
            }
            if (result) {
                System.out.println("DIR created");
            }
        }

    }
}