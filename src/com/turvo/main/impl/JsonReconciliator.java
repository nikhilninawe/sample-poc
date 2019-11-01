package com.turvo.main.impl;

import com.turvo.connect.model.PublisherParams;
import com.turvo.connect.service.IReconciliator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class JsonReconciliator implements IReconciliator {

    private static final Logger logger = LogManager.getLogger(JsonReconciliator.class);

    @Autowired
    ApplicationContext applicationContext;

    public void reconciliateRequest(PublisherParams publisherParams){
        IReconciliator reconciliator = applicationContext.getBean(IReconciliator.class);
        logger.info(reconciliator);
        logger.info("Inside this " + this);
    }
}
