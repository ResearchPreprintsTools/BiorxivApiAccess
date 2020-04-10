package dev.biorxiv.api.data

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class Resource(
        @JacksonXmlProperty(localName = "channel") val channel: Channel,
        @JacksonXmlProperty(localName = "image") val image: Image,
        @JacksonXmlElementWrapper(useWrapping = false)
        @JacksonXmlProperty(localName = "item")
        val item: List<Item>
)
