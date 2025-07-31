package org.example;


public class Main {
    static final int staticHex = 0x1A2B;
    static final byte staticByte = 1;
    static final String staticString = "Progress, not perfection.";

    public static void main(String[] args) {
        System.out.println("Local Variables: ");
        getLocalVariables();

        System.out.println("\nInstance Variables: ");
        Instance instance = new Instance();
        System.out.printf("instanceBinary = %d \n", instance.getInstanceBinary());
        System.out.printf("instanceOctal = %d \n", instance.getInstanceOctal());
        System.out.printf("instanceDouble = %.2f \n", instance.getInstanceDouble());

        System.out.println("\nStatic Variables: ");
        getStaticVariables();
    }

    public static void getLocalVariables(){
        int localDecimal = 100;
        int localHex = 0xFF;
        int localBinary = 13;
        int localOctal = 014;
        int localLong = 10000000;
        String localString = "Every step I take gets me closer to my goal.";

        System.out.printf("localDecimal = %d \n", localDecimal);
        System.out.printf("localHex = %d \n", localHex);
        System.out.printf("localBinary = %d \n", localBinary);
        System.out.printf("localOctal = %d \n", localOctal);
        System.out.printf("localLong = %d \n", localLong);
        System.out.printf("localString = %s \n", localString);
    }

    public static void getStaticVariables(){
        System.out.printf("staticHex = %d \n", staticHex);
        System.out.printf("staticByte = %d \n", staticByte);
        System.out.printf("staticString = %s \n", staticString);
    }
}