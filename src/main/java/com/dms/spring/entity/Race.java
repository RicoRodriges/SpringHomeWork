package com.dms.spring.entity;

import java.util.Map;

public class Race {

    private Map<Horse, Rider> info;

    public Race(Map<Horse, Rider> info) {
        this.info = info;
    }

    public Map<Horse, Rider> getInfo() {
        return info;
    }

}
