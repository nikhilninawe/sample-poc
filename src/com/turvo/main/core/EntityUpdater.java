package com.turvo.main.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EntityUpdater {

    private static final Logger LOGGER = LoggerFactory.getLogger(EntityUpdater.class);


    @Autowired
    UserListService userListService;

    public void callService(){
        try {
            userListService.users();
        }catch (Exception ex){
            LOGGER.info("Exception", ex.getMessage());
        }
    }

}
