package com.patern.designpatterns.behaviorall.template_method;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
@Slf4j
public class XmlDataMiner extends DataMiner {
    @Override
    protected void openFile(File file) {
        log.info("Opening an XML file: " + file.getName());

    }

    @Override
    protected void parseFile() {
        log.info("Parsing an XML file...");
    }

    @Override
    protected void analyzeData() {
        log.info("Analysis of data from an XML file...");
    }

    @Override
    protected void closeFile() {
        log.info("Closing the XML file.");
    }
}
