package com.arl.saahas.redis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RedisUserVO implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private List<Long> allowedGroups;


    public RedisUserVO(){

    }

    /**
     * @param allowedUsers
     */
    public RedisUserVO(List<Long> allowedGroups) {
        super();
        this.allowedGroups = allowedGroups;
    }

    /**
     * @return the allowedGroups
     */
    public List<Long> getAllowedGroups() {
        if(allowedGroups==null)
            allowedGroups = new ArrayList<Long>();
        return allowedGroups;
    }

    /**
     * @param allowedGroups the allowedGroups to set
     */
    public void setAllowedGroups(List<Long> allowedGroups) {
        this.allowedGroups = allowedGroups;
    }

    @Override
    public String toString() {
        return "RedisUserVO{" +
                "allowedGroups=" + allowedGroups +
                '}';
    }
}
