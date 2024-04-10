/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*;
import java.util.ArrayList;
import models.KhachHang;
import utils.DbConnection;
/**
 *
 * @author syn
 */
public class KhachHangRepository {
    private Connection conn;
    
    public KhachHangRepository() {
        this.conn = DbConnection.getConnection();
    }
    
    public ArrayList<KhachHang> search() {
        String SQL = "SELECT Ma, Ten, SDT, GioiTinh FROM KhachHang";
        ArrayList<KhachHang> danhSach = new ArrayList<>();
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while(rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String sdt = rs.getString("SDT");
                int gioiTinh = rs.getInt("GioiTinh");
                danhSach.add(new KhachHang(ma, ten, sdt, gioiTinh));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSach;
    }
    
    public void create(KhachHang kh) {
        String SQL = "INSERT INTO KhachHang (Ma, Ten, SDT, GioiTinh) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.setString(1, kh.getMa());
            ps.setString(2, kh.getTen());
            ps.setString(3, kh.getSdt());
            ps.setInt(4, kh.getGioiTinh());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(String ma) {
        String SQL = "DELETE FROM KhachHang WHERE Ma = ?";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.setString(1, ma);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
