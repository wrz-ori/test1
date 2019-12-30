package com.test.test;

import com.test.entity.Print;
import com.test.entity.TestType;
import com.test.entity.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lenovo on 2019/11/5.
 */
public class Client {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext app=  new FileSystemXmlApplicationContext("SpringContext.xml");
       student  studet= (student)app.getBean("student");
        studet.study();


       Print print=(Print) app.getBean("print");
       print.print();


      TestType test= app.getBean("test", TestType.class);
        System.out.println("test = " + test);
    }

}
