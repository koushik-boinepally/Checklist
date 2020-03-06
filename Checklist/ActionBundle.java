package com.applications.koushik.ugcnetpractice.Tools.Checklist;

import java.util.HashMap;
import java.util.Map;

public class ActionBundle{

    Map<String,Object> bundleMap = new HashMap<>();

    public Object get(String key){
        return bundleMap.get(key);
    }

    public void put(String key , Object object){
        bundleMap.put(key,object);
    }

    @Override
    public String toString() {
        return "ActionBundle{" +
                "bundleMap=" + bundleMap +
                '}';
    }
}