package develop.nappa.qiitaclient

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import develop.nappa.qiitaclient.model.Article
import develop.nappa.qiitaclient.model.User
import develop.nappa.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ArticleViewオブジェクトを生成
        val articleView = ArticleView(applicationContext)

        // Articleオブジェクトを生成して、ArticleViewオブジェクトにセット
        articleView.setArticle(Article(id = "123",
                title = "Kotlin入門",
                url = "http://www.example.com/article/123",
                user = User(id = "456", name = "たろう", profileImageUrl = "")))

        // このアクティビティにArticleViewオブジェクトをセット
        setContentView(articleView)
    }
}
