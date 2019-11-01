package com.turvo.connect.service;

import com.turvo.connect.model.PublisherParams;


public interface IReconciliator {
    void reconciliateRequest(PublisherParams publisherParams);
}