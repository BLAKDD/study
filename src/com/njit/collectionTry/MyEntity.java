package com.njit.collectionTry;

public class MyEntity implements Cloneable{
    private Integer key;
    private Integer code = 0;
    MyEntity()
    {
    }
    MyEntity(Integer key)
    {
        this.key = key;
    }

    MyEntity(Integer key,Integer code)
    {
        this.key = key;
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if(!(o instanceof MyEntity))
            return false;
        MyEntity me = (MyEntity)o;
        if (this.key!= null)
            return this.key.equals(me.key);
        else
            return me.key == null;
    }

    @Override
    public int hashCode() {
        return code;//Objects.hash(key, code);
    }

    Integer getKey() {
        return key;
    }

    void setKey(Integer key) {
        this.key = key;
    }

    Integer getCode() {
        return code;
    }

    void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "MyEntity{" +
                "key=" + key +
                ", code=" + code +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
