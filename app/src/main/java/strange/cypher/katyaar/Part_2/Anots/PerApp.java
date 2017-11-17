package strange.cypher.katyaar.Part_2.Anots;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import strange.cypher.katyaar.R;

/**
 * Created by pnmhatre on 11/17/2017.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerApp {
}
