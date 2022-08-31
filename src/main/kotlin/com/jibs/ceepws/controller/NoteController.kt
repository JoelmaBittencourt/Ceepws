package com.jibs.ceepws.controller

import org.springframework.beans.factory.annotation.Autowired// o que 'e Iterable
import com.jibs.ceepws.model.NoteModel
import com.jibs.ceepws.repository.NoteRepository
import org.springframework.web.bind.annotation.*//quando usar?
//errando muito com chaves

@RestController //agora sera capaz de atender requisicoes
@RequestMapping("notes")//o endereco que ira atender, sem isso nao funciona, sera? sim da 404, not fond
class NoteController {

    @Autowired//indicamos que um objeto vai ser injetado é por meio da annotation
    lateinit var noteRepository: NoteRepository//Para lidarmos com esse tipo de situação na qual precisamos que nossas properties sejam inicializadas de forma atrasada, isto é, em algum outro momento, sem depender da instância do objeto por exemplo, o Kotlin nos fornece a incialização lateinit.

    // @GetMapping//devolver uma lista de notas
    //@ResponseBody//sem isso leva um erro 500 por que o controller nao sabe lidar com esse dtipo de retorno
    //  fun list(): List<NoteModel> {
    //  return listOf(NoteModel(1, "livro de spring boot", "", "", ""),
    //  NoteModel(1, "pesquisa", "ambiente com Docker", "", ""))


    @GetMapping
    fun list(): List<NoteModel?> {
        return noteRepository.findAll()
            .toList()//Como o findAll() devolve um Iterable, precisamos converter para uma lista, pois o retorno é uma lista de notas, por isso chamamos também a função toList().
    }

    //    @PostMapping
    // fun add(@RequestBody note: NoteModel) {//esta recebendo a model via parametro,precisa indicar a origem e pra isso adiciona o @RequestBody , sem  "status": 500,
    // "error": "Internal Server Error"
//        return note
//    }
    @PostMapping
    fun add(@RequestBody classenote: NoteModel): NoteModel {//A função save() devolve o próprio objeto que foi salvo na base de dados, a diferença é que ele é devolvido com o mesmo id que foi salvo no banco de dados.
        return noteRepository.save(classenote)
    }
}