package vn.duongtrungquoc.bookmanappsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BookNavi extends AppCompatActivity {
    SQLiteDatabase dbSACH;
    Cursor controBanGhi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_navi);
        // Mở CSDL
        dbSACH = openOrCreateDatabase("QuanLySach.db",MODE_PRIVATE,null);
        // ĐỌc toàn bộ bảng book
        controBanGhi = dbSACH.rawQuery("Select * from BOOKS",null);
        // Chuyển con trỏ về bản ghi đầu tiên
        controBanGhi.moveToFirst();
        CapNhatManHinhTheoConTro();

        Button btnNext = findViewById(R.id.btnTiepTheo);
        Button btnFirst = findViewById(R.id.btnDauTien);

        btnNext.setOnClickListener(xuLyNext);
        btnFirst.setOnClickListener(xuLyFirst);
    }// Hết create
    public void CapNhatManHinhTheoConTro(){
        //Hiện bản ghi đầu tiên này lên màn hình
        // Lấy dữ liệu ở dòng hiện tại đang dc trỏ bởi controBanGhi
        int maSach = controBanGhi.getInt(0);
        String tenSach = controBanGhi.getString(1);
        int soTrang = controBanGhi.getInt(2);
        float gia = controBanGhi.getFloat(3);
        String mota = controBanGhi.getString(4);
        // đặt vào các điều khiển
        EditText edMaSach = findViewById(R.id.edMaSach);
        EditText edTenSach = findViewById(R.id.edTenSach);
        edMaSach.setText(String.valueOf(maSach));
        edTenSach.setText(tenSach);}
    //====================CÁC BỘ LẮNG NGHE================================
    View.OnClickListener xuLyNext = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
            if(!controBanGhi.isLast()){
                controBanGhi.moveToNext();
                // Lấy dữ liệu và cập nhật lên màn hình
                CapNhatManHinhTheoConTro();
            }
        }
    };
    View.OnClickListener xuLyFirst = new View.OnClickListener(){
        @Override
        public void onClick(View v)
        {
                controBanGhi.moveToFirst();
                // Lấy dữ liệu và cập nhật lên màn hình
            CapNhatManHinhTheoConTro();
            }
        };
    //==============================================================================================
}