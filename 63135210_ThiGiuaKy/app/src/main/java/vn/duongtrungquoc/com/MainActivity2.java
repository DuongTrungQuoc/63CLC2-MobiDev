package vn.duongtrungquoc.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;
import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {
    private EditText editHeight;
    private EditText editWeight;
    private TextView result;
    private Button calbtn;
    private BreakIterator resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editHeight = findViewById(R.id.editHeight);
        editWeight = findViewById(R.id.editWeight);
        result = findViewById(R.id.result);
        calbtn = findViewById(R.id.calbtn);

        calbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });
    }
    private void calculate() {
        String inputH = editHeight.getText().toString();
        String inputW = editWeight.getText().toString();

        if (inputH.isEmpty() || inputW.isEmpty()) {
            resultTextView.setText("Vui lòng nhập cả chiều cao và cân nặng.");
            return;
        }
        try {
            double h = Double.parseDouble(inputH);
            double w = Double.parseDouble(inputW);
            double kq = (w/(h*h));
            resultTextView.setText("Tổng: " + kq);
        } catch (NumberFormatException e) {
            resultTextView.setText("Lỗi: Nhập sai định dạng số.");
        }
    }
}