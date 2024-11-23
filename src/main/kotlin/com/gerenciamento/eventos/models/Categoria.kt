package com.gerenciamento.eventos.models

import com.gerenciamento.eventos.constants.enums.EnumNome
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
categorias
|_ _id
|_ nome ["TECNOLOGIA", "NEGÓCIOS", "ENTRETENIMENTO", "ESPORTE", "ARTE", "EDUCAÇÃO", "SAÚDE", "MEIO_AMBIENTE", "POLÍTICA", "CIÊNCIA"]
|_ descricao
*/

@Document(collection = "categorias")
data class Categoria(
    @Id
    val id: String? = null,
    val nome: EnumNome,
    val descricao: String
)