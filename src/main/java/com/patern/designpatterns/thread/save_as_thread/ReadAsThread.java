package com.patern.designpatterns.thread.save_as_thread;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

@Slf4j
public class ReadAsThread {
    public void readFile(String name) {
        Path path = Path.of("src/main/java/com/patern/designpatterns/thread/save_as_thread/" + name);
        try (Stream<String> lineStream = Files.lines(path)) {
            log.info(lineStream.toList().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
