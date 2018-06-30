package com.diy.executor;

/**
 * Created by JAVA on 2018/6/30.
 */
public interface DiyExecutor {


    <T> T query(String statement, String parameter);

}
