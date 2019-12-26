package com.example.dispring;

import com.example.dispring.controllers.ConstructorInjectedController;
import com.example.dispring.controllers.MyController;
import com.example.dispring.controllers.PropertyInjectedController;
import com.example.dispring.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

        myController.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
