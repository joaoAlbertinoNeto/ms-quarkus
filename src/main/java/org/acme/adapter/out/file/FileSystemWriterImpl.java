package org.acme.adapter.out.file;

import javax.enterprise.context.ApplicationScoped;

import org.acme.application.port.out.FileSystemWriterPortOut;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

@ApplicationScoped
public class FileSystemWriterImpl implements FileSystemWriterPortOut{
    private final static String FILE_OUTPUT = "/tmp/output.txt";
    @Override
    public void write(String msg) throws Exception {
        try{
            String line = msg+System.lineSeparator();
            Files.write(Path.of(FILE_OUTPUT),line.getBytes(),CREATE ,APPEND);
        }catch(IOException e){
            System.out.println(e.getLocalizedMessage());
            throw e;
        }
        
    }

}