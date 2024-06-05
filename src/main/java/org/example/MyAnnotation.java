package org.example;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Retention(RetentionPolicy.RUNTIME): กำหนดให้ Annotation นี้สามารถใช้งานได้ในระหว่าง Runtime
//@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}): กำหนดว่า Annotation นี้สามารถใช้ได้กับคลาส เมธอด และฟิลด์
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface MyAnnotation {
    String value() default "Default value of annotation";
}
