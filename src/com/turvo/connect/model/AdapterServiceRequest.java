package com.turvo.connect.model;

/**
 * Created by srinivas.g on 09/11/17.
 */
public class AdapterServiceRequest<T> {
    private T requestBody;

    public T getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(T requestBody) {
        this.requestBody = requestBody;
    }
}
