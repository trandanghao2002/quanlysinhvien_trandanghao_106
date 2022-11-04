package com.example.quanlysinhvien.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quanlysinhvien.R;
import com.example.quanlysinhvien.model.SinhVien;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    private List<SinhVien> sinhVienList_106;
    private Context context;
    public SinhVienAdapter(Context context, List<SinhVien> listlist){
     this.context = context;
     this.sinhVienList_106 =listlist;
    }
    @Override
    public int getCount() {
        return sinhVienList_106.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoder viewHoder;
        if(view== null){
            viewHoder = new ViewHoder();
            LayoutInflater inflater =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.view_item_sinhvien, null);
            viewHoder.tvMaSV_106 = view.findViewById(R.id.tv_masv_106);
            viewHoder.tvHoTen_106 = view.findViewById(R.id.tv_hoten_106);
            viewHoder.tvDienThoai_106 = view.findViewById(R.id.tv_dienthoai_106);
            viewHoder.tvEmail_106 = view.findViewById(R.id.tv_email_106);
            viewHoder.ivGioiTinh_106 = view.findViewById(R.id.tvgioitinh_106);
            view.setTag(viewHoder);
        }
        else {
            viewHoder =(ViewHoder) view.getTag();
        }
        SinhVien sv = sinhVienList_106.get(i);
        viewHoder.tvMaSV_106.setText("Mã SV: "+ sv.getMaSV_106());
        viewHoder.tvHoTen_106.setText("Họ Tên: "+ sv.getHoTen_106());
        viewHoder.tvDienThoai_106.setText("Điện Thoại: "+ sv.getDienThoai_106());
        viewHoder.tvEmail_106.setText("Email: "+ sv.getEmail_106());
        if(sv.getGioiTinh_106()==0){
        viewHoder.ivGioiTinh_106.setImageResource(R.drawable.face);}
        else {
            viewHoder.ivGioiTinh_106.setImageResource(R.drawable.img);}
        return view;
    }
    class ViewHoder{
        ImageView ivGioiTinh_106;
        TextView tvMaSV_106,tvHoTen_106,tvDienThoai_106,tvEmail_106;
    }
}
