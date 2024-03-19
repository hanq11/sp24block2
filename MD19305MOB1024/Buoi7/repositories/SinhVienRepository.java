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
        this.conn = DbConnection.getConnection();
    }
    
    public ArrayList<SinhVien> search() {
        String SQL = "SELECT * FROM SinhVien";
        
        ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(SQL);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            
            while(rs.next()) {
                String mssv = rs.getString("MSSV");
                String ten = rs.getString("Ten");
                int diem = rs.getInt("Diem");
                SinhVien sv = new SinhVien(mssv, ten, diem);
                ds.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ds;
    }
}

