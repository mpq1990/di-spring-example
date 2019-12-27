package com.example.dispring;

import com.example.dispring.controllers.ConstructorInjectedController;
import com.example.dispring.controllers.MyController;
import com.example.dispring.controllers.PropertyInjectedController;
import com.example.dispring.controllers.SetterInjectedController;
import com.example.dispring.examplebeans.FakeDataSource;
import com.example.dispring.examplebeans.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiSpringApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");

//        System.out.println(myController.hello());
//
//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());


        FakeJMSBroker fakeJMSBroker = ctx.getBean(FakeJMSBroker.class);
        System.out.println(fakeJMSBroker.getUserName());
        System.out.println(fakeJMSBroker.getPassword());
        System.out.println(fakeJMSBroker.getUrl());
    }

}
