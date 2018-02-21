package develop.nappa.qiitaclient

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by nappannda on 2018/02/21.
 */
fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById(id) as T
}