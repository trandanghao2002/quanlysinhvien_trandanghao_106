package com.example.quanlysinhvien.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context, "QLSinhVien.sqlite",null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            String sqlSVCreate ="CREATE TABLE IF NOT EXISTS " +
                    "SinhVien(MaSV_106 INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "HoTen_106 VARCHAR(200), " +
                    "GioiTinh_106 INTEGER, " +
                    "DienThoai_106 VARCHAR(13), " +
                    "Email_106 VARCHAR(200))";
        sqLiteDatabase.execSQL(sqlSVCreate);
        String sqlInsert1 ="INSERT INTO SinhVien(HoTen_106,GioiTinh_106,DienThoai_106,Email_106) VALUES('Hào','0','106','hao@gmail.com')";
        String sqlInsert2 ="INSERT INTO SinhVien(HoTen_106,GioiTinh_106,DienThoai_106,Email_106) VALUES('Duyên','1','106','duyen@gmail.com')";
        String sqlInsert3 ="INSERT INTO SinhVien(HoTen_106,GioiTinh_106,DienThoai_106,Email_106) VALUES('Trần','0','106','tran@gmail.com')";
        sqLiteDatabase.execSQL(sqlInsert1);
        sqLiteDatabase.execSQL(sqlInsert2);
        sqLiteDatabase.execSQL(sqlInsert3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
