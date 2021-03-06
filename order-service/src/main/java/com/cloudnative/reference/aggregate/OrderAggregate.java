package com.cloudnative.reference.aggregate;

import com.cloudnative.reference.CreateOrderCommand;
import com.cloudnative.reference.events.OrderCreatedEvent;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;
import org.axonframework.eventsourcing.annotation.EventSourcingHandler;
import org.springframework.util.Assert;

@SuppressWarnings("rawtypes")
public class OrderAggregate extends AbstractAnnotatedAggregateRoot {

  private static final long serialVersionUID = 5108759807090437372L;

  @AggregateIdentifier
  private String id;

  public OrderAggregate() {
  }

  @CommandHandler
  public OrderAggregate(CreateOrderCommand c) {
    Assert.hasLength(c.getDescription());
    apply(new OrderCreatedEvent(c.getId(), c.getDescription()));
  }

  @EventSourcingHandler
  protected void on(OrderCreatedEvent cfe) {
    this.id = cfe.getId();
  }
}
