package com.company;

class TapeDeckTestDrive {
    public static void main(String [] args) {
        Main t = new Main();
        t.canRecord = true;
        t.playTape();
        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}