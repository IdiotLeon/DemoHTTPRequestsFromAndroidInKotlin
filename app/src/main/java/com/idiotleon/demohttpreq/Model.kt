package com.idiotleon.demohttpreq

import com.squareup.moshi.Json

object Model {
    data class Result(@field:Json(name = "query") val query: Query)
    data class Query(@field:Json(name = "searchinfo") val searchInfo: SearchInfo)
    data class SearchInfo(@field:Json(name = "totalhits") val totalHits: Int)
}