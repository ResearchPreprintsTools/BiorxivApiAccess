package dev.biorxiv.api.data

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class ChannelLink(
        @JacksonXmlProperty(localName = "resource") val resource: String
)
