package controllers;

import entities.Pessoa;

public class PessoaController {
	
	public void cadastrarPessoa() {
		
		try {
			
			// construtor para receber a instancia da interface
			public PessoaController(IPessoaRepository pessoaRepository) {
				this.pessoaRepository = pessoalRepository;
				
				//criando uma instancia da classe Profissional
				Pessoa pessoa = new Pessoa();
				
				pessoa.setIdProfissional(PessoaInput.lerIdPessoa());
				pessoa.setNome(PessoaInput.lerNome());
				pessoa.setCpf(PessoaInput.lerCpf());
				pessoa.setEmail(PessoaInput.lerEmail());
				
				pessoaRepository.exportarDados(pessoa);
				
				
			}


		}
		catch(Exception e) {
			
		}
	}

}


