package com.liaobinyu.datatest.bean;

public class analysis_result_bean extends analysis_result_beanKey {
    private Integer startTime;

    private Integer sucessTime;

    private Integer failTime;

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getSucessTime() {
        return sucessTime;
    }

    public void setSucessTime(Integer sucessTime) {
        this.sucessTime = sucessTime;
    }

    public Integer getFailTime() {
        return failTime;
    }

    public void setFailTime(Integer failTime) {
        this.failTime = failTime;
    }
}