package strange.cypher.katyaar

import android.content.Context

import org.greenrobot.greendao.database.Database

import javax.inject.Inject

/**
 * Created by pnmhatre on 11/20/2017.
 */

class DbOpenHelper @Inject
constructor(context: Context, name: String) : DaoMaster.OpenHelper(context, name) {

    override fun onUpgrade(db: Database?, oldVersion: Int, newVersion: Int) {
        super.onUpgrade(db, oldVersion, newVersion)
        when (oldVersion) {

        }
    }
}
