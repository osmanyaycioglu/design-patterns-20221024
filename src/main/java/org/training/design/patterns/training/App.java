package org.training.design.patterns.training;

import org.training.design.patterns.training.oo.creational.singleton.MyLazySingleton;

public class App
{
    public static void main( String[] args )
    {
        MyLazySingleton.getInstance().doSomething();

        System.out.println( "Hello World!" );
    }
}
