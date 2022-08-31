package com.jibs.ceepws.repository

import com.jibs.ceepws.model.NoteModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


//repositório que vai ficar responsável em realizar todas as transações com a nossa classe NoteMoDEL
@Repository
interface NoteRepository : CrudRepository<NoteModel, Long>

//{
//    fun findByTitle(title: String): NoteModel
//}
