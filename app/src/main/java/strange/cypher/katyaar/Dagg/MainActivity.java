package strange.cypher.katyaar.Dagg;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.inject.Inject;

import strange.cypher.katyaar.R;

/**
 * Created by pnmhatre on 11/21/2017.
 */

public class MainActivity extends FragmentActivity {
    @Inject
    Television television;
    MainComponent mainComponent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSave = findViewById(R.id.btn_save);

        mainComponent = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        television = mainComponent.getTelevision();
        mainComponent.inject(this);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, String.valueOf(television.getSum(4)), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
