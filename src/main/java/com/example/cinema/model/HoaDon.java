package com.example.cinema.model;

import java.sql.Date;
import java.util.List;

public class HoaDon {
    private int idHoaDon;
    private Date ngayMua;
    private int soLuong;
    private int tongTien;
    private User user;
    private List<Ve> ves;
    public HoaDon() {
    }

    public HoaDon(int idHoaDon, Date ngayMua, int soLuong, int tongTien, User user) {
        this.idHoaDon = idHoaDon;
        this.ngayMua = ngayMua;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.user = user;
    }
    public HoaDon(Date ngayMua, int soLuong, int tongTien, User user) {
        this.ngayMua = ngayMua;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.user = user;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
