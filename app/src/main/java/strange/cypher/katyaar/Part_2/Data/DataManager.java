package strange.cypher.katyaar.Part_2.Data;

import javax.inject.Inject;
import javax.inject.Singleton;


/**
 * Created by pnmhatre on 11/17/2017.
 */
@Singleton
public class DataManager {
    SharedPrefrenceHelper sharedPrefrenceHelper;

    final String EMAIL = "email";

    @Inject
    public DataManager(SharedPrefrenceHelper sharedPrefrenceHelper) {
        this.sharedPrefrenceHelper = sharedPrefrenceHelper;
    }

    public void saveEmail(String value) {
        sharedPrefrenceHelper.putSTring(EMAIL, value);
    }

    public String getEmmailId() {
        return sharedPrefrenceHelper.getString(EMAIL);
    }
}
