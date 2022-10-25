package org.training.design.patterns.training.oo.creational.objectpooling;

import org.training.design.patterns.training.oo.creational.singleton.MyLazySingleton;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class MyObjectPool {

//    public static List<String> strings = Collections.synchronizedList(new ArrayList<>());
//    Map<String,String> strMap = new ConcurrentHashMap<>();

    private static volatile MyObjectPool instance;


    public static MyObjectPool getInstance() {
        if (instance == null) { // 1 2
            synchronized (MyLazySingleton.class) {
                if (instance == null) {
                    instance = new MyObjectPool();
                    // Cache
                }
            }
        }
        return instance;
    }
    private Queue<PooledObj> mypool = new ArrayBlockingQueue<>(1000);


    private MyObjectPool() {
        for (int i = 0; i < 100; i++) {
            PooledObj pooledObj = new PooledObj();
            pooledObj.setData("data" + i);
            mypool.add(pooledObj);
        }
    }

    public PooledObj getObj() {
        PooledObj poll = mypool.poll();
        if (poll == null) {
            poll = new PooledObj();
        }
        return poll;
    }

    public void returnObj(PooledObj pooledObj) {
        if (mypool.size() < 900) {
            mypool.add(pooledObj);
        }
    }
}
