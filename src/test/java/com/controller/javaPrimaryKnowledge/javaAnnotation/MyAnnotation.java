package com.controller.javaPrimaryKnowledge.javaAnnotation;

import sun.reflect.annotation.AnnotationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 我们首先要清楚的知道一点，其实Annotation和Class、Interface这些一样，都是类级别的，而且我们创建的每一个Annotation都默认的继承了java.lang.annotation.Annotation这个接口，
 * 注意：如果一个接口继承了这个Annotation接口，那么这个接口并不是一个Annotation。
 * 在Annotation中，如果我们定义了一个 value 属性，那么我们在使用该Annotation，
 * 给其赋值时，可以不用写出属性的名字，即value。
 *
 * 1.注解属性后面都带括号'()';
 * 2.注解的保留范围retention,即此注解可以保留在什么时期，此值是一个枚举值RetentionPolicy
 *      包括：RetentionPolicy.CLASS(默认，保留在字节码),RetentionPolicy.RUNTIME(运行时期),RetentionPolicy.RESOURCE(表示Annotation仅仅在编译的时候有效，
 *      起到提示作用，并不会被编译到class文件当中),
 *
 *  3.Target:表示此注解可以标注在类上，方法上，值为：ANNOTATION_TYPE     // 可以定义在Annotation上
 *
 * CONSTRUCTOR         // 可以定义在构造函数上
 *
 * FIELD 　　　　　　　  // 可以定义属性上
 *
 * LOCAL_VARIABLE 　　 //　可以定义在方法的局部变量上
 *
 * METHOD 　　　　　　  // 可以定义在方法上
 *
 * PACKAGE 　　　　　　 // 可以定义在包上
 *
 * PARAMETER 　　　　　 // 可以定义在方法的参数上
 *
 * TYPE 　　　　　　　　// 可以定义在类上、接口上
 * */
//这是一个持有到运行时期的标注在方法上的注解
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface MyAnnotation {
    String value();//注解里属性都带括号()；
    String name() default "lxl";
}
