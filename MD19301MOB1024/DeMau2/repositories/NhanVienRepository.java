package repositories;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.ArrayList;
import models.NhanVien;
import utils.DbConnection;
/**
 *
 * @author syn
 */
public class NhanVienRepository {
    private Connection conn;
    
    public NhanVienRepository() {
        conn = DbConnection.getConnection();
    }
    
    public ArrayList<NhanVien> search() {
        String SQL = "SELECT Ma, Ten, Sdt, TrangThai FROM NhanVien";
        
        ArrayList<NhanVien> danhSach = new ArrayList<NhanVien>();
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.execute();
          
            ResultSet rs = ps.getResultSet();
            while(rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String sdt = rs.getString("Sdt");
                int trangThai = rs.getInt("TrangThai");
                danhSach.add(new NhanVien(ma, ten, sdt, trangThai));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSach;
    }
}
