package com.controller.javaPrimaryKnowledge.javaAnnotation;


import java.lang.reflect.Method;

/**
 * java的API指定了访问得到Annotation的方法，
 * 我们的Class,Method,Constructor等等这些都默认实现了 AnnotatedElement 这个接口
 * 这个接口包含四个方法
 * <T extends Annotation> T  getAnnotation(Class<T> annotationClass) // 根据Annotation.class得到这个Annotation
 *
 * Annotation[] getAnnotations()  　　//　　得到一个Annotation数组
 *
 * Annotation[] getDeclaredAnnotations()  //　　也是得到一个Annotation数组
 *
 * boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) //判断是否为被当前的Annotation所标识
 * **/
public class DemoTest {
    @MyAnnotation(value = "zhangsan",name = "lisi")
    public void demoAnnotion(){
        System.out.println("This is MyAnnotation");
    }

    public static void main(String[] args) throws Exception{
       //得到DemoTest类的类对象
        Class<DemoTest> testClass = DemoTest.class;
        //得到一个DemoTest对象；
        DemoTest demoTest = (DemoTest)testClass.newInstance();
        //得到方法名为demoAnnotion的方法
        Method methoddemoAnnotion = testClass.getMethod("demoAnnotion",new Class[]{});
        if(methoddemoAnnotion.isAnnotationPresent(MyAnnotation.class)){
            //判断demoAnnotion这个方法是否被MyAnnotation这个注解标注
            MyAnnotation myAnnotation = methoddemoAnnotion.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.name()+ "  "+myAnnotation.value());
            methoddemoAnnotion.invoke(demoTest,new Object[]{});
        }
    }


}
