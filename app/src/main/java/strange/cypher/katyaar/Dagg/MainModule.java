package strange.cypher.katyaar.Dagg;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pnmhatre on 11/21/2017.
 */
@Module
public class MainModule {
    @Provides
    Television provideTelevision() {
        return new Television(new Remote());
    }
}
