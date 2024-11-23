package com.gerenciamento.eventos.constants.embedded

import com.gerenciamento.eventos.constants.enums.*
import java.time.LocalTime

data class Agenda(
    val titulo: String,
    val descricao: String,
    val horaInicio: LocalTime,
    val horaFIm: LocalTime,
    val tipo: EnumTipoEvento
)