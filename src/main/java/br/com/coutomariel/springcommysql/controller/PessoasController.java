package br.com.coutomariel.springcommysql.controller;

import br.com.coutomariel.springcommysql.controller.dto.PessoaRs;
import br.com.coutomariel.springcommysql.model.Pessoa;
import br.com.coutomariel.springcommysql.repository.PessoasRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {

    private final PessoasRepository pessoasRepository;

    public PessoasController(PessoasRepository pessoasRepository) {
        this.pessoasRepository = pessoasRepository;
    }

    @GetMapping
    public List<PessoaRs> findAll(){
        var pessoas = pessoasRepository.findAll();
        return pessoas
                .stream()
                .map(PessoaRs::converter)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PessoaRs findById(@PathVariable Long id){
        var pessoa = pessoasRepository.getOne(id);
        return PessoaRs.converter(pessoa);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PessoaRs save(@RequestBody PessoaRs pessoaRs){
        var pessoa = new Pessoa();
        pessoa.setNome(pessoaRs.getNome());
        pessoa.setSobreNome(pessoaRs.getSobreNome());

        var pessoaSalva = pessoasRepository.save(pessoa);

        return PessoaRs.converter(pessoaSalva);
    }

}
