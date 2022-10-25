package org.training.design.patterns.training.oo.creational.objectpooling;

import lombok.Getter;
import lombok.Setter;

import java.io.Closeable;
import java.io.IOException;

@Getter
@Setter
public class PooledObj implements Closeable {
    private String data;

    @Override
    public void close() {
        MyObjectPool.getInstance().returnObj(this);
    }
}
