package strange.cypher.katyaar.Part_2.Data;

import android.content.SharedPreferences;

import javax.inject.Inject;
import javax.inject.Singleton;


/**
 * Created by pnmhatre on 11/17/2017.
 */
@Singleton
public class SharedPrefrenceHelper {
    SharedPreferences sharedPreferences;

    @Inject
    public SharedPrefrenceHelper(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public void putSTring(String key, String value) {
        sharedPreferences.edit().putString(key, value).commit();
    }

    public String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

}
