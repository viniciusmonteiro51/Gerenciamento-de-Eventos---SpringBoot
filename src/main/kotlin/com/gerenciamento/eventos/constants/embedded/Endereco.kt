package com.gerenciamento.eventos.constants.embedded

import com.gerenciamento.eventos.constants.enums.EnumEstado

data class Endereco(
    val rua: String,
    val numero: Int,
    val complemento: String,
    val cidade: String,
    val estado: List<EnumEstado>,
    val cep: String,
    val pais: String
)