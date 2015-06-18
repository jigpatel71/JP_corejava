package com.test.annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation
{
    String author();
    String date();
}

@MyAnnotation(author="Azim",date="22/10/2011,23/10/2011")
public class Test
{
    @MyAnnotation(author="Azim",date="22/10/2011")
    public static void testMethod()
    {
        System.out.println("Welcome to Java");
        System.out.println("This is an example of Annotations");
    }
    public static void main(String args[])
    {
        testMethod();
        showAnnotations();
    }
    public static void showAnnotations()
    {
        Test test=new Test();
        try
        {
            Class c=test.getClass();
            Method m=c.getMethod("testMethod");
            MyAnnotation annotation1=(MyAnnotation)c.getAnnotation(MyAnnotation.class);
            MyAnnotation annotation2=m.getAnnotation(MyAnnotation.class);
            System.out.println("Author of the class: "+annotation1.author());
            System.out.println("Date of Writing the class: "+annotation1.date());
            System.out.println("Author of the method: "+annotation2.author());
            System.out.println("Date of Writing the method: "+annotation2.date());
        }
        catch(NoSuchMethodException ex)
        {
            System.out.println("Invalid Method..."+ex.getMessage());
        }
    }
}
