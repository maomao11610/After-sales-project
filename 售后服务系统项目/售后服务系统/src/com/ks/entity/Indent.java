package com.ks.entity;

public class Indent {
    private int indent_id;
    private int user_id;
    private String user_name;
    private String user_sex;
    private String user_phonenum;
    private String user_address;
    private int service_id;
    private int worker_id;
    private String maintain_kind;
    private double cost;
    private boolean is_cost;
    private boolean is_order;
    private boolean is_over;
    private String user_comment;

    public Indent() {
    }

    public Indent(int indent_id, int user_id, String user_name, String user_sex, String user_phonenum, String user_address, int service_id, int worker_id, String maintain_kind, double cost, boolean is_cost, boolean is_order, boolean is_over, String user_comment) {
        this.indent_id = indent_id;
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_sex = user_sex;
        this.user_phonenum = user_phonenum;
        this.user_address = user_address;
        this.service_id = service_id;
        this.worker_id = worker_id;
        this.maintain_kind = maintain_kind;
        this.cost = cost;
        this.is_cost = is_cost;
        this.is_order = is_order;
        this.is_over = is_over;
        this.user_comment = user_comment;
    }

    @Override
    public String toString() {
        return "indent{" +
                "indent_id=" + indent_id +
                ", user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_phonenum='" + user_phonenum + '\'' +
                ", user_address='" + user_address + '\'' +
                ", service_id=" + service_id +
                ", worker_id=" + worker_id +
                ", maintain_kind='" + maintain_kind + '\'' +
                ", cost=" + cost +
                ", is_cost=" + is_cost +
                ", is_order=" + is_order +
                ", is_over=" + is_over +
                ", user_comment='" + user_comment + '\'' +
                '}';
    }

    public int getIndent_id() {
        return indent_id;
    }


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_phonenum() {
        return user_phonenum;
    }

    public void setUser_phonenum(String user_phonenum) {
        this.user_phonenum = user_phonenum;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public int getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(int worker_id) {
        this.worker_id = worker_id;
    }

    public String getMaintain_kind() {
        return maintain_kind;
    }

    public void setMaintain_kind(String maintain_kind) {
        this.maintain_kind = maintain_kind;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isIs_cost() {
        return is_cost;
    }

    public void setIs_cost(boolean is_cost) {
        this.is_cost = is_cost;
    }

    public boolean isIs_order() {
        return is_order;
    }

    public void setIs_order(boolean is_order) {
        this.is_order = is_order;
    }

    public boolean isIs_over() {
        return is_over;
    }

    public void setIs_over(boolean is_over) {
        this.is_over = is_over;
    }

    public String getUser_comment() {
        return user_comment;
    }

    public void setUser_comment(String user_comment) {
        this.user_comment = user_comment;
    }
}
