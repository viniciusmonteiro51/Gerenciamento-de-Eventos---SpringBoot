package com.gerenciamento.eventos.models

import com.gerenciamento.eventos.constants.embedded.Agenda
import com.gerenciamento.eventos.constants.embedded.Patrocinador
import com.gerenciamento.eventos.constants.enums.EnumNivel
import com.gerenciamento.eventos.constants.enums.EnumRequisitos
import com.gerenciamento.eventos.constants.enums.EnumStatus
import com.gerenciamento.eventos.constants.enums.EnumTags
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

/**
eventos
|_ _id
|_ titulo
|_ descricao
|_ categoriaId → categorias._id
|_ localId → locais._id
|_ organizadorId → usuarios._id
|_ dataInicio
|_ dataFim
|_ capacidade
|_ vagasDisponiveis
|_ imagens
|_ agenda []
|_ titulo
|_ descricao
|_ horaInicio
|_ horaFim
|_ tipo ["PALESTRA", "WORKSHOP", "MESA_REDONDA", "NETWORKING", "APRESENTACAO_ARTISTICA", "DEMONSTRACAO_TECNICA", "OUTRO"]
|_ patrocinadores []
|_ nome
|_ logo
|_ site
|_ tipoPatrocinio ["OURO", "PRATA", "BRONZE", "EXCLUSIVO", "MEDIA_PARTNER", "OUTRO"]
|_ nivel ["INICIANTE", "INTERMEDIARIO", "AVANCADO", "GERAL"]
|_ requisitos ["MAIORIDADE", "INSCRICAO_ANTECIPADA", "APROVACAO_ORGANIZADOR", "EXPERIENCIA_PREVIA", "DOCUMENTO_IDENTIFICACAO", "OUTRO"]
|_ tags ["TECNOLOGIA", "EDUCAÇÃO", "ESPORTE", "NEGÓCIOS", "CULTURA", "ARTE", "REDES", "INOVAÇÃO"]
|_ status ["PLANEJAMENTO", "CONFIRMADO", "EM_ANDAMENTO", "PAUSADO", "CANCELADO", "ENCERRADO"]
*/

@Document(collection = "eventos")
data class Evento(
    @Id
    val id: String? = null,
    val titulo: String,
    val descricao: String,
    val categoriaId: String,
    val localId: String,
    val organizadorId: String,
    val dataInicio: LocalDateTime,
    val dataFim: LocalDateTime,
    val capacidade: String,
    val vagasDisponveis: Int,
    val imagens: List<String>,
    val agenda: List<Agenda>,
    val patrocinadores: List<Patrocinador>,
    val nivel: EnumNivel,
    val requisitos: List<EnumRequisitos>,
    val tags: EnumTags,
    val status: EnumStatus

)