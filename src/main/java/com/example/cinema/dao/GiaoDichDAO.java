package com.example.cinema.dao;

import com.example.cinema.model.GiaoDich;
import com.example.cinema.model.HoaDon;
import com.example.cinema.model.Ve;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GiaoDichDAO extends AbstractDAO{
    private UserDAO userDAO = new UserDAO();
    private VeDAO veDAO = new VeDAO();
    public List<GiaoDich> getGiaoDichByIDUser(int idUser){
        List<GiaoDich> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            connection = UserDAO.getConnection();
            String sql = "select ID_HOADON from hoadon where ID_USER = ?";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, idUser);
            rs = pstm.executeQuery();
            while(rs.next()){
                GiaoDich giaoDich = new GiaoDich();
                HoaDon hoaDon = new HoaDon();
                hoaDon.setIdHoaDon(rs.getInt("ID_HOADON"));
                hoaDon.setNgayMua(rs.getDate("NGAY_MUA"));
                hoaDon.setSoLuong(rs.getInt("SO_LUONG"));
                hoaDon.setTongTien(rs.getInt("TONG_TIEN"));
                hoaDon.setUser(userDAO.getUserById(rs.getInt("ID_USER")));
                List<Ve> veList = veDAO.getVeByIDHoaDon(rs.getInt("ID_HOADON"));
                giaoDich.setHoaDon(hoaDon);
                giaoDich.setVe(veList);
                list.add(giaoDich);
            }
            return list;


        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(connection != null){
                    connection.close();
                }
                if(pstm != null){
                    pstm.close();
                }
                if(rs != null){
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        return null;
    }
}
