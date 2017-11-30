package strange.cypher.katyaar.Dagg;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by pnmhatre on 11/21/2017.
 */

@Singleton
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity mainActivity);
    Television getTelevision();
}
