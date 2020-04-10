package dev.biorxiv.api.data

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class Item(
        @JacksonXmlElementWrapper(useWrapping = false)
        @JacksonXmlProperty(localName = "title") val title: List<String>,
        @JacksonXmlProperty(localName = "link") val link: String?,
        @JacksonXmlProperty(localName = "description") val description: String,
        @JacksonXmlProperty(localName = "creator") val creator: String,
        @JacksonXmlProperty(localName = "date") val date: String,
        @JacksonXmlProperty(localName = "identifier") val identifier: String,
        @JacksonXmlProperty(localName = "publisher") val publisher: String,
        @JacksonXmlProperty(localName = "publicationDate") val publicationDate: String,
        @JacksonXmlProperty(localName = "section") val section: String?
//        @JacksonXmlProperty(localName = "_rdf:about") val about: String
)
