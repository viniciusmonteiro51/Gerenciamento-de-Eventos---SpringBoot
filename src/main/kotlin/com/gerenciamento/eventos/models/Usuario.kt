package com.gerenciamento.eventos.models

import com.gerenciamento.eventos.constants.enums.EnumPapel
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
usuarios
|_ _id
|_ nome
|_ email
|_ papel [] ["ADMIN", "ORGANIZADOR", "PARTICIPANTE", "PATROCINADOR", "VOLUNTARIO", "PALESTRANTE", "MATERIAL_SUPORTE"]
|_ telefone
 */

@Document(collection = "usuarios")
data class Usuario(
    @Id
    val id: String? = null,
    val nome: String,
    val email: String,
    val papel: List<EnumPapel>,
    val telefone: String
)
