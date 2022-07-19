package com.jibs.ceepws.controller

import com.jibs.ceepws.model.NoteModel
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController //agora sera capaz de atender requisicoes
@RequestMapping("notes")//o endereco que ira atender
class NoteController {

    @GetMapping("todos")
    //@ResponseBody//sem isso leva um erro 500 por que o controller nao sabe lidar com esse dtipo de retorno
    fun list(): List<NoteModel> {
        return listOf(NoteModel("leitura", "livro de spring boot"),
            NoteModel("pesquisa", "ambiente com Docker"))

    }
    @PostMapping("todas")
    fun add(@RequestBody note: NoteModel): NoteModel{//esta recebendo a model via parametro,precisa indicar a origem e pra isso adiciona o @RequestBody
        return note
    }
}