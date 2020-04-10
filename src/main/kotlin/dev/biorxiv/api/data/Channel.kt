package dev.biorxiv.api.data

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class Channel(
        @JacksonXmlProperty(localName = "image") val image: String,
        @JacksonXmlProperty(localName = "link") val link: String,
        @JacksonXmlProperty(localName = "description") val description: String,
        @JacksonXmlProperty(localName = "title") val title: String,
        @JacksonXmlProperty(localName = "items") val items: ChannelItem?
)
