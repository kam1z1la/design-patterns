package com.patern.designpatterns.behaviorall.template_method;

import java.io.File;

public class TemplateMethodApplication {
    public static void main(String[] args) {
        DataMiner xml = new XmlDataMiner();
        xml.mineData(new File("file.xml"));
        xml.extractMetadata();

        DataMiner csv = new CsvDataMiner();
        xml.mineData(new File("file.csv"));
        xml.cleanData();
    }
}
