package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String line = "------------------------";
        System.out.println(line);
        callUseAnnotationClass();
        FindAnnotation.init();

        System.out.println(line);
    }

    private static void callUseAnnotationClass(){
        UseAnnotationClass u = new UseAnnotationClass("THEWIN THAMMA");
        System.out.println(u.getLongName());
    }
}