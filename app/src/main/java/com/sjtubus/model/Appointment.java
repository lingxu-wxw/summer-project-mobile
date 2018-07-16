package com.sjtubus.model;

import com.google.gson.annotations.SerializedName;

public class Appointment {

    public static final int PARENT_ITEM = 0; //父布局
    public static final int CHILD_ITEM = 1; //子布局

    private int type; //显示类型
    private boolean isExpand; //是否展开
    private Appointment childBean;

    private String id;
    private String linename;

    @SerializedName("shiftId")
    private String shiftid;
    private String departure_place;
    private String arrive_place;
    @SerializedName("departureTime")
    private String departure_time;
    @SerializedName("arriveTime")
    private String arrive_time;
    @SerializedName("remainSeat")
    private int remain_seat;

    private int appoint_status; //无座，预约
//    private String child_msg;

    /****************************************/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isExpand(){
        return isExpand;
    }

    public void setExpand(boolean expand) {
        isExpand = expand;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Appointment getChildBean() {
        return childBean;
    }

    public void setChildBean(Appointment childBean) {
        this.childBean = childBean;
    }

    public String getShiftid() {
        return shiftid;
    }

    public void setShiftid(String shiftid) {
        this.shiftid = shiftid;
    }

    public String getDeparture_place() {
        return departure_place;
    }

    public void setDeparture_place(String departure_place) { this.departure_place = departure_place; }

    public String getArrive_place() {
        return arrive_place;
    }

    public void setArrive_place(String arrive_place) {
        this.arrive_place = arrive_place;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(String arrive_time) {
        this.arrive_time = arrive_time;
    }

    public int getRemain_seat() {
        return remain_seat;
    }

    public void setRemain_seat(int remain_seat) {
        this.remain_seat = remain_seat;
    }

    public int getAppoint_status() {
        return appoint_status;
    }

    public void setAppoint_status(int appoint_status) {
        this.appoint_status = appoint_status;
    }

//    public String getChild_msg() {
//        return child_msg;
//    }
//
//    public void setChild_msg(String child_msg) {
//        this.child_msg = child_msg;
//    }
}