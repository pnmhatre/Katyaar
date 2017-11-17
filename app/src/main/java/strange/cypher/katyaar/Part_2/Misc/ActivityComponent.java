package strange.cypher.katyaar.Part_2.Misc;

import javax.inject.Singleton;

import dagger.Component;
import strange.cypher.katyaar.Part_2.Anots.PerApp;
import strange.cypher.katyaar.Part_2.MainActivity;

/**
 * Created by pnmhatre on 11/17/2017.
 */
@PerApp
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

}
