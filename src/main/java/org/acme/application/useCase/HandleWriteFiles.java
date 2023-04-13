package org.acme.application.useCase;


import java.io.IOException;

public interface HandleWriteFiles {

    public void writeSomeFilesFRomEventReceived(String msg) throws Exception;
    
}
