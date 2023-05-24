package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyBean mb1 = ctx.getBean(MyBean.class);
        ctx.close();
    }
}
