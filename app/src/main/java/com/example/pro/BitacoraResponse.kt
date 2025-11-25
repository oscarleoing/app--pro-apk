package com.example.pro

import com.google.gson.annotations.SerializedName

data class BitacoraApiResponse(
    @SerializedName("success") val success: Boolean?,
    @SerializedName("total") val total: Int?,
    @SerializedName("filtros") val filtros: Filtros?,
    @SerializedName("data") val data: List<BitacoraResponse>?
)

data class Filtros(
    @SerializedName("telefono") val telefono: String?,
    @SerializedName("nombreCompleto") val nombreCompleto: String?
)

data class BitacoraResponse(

    @SerializedName("folio") val folio: String?,
    @SerializedName("nombre") val nombre: String?,
    @SerializedName("peticion") val peticion: String?,
    @SerializedName("fechaPeticion") val fechaPeticion: String?,
    @SerializedName("staPeticion") val staPeticion: String?,
    @SerializedName("staRes") val staRes: String?,
    @SerializedName("telefono") val telefono: String?,
    @SerializedName("obsPet") val obsPet: String?,
    @SerializedName("obsResp") val obsResp: String?,

    // 🔹 Nuevos campos agregados según tu JSON
    @SerializedName("nombreCompleto") val nombreCompleto: String?,
    @SerializedName("aPaterno") val aPaterno: String?,
    @SerializedName("aMaterno") val aMaterno: String?,
    @SerializedName("folioGuia") val folioGuia: String?,
    @SerializedName("idConversacion") val idConversacion: String?,
    @SerializedName("direccionCompleta") val direccionCompleta: String?,
    @SerializedName("cveCalle") val cveCalle: String?,
    @SerializedName("desCalle") val desCalle: String?,
    @SerializedName("cveFrac") val cveFrac: String?,
    @SerializedName("desFrac") val desFrac: String?,
    @SerializedName("numExt") val numExt: String?,
    @SerializedName("numInt") val numInt: String?
)
