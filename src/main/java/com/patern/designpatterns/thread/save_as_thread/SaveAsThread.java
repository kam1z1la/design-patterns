package com.patern.designpatterns.thread.save_as_thread;

import lombok.extern.slf4j.Slf4j;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@Slf4j
public class SaveAsThread extends Thread {
    private List<Integer> list;
    private String fileName;

    public SaveAsThread(String fileName) {
        this.list = new Random().ints().limit(100).boxed().toList();
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try(FileWriter writer = new FileWriter("src/main/java/com/patern/designpatterns/thread/save_as_thread/" + fileName)) {
            list.forEach(num -> {
                try {
                    writer.write(num + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            log.info(String.format("File named %s was successfully written", fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}