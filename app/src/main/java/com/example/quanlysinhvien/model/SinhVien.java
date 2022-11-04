package com.example.quanlysinhvien.model;

public class SinhVien {
    private int MaSV_106;
    private String HoTen_106;
    private int GioiTinh_106;
    private String DienThoai_106;
    private String Email_106;

    public SinhVien() {
    }

    public SinhVien(String hoTen_106, int gioiTinh_106, String dienThoai_106, String email_106) {
        HoTen_106 = hoTen_106;
        GioiTinh_106 = gioiTinh_106;
        DienThoai_106 = dienThoai_106;
        Email_106 = email_106;
    }

    public SinhVien(int maSV_106, String hoTen_106, int gioiTinh_106, String dienThoai_106, String email_106) {
        MaSV_106 = maSV_106;
        HoTen_106 = hoTen_106;
        GioiTinh_106 = gioiTinh_106;
        DienThoai_106 = dienThoai_106;
        Email_106 = email_106;
    }

    public int getMaSV_106() {
        return MaSV_106;
    }

    public void setMaSV_106(int maSV_106) {
        MaSV_106 = maSV_106;
    }

    public String getHoTen_106() {
        return HoTen_106;
    }

    public void setHoTen_106(String hoTen_106) {
        HoTen_106 = hoTen_106;
    }

    public int getGioiTinh_106() {
        return GioiTinh_106;
    }

    public void setGioiTinh_106(int gioiTinh_106) {
        GioiTinh_106 = gioiTinh_106;
    }

    public String getDienThoai_106() {
        return DienThoai_106;
    }

    public void setDienThoai_106(String dienThoai_106) {
        DienThoai_106 = dienThoai_106;
    }

    public String getEmail_106() {
        return Email_106;
    }

    public void setEmail_106(String email_106) {
        Email_106 = email_106;
    }
}
