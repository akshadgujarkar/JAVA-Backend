/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ORM;

import org.hibernate.SessionFactory;
import java.util.*;
import java.io.*;

import ORM.Table1;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;


public class Configure
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Configuration started" );
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionfactory = cfg.buildSessionFactory();
//        System.out.println(sessionfactory);
        Table1 t1 = new Table1();
        t1.setUsername("akshadgujarkar@gmail.com");
        t1.setPassword("23432");
        Table1 t2 = new Table1();
        t2.setUsername("Arya");
        t2.setPassword("343224");
        Session s = sessionfactory.openSession();
         Transaction tx  = s.beginTransaction();
            s.save(t1);
            s.save(t2);
            tx.commit();
         s.close();
       
    }
}
           