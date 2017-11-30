package strange.cypher.katyaar;

import android.app.Application;

/**
 * Created by pnmhatre on 11/20/2017.
 */

public class MyApp extends Application {
    DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        daoSession = new DaoMaster(new DbOpenHelper(this, "MyDb").getWritableDb()).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
