package dev.biorxiv.api.data

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class Image(
        @JacksonXmlProperty(localName = "link") val link: String,
        @JacksonXmlProperty(localName = "title") val title: String,
        @JacksonXmlProperty(localName = "url") val url: String?
)
