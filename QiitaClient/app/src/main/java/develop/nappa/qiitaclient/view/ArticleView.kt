package develop.nappa.qiitaclient.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import develop.nappa.qiitaclient.R
import develop.nappa.qiitaclient.bindView
import develop.nappa.qiitaclient.model.Article

/**
 * Created by nappannda on 2018/02/21.
 */
class ArticleView : FrameLayout {

    constructor(context: Context?) : super(context)

    constructor(context: Context?,
                attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int,
                defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    val profileImageView: ImageView by bindView(R.id.profile_image_view)

    val titleTextView: TextView by bindView(R.id.title_text_view)

    val userNameTextView: TextView by bindView(R.id.user_name_text_view)

    init {
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
    }

    fun setArticle(article: Article) {
        titleTextView?.text = article.title
        userNameTextView?.text = article.user.name
        Glide.with(context).load(article.user.profileImageUrl).into(profileImageView)
    }
}