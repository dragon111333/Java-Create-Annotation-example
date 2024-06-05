package org.example;

@MyAnnotation("this is class")
public class UseAnnotationClass {

    public UseAnnotationClass(String name){
        this.name = name;
    }

    @MyAnnotation("this is field")
    public String name ;

    @MyAnnotation("this is method")
    public String getName(){
        return name;
    }

    @MyAnnotation("this is method2")
    public String getLongName(){
        String [] nameArr = name.split("");
        String newName = "";
        for(String n : nameArr)  newName+=n+"  ";
        return newName;
    }
}
