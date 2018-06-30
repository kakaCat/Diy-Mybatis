package com.diy.session;

import com.diy.executor.DiyExecutor;

/**
 * Created by JAVA on 2018/6/30.
 * 主函数
 */
public class DiySqlsession {

    private DiyExecutor diyExecutor;

    private DiyConfiguration diyConfiguration;

    public DiySqlsession(DiyExecutor diyExecutor, DiyConfiguration diyConfiguration) {
        this.diyExecutor = diyExecutor;
        this.diyConfiguration = diyConfiguration;
    }


    /**
     * @param clazz 那个xml
     * @param <T> xml的所有sql
     * @return
     */
    public <T> T getMapper(Class<T> clazz){
        return diyConfiguration.getMapper(clazz);
    }


    /**
     * @param statement sql语句
     * @param parameter 参数
     * @param <T>
     * @return
     */
    public <T> T selectOne(String statement,String parameter){
        return diyExecutor.query(statement,parameter);
    }

}
