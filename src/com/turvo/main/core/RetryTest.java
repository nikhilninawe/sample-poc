package com.turvo.main.core;

import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.policy.TimeoutRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

public class RetryTest {
    public static void main(String[] args) throws Exception{
        TimeoutRetryPolicy policy = new TimeoutRetryPolicy();
        policy.setTimeout(1000L);
        RetryTemplate template = new RetryTemplate();
        template.setRetryPolicy(policy);
        String result = template.execute(new RetryCallback<String, Exception>() {
            public String doWithRetry(RetryContext context) {
                System.out.println("Executing " + context);
                try {
                    Thread.sleep(1 * 21000);
                }catch (Exception ex){

                }
                return "Test1";
            }
        });
        System.out.println(result);

    }
}
