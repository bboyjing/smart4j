package cn.didadu.smart4j.chapter3.smartFramework.bean;

/** 返回值对象，对应Json数据
 * Created by jinggg on 16/3/21.
 */
public class Data {

    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}
