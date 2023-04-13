package org.acme.application.service;

import io.quarkus.arc.DefaultBean;
import org.acme.adapter.out.file.FileSystemWriterImpl;
import org.acme.application.port.out.FileSystemWriterPortOut;
import org.acme.application.useCase.HandleWriteFiles;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

@ApplicationScoped
public class HandleWriteFilesImpl implements HandleWriteFiles{

    @Inject
    private FileSystemWriterImpl fileSystemWriterPortOut = new FileSystemWriterImpl();

    @Override
    public void writeSomeFilesFRomEventReceived(String msg) throws Exception {
        fileSystemWriterPortOut.write(msg);
    }
}
