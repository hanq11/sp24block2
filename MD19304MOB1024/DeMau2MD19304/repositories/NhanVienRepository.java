/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
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
        this.conn = DbConnection.getConnection();
    }
    
    public ArrayList<NhanVien> search() {
        String SQL = "SELECT Ma, Ten, Sdt, TrangThai FROM NhanVien";
        ArrayList<NhanVien> danhSach = new ArrayList<>();
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
    
        
    public void update(NhanVien nv, String maOld) {
        String SQL = "UPDATE NhanVien SET Ma = ?, Ten = ?, Sdt = ?, TrangThai = ? WHERE Ma = ?";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getTen());
            ps.setString(3, nv.getSdt());
            ps.setInt(4, nv.getTrangThai());
            ps.setString(5, maOld);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
