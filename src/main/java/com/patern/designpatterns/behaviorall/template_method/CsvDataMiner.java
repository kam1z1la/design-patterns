package com.patern.designpatterns.behaviorall.template_method;

import lombok.extern.slf4j.Slf4j;

import java.io.File;

@Slf4j
public class CsvDataMiner extends DataMiner {
    @Override
    protected void openFile(File file) {
        log.info("Opening an CSV file:" + file);
    }

    @Override
    protected void parseFile() {
        log.info("Parsing a CSV file...");
    }

    @Override
    protected void analyzeData() {
        log.info("Analysis of data from a CSV file...");
    }

    @Override
    protected void closeFile() {
        log.info("Closing the CSV file.");
    }
}
