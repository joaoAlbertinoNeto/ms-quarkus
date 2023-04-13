package org.acme.adapter.in.kafka;

import io.quarkus.arc.DefaultBean;
import org.acme.application.port.in.EventConsumerPortIn;
import org.acme.application.service.HandleWriteFilesImpl;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.inject.Inject;

@DefaultBean
public class EventConsumer  implements EventConsumerPortIn{

    @Inject
    private HandleWriteFilesImpl handleWriteFiles ;

    @Incoming("events")
    public void consume(String msg) throws Exception {
        System.out.println(msg);
        handleWriteFiles.writeSomeFilesFRomEventReceived(msg);
    }
    
}
