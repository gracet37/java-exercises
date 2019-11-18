package com.company;

//public class Main {
//
//    public static void main(String[] args) {
//	    int x = 1;
//        String[] pets = {"Fido", "Zeus", "Bin"};
//        int length = pets.length;
//        int y = (int) 24.6;
//        System.out.println(pets);
//        System.out.println(y);
//    }
//}
//
//class Main {
//    public static void main(String [] args) {
//        int x = 1;
//        while ( x < 10 ) {
//            if ( x > 3) {
//                System.out.println("big" + x);
//            }
//            x = x + 1;
//        }
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        int x = 5;
//        while (x > 1) {
//            x = x - 1;
//            if (x < 3) {
//                System.out.println("small x");
//            }
//        }
//    }
//}

class TapeDeckTestDrive {
    public static void main(String [] args) {
        t.canRecord = true;
        t.playTape();
        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}