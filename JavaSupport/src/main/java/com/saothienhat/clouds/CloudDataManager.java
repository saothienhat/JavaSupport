package com.saothienhat.clouds;

import java.util.List;

public interface CloudDataManager
{
    public Object getDataById(int id);
    
    public List<Object> getAllData();
    
    public List<Object> getAllDataById(int id);
    
    public int insertData(Object data);
    
    public int deleteDataById(int id);
    
    public int updateDataById(int id, Object newData);

}
