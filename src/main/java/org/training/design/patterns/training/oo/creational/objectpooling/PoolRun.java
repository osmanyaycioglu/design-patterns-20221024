package org.training.design.patterns.training.oo.creational.objectpooling;

public class PoolRun {
    public static void main(String[] args) {
        try (PooledObj obj = MyObjectPool.getInstance()
                                         .getObj()) {

        } catch (Exception exp){

        }
    }
}
