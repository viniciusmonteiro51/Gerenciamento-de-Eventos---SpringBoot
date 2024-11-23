package com.gerenciamento.eventos.models

import com.gerenciamento.eventos.constants.enums.EnumStatusInscricao
import com.gerenciamento.eventos.constants.enums.EnumTipoPagamento
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalTime

@Document(collection = "inscricoes")
data class Inscricao(
    @Id
    val id: String? = null,
    val eventoId: String,
    val usuarioId: String,
    val status: EnumStatusInscricao,
    val codigoInscricao: String,
    val validade: LocalTime,
    val tipoPagamento: EnumTipoPagamento
)