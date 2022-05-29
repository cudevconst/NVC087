package com.example.cinema.dao;

import com.example.cinema.model.Rap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RapDAO extends AbstractDAO{
    public static Rap getRapByID(int id){
        Connection connection = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            connection = UserDAO.getConnection();
            String sql = "select * from rap where ID_RAP = ?";
            pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while(rs.next()){
                Rap rap = new Rap();
                rap.setIdRap(rs.getInt("ID_RAP"));
                rap.setTenRap(rs.getString("TEN_RAP"));
                rap.setDiaChi(rs.getString("DIA_CHI"));
                rap.setThongTin(rs.getString("THONG_TIN"));
                return rap;
            }

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
