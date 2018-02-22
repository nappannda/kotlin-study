package develop.nappa.qiitaclient

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import develop.nappa.qiitaclient.model.Article
import develop.nappa.qiitaclient.view.ArticleView

/**
 * Created by nappannda on 2018/02/22.
 */
class ArticleActivity : AppCompatActivity() {

    companion object {

        private const val ARTICLE_EXTRA: String = "article"

        fun intent(context: Context, article: Article): Intent =
                Intent(context, ArticleActivity::class.java)
                        .putExtra(ARTICLE_EXTRA, article)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

        val articleView = findViewById(R.id.article_view) as ArticleView
        val webView = findViewById(R.id.webView) as WebView

        val article: Article = intent.getParcelableExtra(ARTICLE_EXTRA)
        articleView.setArticle(article)
        webView.loadUrl(article.url)

    }
}