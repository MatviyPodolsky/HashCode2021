package com.company.models;

public class Street {

    int start;
    int end;
    String name;
    int time;

    public Street(int start, int end, String name, int time) {
        this.start = start;
        this.end = end;
        this.name = name;
        this.time = time;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
