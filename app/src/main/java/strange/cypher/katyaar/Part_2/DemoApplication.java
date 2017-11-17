package strange.cypher.katyaar.Part_2;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import strange.cypher.katyaar.Part_2.Data.DataManager;
import strange.cypher.katyaar.Part_2.Misc.ApplicationComponent;
import strange.cypher.katyaar.Part_2.Misc.ApplicationModule;
import strange.cypher.katyaar.Part_2.Misc.DaggerApplicationComponent;

/**
 * Created by pnmhatre on 11/17/2017.
 */

public class DemoApplication extends Application {

    @Inject
    DataManager dataManager;
    ApplicationComponent applicationComponent;


    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);

    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }
}
