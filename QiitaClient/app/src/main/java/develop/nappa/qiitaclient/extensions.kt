package develop.nappa.qiitaclient

import android.content.Context
import android.support.annotation.IdRes
import android.view.View
import android.widget.Toast

/**
 * Created by nappannda on 2018/02/21.
 */
fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById(id) as T
}

fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}