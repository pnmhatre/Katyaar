package strange.cypher.katyaar.Part_2.Misc;

import android.content.Context;
import android.support.v4.app.FragmentActivity;

import dagger.Module;
import dagger.Provides;
import strange.cypher.katyaar.Part_2.Anots.ActivityContext;

/**
 * Created by pnmhatre on 11/17/2017.
 */
@Module
public class ActivityModule {
    FragmentActivity fragmentActivity;

    public ActivityModule(FragmentActivity fragmentActivity) {
        this.fragmentActivity = fragmentActivity;
    }

    @Provides
    @ActivityContext
    Context provideActivityContext() {
        return fragmentActivity;
    }

    @Provides
    FragmentActivity provideActivity() {
        return fragmentActivity;
    }

}
