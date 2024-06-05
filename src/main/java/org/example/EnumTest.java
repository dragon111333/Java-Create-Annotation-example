package org.example;

enum Level {
    LOW,
    MEDIUM,
    HIGH,
    SUPER_HIGH
}

public class EnumTest {
    public static void getAllLevel(){
        Level [] levelList = Level.values();
        System.out.println("-----------[ALL LEVEL]------------");
        for(int index = 0 ;index < levelList.length ; index++)
            System.out.println((index+1)+ ".) "+levelList[index]);
        System.out.println("-----------[ALL LEVEL](END)------------");

    }

    public static void init(){

        EnumTest.getAllLevel();

        Level level = Level.MEDIUM;
        System.out.println("CURRENT LEVEL -->"+level);

        switch(level) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            default:
                System.out.printf("SUPER HIGH");
                break;
        }
    }
}