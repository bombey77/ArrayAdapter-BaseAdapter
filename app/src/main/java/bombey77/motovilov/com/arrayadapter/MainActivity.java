package bombey77.motovilov.com.arrayadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    List<PhoneModel> list;

    PhoneModelAdapter phoneModelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        phoneModelAdapter = new PhoneModelAdapter(this, initList());

        listView.setAdapter(phoneModelAdapter);
    }

    private List<PhoneModel> initList() {
        list = new ArrayList<>();
        list.add(new PhoneModel(0, "Mike", 13234));
        list.add(new PhoneModel(1, "Amily", 13234));
        list.add(new PhoneModel(2, "Jane", 13234));
        list.add(new PhoneModel(3, "Sonya", 13234));
        return list;
    }
}
