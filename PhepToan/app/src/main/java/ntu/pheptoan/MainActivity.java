package ntu.pheptoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Khai bao cac doi tuong gan voi dkhien tuong ung
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextkq;
    Button nutCong,nutTru,nutNhan,nutChia;
    void TimDieuKhien()
    {
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextkq = (EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }

    // Xu ly cong
    public void XuLyCong(View v)
    {
        // code xu ly cong o day
        // b1: lay du lieu 2 so
        // b1.1: Tim EditText so 1 va so 2
        // b1.2: Lay du lieu tu 2 dkhien do'
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3 Chuyen du lieu tu chuoi -> so
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //B2. Tinh toan
        float Tong = soA + soB;
        //B3. Hien ket qua
        //B3.1
        //B3.2 cb du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Tong);
        // B3.3 gan ket qua len dk
        editTextkq.setText(chuoiKQ);
    }
 public void XuLyTru(View v)
    {

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float Hieu = soA - soB;

        String chuoiKQ = String.valueOf(Hieu);

        editTextkq.setText(chuoiKQ);
    }
    public void XuLyNhan(View v)
    {
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float Tich = soA * soB;

        String chuoiKQ = String.valueOf(Tich);

        editTextkq.setText(chuoiKQ);
    }
    public void XuLyChia(View v)
    {

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float Thuong = soA / soB;

        String chuoiKQ = String.valueOf(Thuong);


    }
}