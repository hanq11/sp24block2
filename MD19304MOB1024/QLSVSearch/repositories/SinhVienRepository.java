/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*;
import java.util.ArrayList;
import models.SinhVien;
import utils.DbConnection;
/**
 *
 * @author syn
 */
public class SinhVienRepository {
    private Connection conn;
    
    public SinhVienRepository() {
        conn = DbConnection.getConnection();
    }
    
    public ArrayList<SinhVien> search(String keyword) {
        String SQL = "SELECT * FROM SinhVien";
        
        if(keyword.trim().length() != 0) {
            SQL += " WHERE MaSinhVien LIKE ? OR Ten LIKE ? OR Diem LIKE ?";
        }
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            if(keyword.trim().length() != 0) {
                ps.setString(1, "%" + keyword + "%");
                ps.setString(2, "%" + keyword + "%");
                ps.setString(3, "%" + keyword + "%");                
            }
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while(rs.next()) {
                String maSinhVien = rs.getString("MaSinhVien");
                String ten = rs.getString("Ten");
                int diem = rs.getInt("Diem");
                SinhVien sv = new SinhVien(maSinhVien, ten, diem);
                ds.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
    
    public void create(SinhVien sv) {
        String SQL = "INSERT INTO SinhVien (MaSinhVien, Ten, Diem) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.setString(1, sv.getMaSinhVien());
            ps.setString(2, sv.getTen());
            ps.setInt(3, sv.getDiem());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(String maSinhVien) {
        String SQL = "DELETE FROM SinhVien WHERE MaSinhVien = ?";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.setString(1, maSinhVien);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(SinhVien sv) {
        String SQL = "UPDATE SinhVien SET Ten = ?, Diem = ? WHERE MaSinhVien = ?";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.setString(1, sv.getTen());
            ps.setInt(2, sv.getDiem());
            ps.setString(3, sv.getMaSinhVien());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
