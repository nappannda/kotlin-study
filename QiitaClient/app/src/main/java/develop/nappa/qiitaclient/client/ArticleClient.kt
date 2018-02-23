package develop.nappa.qiitaclient.client

import develop.nappa.qiitaclient.model.Article
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by nappannda on 2018/02/23.
 */

interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}