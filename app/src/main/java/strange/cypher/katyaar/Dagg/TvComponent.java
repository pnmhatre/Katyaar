package strange.cypher.katyaar.Dagg;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by pnmhatre on 11/21/2017.
 */
@Singleton
@Component(modules = TvModule.class)
public interface TvComponent {
    Remote getRemote();
}
