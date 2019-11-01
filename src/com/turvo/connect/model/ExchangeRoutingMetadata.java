package com.turvo.connect.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRoutingMetadata {

    private String exchangeName;

    private String routingCriteria;

    private boolean enabled;

    @JsonCreator
    public ExchangeRoutingMetadata(@JsonProperty(value = "exchangeName", required = true) String exchangeName, @JsonProperty(value = "routingCriteria", required = true) String routingCriteria,
                                   @JsonProperty(value = "enabled", required = true) boolean enabled) {
        this.exchangeName = exchangeName;
        this.routingCriteria = routingCriteria;
        this.enabled = enabled;
    }
}
