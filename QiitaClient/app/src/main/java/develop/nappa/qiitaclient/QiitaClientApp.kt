package develop.nappa.qiitaclient

import android.app.Application
import develop.nappa.qiitaclient.dagger.AppComponent
import develop.nappa.qiitaclient.dagger.DaggerAppComponent


/**
 * Created by nappannda on 2018/02/24.
 */
class QiitaClientApp : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }
}