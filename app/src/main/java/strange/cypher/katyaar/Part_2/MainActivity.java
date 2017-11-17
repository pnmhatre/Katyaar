package strange.cypher.katyaar.Part_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import javax.inject.Inject;
import strange.cypher.katyaar.Part_2.Data.DataManager;
import strange.cypher.katyaar.Part_2.Misc.ActivityComponent;
import strange.cypher.katyaar.Part_2.Misc.ActivityModule;
import strange.cypher.katyaar.Part_2.Misc.DaggerActivityComponent;
import strange.cypher.katyaar.R;

/**
 * Created by pnmhatre on 11/17/2017.
 */
public class MainActivity extends FragmentActivity {
    @Inject
    DataManager dataManager;
    private EditText editText;
    private TextView textView;
    ActivityComponent activityComponent;


    public ActivityComponent getActivityComponent() {
        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(DemoApplication.get(this)
                        .getComponent())
                .build();

        return activityComponent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getActivityComponent().inject(this);

        editText = findViewById(R.id.ed_user_info);
        textView = findViewById(R.id.tv_access_token);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataManager.saveEmail(editText.getText().toString());
            }
        });

        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, dataManager.getEmmailId(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
