package com.jibs.ceepws.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class NoteModel(
    @Id @GeneratedValue
    @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
    val id: Long =0L,
    val title: String = "",
    val description: String="",
    val text: String?= "",
    val selfie: String=""
)
//{
//    constructor(): this("","")
//}