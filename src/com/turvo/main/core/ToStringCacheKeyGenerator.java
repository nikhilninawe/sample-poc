package com.turvo.main.core;

import java.lang.reflect.Method;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;


@Component("toStringCacheKeyGenerator")
public class ToStringCacheKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(Object target, Method method, Object... params) {
        return method.getName() + ":" + paramsToString(params);
    }

    private String paramsToString(Object[] params) {
        List<Object> nullSafe = makeNullSafe(params);
        return Joiner.on(",").join(nullSafe);
    }

    private List<Object> makeNullSafe(Object[] params) {
        List<Object> result = Lists.newLinkedList();
        for(Object obj : params) {
            if (obj == null) {
                result.add("null");
            } else {
                result.add(obj);
            }
        }
        return result;
    }
}
