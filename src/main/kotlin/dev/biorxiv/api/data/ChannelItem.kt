package dev.biorxiv.api.data

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class ChannelItem(
        @JacksonXmlElementWrapper(useWrapping = false)
        @JacksonXmlProperty(localName = "image") val seq: List<ChannelLink>?
)
