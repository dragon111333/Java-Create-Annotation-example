package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FindAnnotation {
    public static void init(){
        try{
            // ดึงคลาส AnnotatedClass
            Class<?> clazz = UseAnnotationClass.class;
            System.out.println("Clazz is : "+clazz);

            // ตรวจสอบ Annotation ระดับคลาส
            System.out.println("----------- CLASS ----------");
            if (clazz.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = clazz.getAnnotation(MyAnnotation.class);
                System.out.println("Class annotation: " + annotation.value());
            }


            // ตรวจสอบ Annotation ระดับฟิลด์
            System.out.println("----------- FIELDs ----------");
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
                    System.out.println("Field annotation on " + field.getName() + ": " + annotation.value());
                }
            }

            // ตรวจสอบ Annotation ระดับเมธอด
            System.out.println("----------- METHODs ----------");
            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
                    System.out.println("Method annotation on " + method.getName() + ": " + annotation.value());
                }
            }
        }catch(Exception ex){
        ex.printStackTrace();
        }
    }
}
