package com.patern.designpatterns.behaviorall.template_method;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j
public abstract class DataMiner {
    public void extractMetadata() {
        log.info("Extracting metadata from an XML file...");
    }

    public void cleanData() {
        System.out.println("Clearing data from a CSV file...");
    }

    protected final void mineData(File file) {
        openFile(file);
        parseFile();
        analyzeData();
        closeFile();
    }

    protected abstract void openFile(File file);
    protected abstract void parseFile();
    protected abstract void analyzeData();
    protected abstract void closeFile();
}
