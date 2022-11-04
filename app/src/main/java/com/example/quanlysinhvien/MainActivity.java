package com.example.quanlysinhvien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.quanlysinhvien.adapter.SinhVienAdapter;
import com.example.quanlysinhvien.dao.SinhVienDAO;
import com.example.quanlysinhvien.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvSinhVien_106;
    private List<SinhVien> sinhvienList_106;
    private SinhVienAdapter adapter_106;
    private SinhVienDAO svDAO_106;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSinhVien_106 = (ListView) findViewById(R.id.lvsinhvien_106);
        sinhvienList_106 = new ArrayList<SinhVien>();
        svDAO_106 = new SinhVienDAO(MainActivity.this);
        sinhvienList_106= svDAO_106.TatCaSinhVien();
        adapter_106 = new SinhVienAdapter(getApplicationContext(),sinhvienList_106);
        lvSinhVien_106.setAdapter(adapter_106);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item ){
        int id = item.getItemId();
        if( id==R.id.menu_them){
            Intent intent = new Intent(MainActivity.this,AddActivity.class);
            startActivity(intent);
        }
        if ( id ==R.id.menu_thoat){
            finish();
        }
        return true;
    }
}