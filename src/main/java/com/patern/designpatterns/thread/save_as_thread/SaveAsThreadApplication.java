package com.patern.designpatterns.thread.save_as_thread;

public class SaveAsThreadApplication {
    public static void main(String[] args) {
        SaveAsThread thread1 = new SaveAsThread("AI1.txt");
        SaveAsThread thread2 = new SaveAsThread("AI2.txt");
        SaveAsThread thread3 = new SaveAsThread("AI3.txt");

        thread1.run();
        thread2.run();
        thread3.run();

        ReadAsThread readAsThread = new ReadAsThread();
        readAsThread.readFile("AI1.txt");
        System.out.println("\n");
        readAsThread.readFile("AI2.txt");
        System.out.println("\n");
        readAsThread.readFile("AI3.txt");
    }
}
