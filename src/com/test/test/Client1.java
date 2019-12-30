package com.test.test;

import com.test.entity.Ink;
import com.test.entity.Print;
import com.test.entity.student;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lenovo on 2019/11/6.
 */
public class Client1 {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext app1=  new FileSystemXmlApplicationContext("SpringContext.xml");
        Ink ink=  app1.getBean("colorInk", Ink.class);
        System.out.println("ink.showcolor() = " + ink.showcolor());


        Print print=app1.getBean("print",Print.class);
        print.print();

    }

}
