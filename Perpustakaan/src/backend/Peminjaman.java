/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;
/**
 *
 * @author destini marine
 */
public class Peminjaman {
    private int idpeminjaman;
    private Buku buku = new Buku();
    private Anggota anggota = new Anggota();
    private LocalDate tanggalpinjam;
    private LocalDate tanggalkembali;

    public Peminjaman(Buku buku, Anggota anggota, LocalDate tanggalpinjam, LocalDate tanggalkembali) {
        this.buku = buku;
        this.anggota = anggota;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }

    public Peminjaman() {
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public void setTanggalpinjam(LocalDate tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public void setTanggalkembali(LocalDate tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public Buku getBuku() {
        return buku;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public LocalDate getTanggalpinjam() {
        return tanggalpinjam;
    }

    public LocalDate getTanggalkembali() {
        return tanggalkembali;
    }
    
    public Peminjaman getById(int id) {
        Peminjaman peminjaman = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery(
            "SELECT "
            + "p.idpeminjaman AS idpeminjaman, "
            + "p.tanggalpinjam AS tanggalpinjam, "
            + "p.tanggalkembali AS tanggalkembali, "
            + "b.idbuku AS idbuku, "
            + "b.judul AS judul, "
            + "a.idanggota AS idanggota, "
            + "a.nama AS nama "
            + "FROM peminjaman p "
            + "LEFT JOIN buku b ON p.idbuku = b.idbuku "
            + "LEFT JOIN anggota a ON p.idanggota = a.idanggota "
            + "WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalpinjam(rs.getDate("tanggalpinjam").toLocalDate());
                peminjaman.setTanggalkembali(rs.getDate("tanggalkembali").toLocalDate());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return peminjaman;
    }
    
    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery(
            "SELECT "
            + "p.idpeminjaman AS idpeminjaman, "
            + "p.tanggalpinjam AS tanggalpinjam, "
            + "p.tanggalkembali AS tanggalkembali, "
            + "b.idbuku AS idbuku, "
            + "b.judul AS judul, "
            + "a.idanggota AS idanggota, "
            + "a.nama AS nama "
            + "FROM peminjaman p "
            + "LEFT JOIN buku b ON p.idbuku = b.idbuku "
            + "LEFT JOIN anggota a ON p.idanggota = a.idanggota ");
        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalpinjam(rs.getDate("tanggalpinjam").toLocalDate());
                peminjaman.setTanggalkembali(rs.getDate("tanggalkembali").toLocalDate());
                
                ListPeminjaman.add(peminjaman);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman> search(String keyword) {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList<>();
        
        ResultSet rs = DBHelper.selectQuery(
            "SELECT "
            + "p.idpeminjaman AS idpeminjaman, "
            + "p.tanggalpinjam AS tanggalpinjam, "
            + "p.tanggalkembali AS tanggalkembali, "
            + "b.idbuku AS idbuku, "
            + "b.judul AS judul, "
            + "a.idanggota AS idanggota, "
            + "a.nama AS nama "
            + "FROM peminjaman p "
            + "LEFT JOIN buku b ON p.idbuku = b.idbuku "
            + "LEFT JOIN anggota a ON p.idanggota = a.idanggota "
            + "WHERE p.tanggalpinjam LIKE '%" + keyword + "%' "
            + "OR p.tanggalkembali LIKE '%" + keyword + "%' "
            + "OR b.judul LIKE '%" + keyword + "%' "
            + "OR a.nama LIKE '%" + keyword + "%' ");
        
        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalpinjam(rs.getDate("tanggalpinjam").toLocalDate());
                peminjaman.setTanggalkembali(rs.getDate("tanggalkembali").toLocalDate());
                
                ListPeminjaman.add(peminjaman);   
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPeminjaman;
    }
    
    public void save() {
        if (getById(idpeminjaman).getIdpeminjaman()== 0) {
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    + "'" + this.getAnggota().getIdanggota() + "', "
                    + "'" + this.getBuku().getIdbuku()+ "', "
                    + "'" + this.tanggalpinjam + "', "
                    + "'" + this.tanggalkembali + "'"
                    + ");";
            this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE peminjaman SET "
                    + "idanggota = '" + this.getAnggota().getIdanggota() + "', "
                    + "idbuku = '" + this.getBuku().getIdbuku()+ "', "
                    + "tanggalpinjam = '" + this.tanggalpinjam + "', "
                    + "tanggalkembali = '" + this.tanggalkembali + "' "
                    + "WHERE idpeminjaman = '" + this.idpeminjaman + "';";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman= '" + this.idpeminjaman + "';";
        DBHelper.executeQuery(SQL);
    }    
    
}
