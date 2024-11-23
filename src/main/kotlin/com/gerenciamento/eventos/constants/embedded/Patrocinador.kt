package com.gerenciamento.eventos.constants.embedded

import com.gerenciamento.eventos.constants.enums.EnumTipoPatrocinador

data class Patrocinador(
    val nome: String,
    val logo: String,
    val site: String,
    val tipoPatrocinio: EnumTipoPatrocinador
)