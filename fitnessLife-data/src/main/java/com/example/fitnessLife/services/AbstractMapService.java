package com.example.fitnessLife.services;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap();

    public T findbyId(ID id) {
        return map.get(id);
    }


    public T save(ID id, T t) {
        map.put(id, t);
        return t;
    }


    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }


    public void delete(T t) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(t));
    }


    public void deleteById(ID id) {
        map.remove(id);
    }
}
