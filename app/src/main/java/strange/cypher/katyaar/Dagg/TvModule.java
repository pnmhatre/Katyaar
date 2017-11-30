package strange.cypher.katyaar.Dagg;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pnmhatre on 11/21/2017.
 */
@Module
public class TvModule {
    @Provides
    Remote provideRemote() {
        return new Remote();
    }

    @Provides
    Television provideTelevision() {
        return new Television(new Remote());
    }
}
