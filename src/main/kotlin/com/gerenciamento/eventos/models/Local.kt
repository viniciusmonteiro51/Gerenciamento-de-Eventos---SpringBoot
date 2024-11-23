package com.gerenciamento.eventos.models

import com.gerenciamento.eventos.constants.embedded.Endereco
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
locais
|_ _id
|_ nome
|_ endereco
|_ rua
|_ numero
|_ complemento
|_ cidade
|_ estado ["AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"]
|_ cep
|_ pais
|_ capacidade
|_ latitude
|_ longitude
|_ emailContato
|_ telefoneContato
|_ site
|_ descricao
|_ imagens []
 */

@Document(collection = "locais")
data class Local(
    @Id
    val id: String? = null,
    val nome: String,
    val endereco: Endereco,
    val capacidade: String,
    val latitude: String,
    val logintude: String,
    val emailContato: String,
    val telefoneContato: String,
    val site: String,
    val descricao: String,
    val imagens: List<String>
)