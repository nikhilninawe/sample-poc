package com.turvo.connect.model;

/**
 * Created by srinivas.g on 09/11/17.
 */
public class AdapterServiceResponse<T> {
    private boolean isSuccess;
    private T responseBody;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public T getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(T responseBody) {
        this.responseBody = responseBody;
    }
}
