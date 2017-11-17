package strange.cypher.katyaar.Part_2.Misc;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import strange.cypher.katyaar.Part_2.Anots.ApplicationContext;
import strange.cypher.katyaar.Part_2.Data.DataManager;
import strange.cypher.katyaar.Part_2.Data.SharedPrefrenceHelper;
import strange.cypher.katyaar.Part_2.DemoApplication;

/**
 * Created by pnmhatre on 11/17/2017.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getApplicationContext();
    Application getApplication();
    DataManager getDataManager();
    SharedPrefrenceHelper getSharedPrefsHelper();
}
