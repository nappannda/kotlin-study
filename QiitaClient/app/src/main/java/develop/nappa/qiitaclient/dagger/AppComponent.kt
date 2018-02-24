package develop.nappa.qiitaclient.dagger

import dagger.Component
import develop.nappa.qiitaclient.MainActivity
import javax.inject.Singleton

/**
 * Created by nappannda on 2018/02/24.
 */
@Component(modules = arrayOf(ClientModule::class))
@Singleton
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}