package strange.cypher.katyaar.Part_2.Misc;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;
import strange.cypher.katyaar.Part_2.Anots.ApplicationContext;
import strange.cypher.katyaar.Part_2.DemoApplication;

/**
 * Created by pnmhatre on 11/17/2017.
 */
@Module
public class ApplicationModule {
    Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @ApplicationContext
    Context provideApplicationContext() {
        return application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

    @Provides
    SharedPreferences provideSharedPrefs() {
        return application.getSharedPreferences("prefs", Context.MODE_PRIVATE);
    }
}
