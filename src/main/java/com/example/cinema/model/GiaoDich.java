package com.example.cinema.model;

import java.util.List;

public class GiaoDich {
    private HoaDon hoaDon;
    private List<Ve> ve;

    public GiaoDich() {
    }

    public GiaoDich(HoaDon hoaDon, List<Ve> ve) {
        this.hoaDon = hoaDon;
        this.ve = ve;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public List<Ve> getVe() {
        return ve;
    }

    public void setVe(List<Ve> ve) {
        this.ve = ve;
    }
}
