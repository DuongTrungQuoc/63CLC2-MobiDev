package com.duongtrungquoc.listbaihatyeuthich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Hiển thị dữ liệu lên ListView
        // B1. Chuẩn bị nguồn dữ liệu (có thể tạo sẵn (hardcode)/lấy từ tệp csdl)
        ArrayList<String> nguonDuLieu = new ArrayList<String>();
        nguonDuLieu.add("Cắt Đôi Nỗi Sầu");
        nguonDuLieu.add("Lệ Lưu Ly");
        nguonDuLieu.add("Hoa Cỏ Lau");
        nguonDuLieu.add("I do");
        nguonDuLieu.add("Ngày Mai Người Ta Lấy Chồng");
        nguonDuLieu.add("Rượu Mừng Hóa Người Dưng");
        //B2. Tìm tham chiếu đến ListView
        ListView listViewBH = (ListView) findViewById(R.id.lvDSbaihat);
        //B3. tạo adapter , 3.1 và gắn với nguồn
        ArrayAdapter<String> baiHat_Adapter = new ArrayAdapter<String>(this,
                                                                        android.R.layout.simple_list_item_1,
                                                                            nguonDuLieu);
        //B4. Gắn/ nạp dữ liệu vào ListView
        listViewBH.setAdapter(baiHat_Adapter);
        // Xử lý sự kiện
        listViewBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            // i là vị trí dc chọn/chạm/click trên Listview
            // Lấy giá trị của Item vừa chọn
                String value = baiHat_Adapter.getItem(i);
            // Xử lí khác theo yêu cầu
             // Ví dụ
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_LONG).show();

            }
        });

    }
}