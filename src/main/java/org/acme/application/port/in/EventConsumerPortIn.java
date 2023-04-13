package org.acme.application.port.in;

public interface EventConsumerPortIn {


    public void consume(String msg) throws Exception;
    
}
