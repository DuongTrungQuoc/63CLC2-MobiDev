package vn.duongtrungquoc.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    ArrayList<String> dsTruyen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        findControls();
        dsTruyen = new ArrayList<String>();
        dsTruyen.add("Dế Mèn phiêu lưu kí");
        dsTruyen.add("Truyện Kiều");
        dsTruyen.add("Nam Sơn Thực Lục");
        dsTruyen.add("Tam quốc chí");
        dsTruyen.add("Hai con dê");
        ArrayAdapter<String> adapterBH;
        adapterBH = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                dsTruyen
        );

        listViewTruyen.setAdapter(adapterBH);
    }
    public void findControls() {
        listViewTruyen = findViewById(R.id.lvTruyen);
    }
    ListView listViewTruyen;
}