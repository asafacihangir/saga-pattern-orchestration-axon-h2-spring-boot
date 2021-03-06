package com.progressivecoder.shippingmanagement.shippingservice.command;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

public class RollbackShippingCommand {

    @TargetAggregateIdentifier
    public final String shippingId;

    public final String orderId;

    public final String paymentId;

    public final String item;

    public RollbackShippingCommand(String shippingId, String orderId, String paymentId, String item) {
        this.shippingId = shippingId;
        this.orderId = orderId;
        this.paymentId = paymentId;
        this.item = item;
    }
}
