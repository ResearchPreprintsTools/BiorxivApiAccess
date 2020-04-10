package dev.biorxiv.api

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.sun.org.apache.xerces.internal.parsers.DOMParser
import dev.biorxiv.api.data.Resource
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.client.request.get
import kotlinx.coroutines.runBlocking

class SearchRequestExecutor {
    /**
     * Execute request and return result as String
     */
    fun execute(): String {
        return runBlocking {
            HttpClient(Apache).use { it.get<String>("https://www.biorxiv.org/search/covid numresults:10 sort:publication-date direction:ascending") }
        }

    }

}

fun main() {
//    https://www.biorxiv.org/search/covid numresults:10 sort:publication-date direction:ascending
    print(SearchRequestExecutor().execute())
}
