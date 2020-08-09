package com.example.fitnessLife.map;

import com.example.fitnessLife.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new TreeMap<>();

    public T findById(ID id) {
        return map.get(id);
    }


    public T save(T t) {
        if (t != null) {
            if (t.getId() == null) {
                t.setId(getNextId());
            }
            map.put(t.getId(), t);
        } else throw new RuntimeException("Object can not be null!");

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

    public Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
