<h2><p align="center"> Cadastro de Clientes </p></h2>

	- JSF
	- Primefaces
	- Hibernate
	- SGDB PostgresSQL
	- Servidor Tomcat 9
	- Maven

<p align="center"> <img src="/CadastroClientes/printScreen/screen1.png" width="950"/></p>


OBJETIVOS DO SISTEMA: 

	Sistema para manter cadastros de clientes e seus limites de crédito. camada visual(front-end), um serviço para salvar o cadastro de clientes e outro para realizar o cálculo de juros. Criar testes unitários para garantir o bom funcionamento do código. Documentar o código e criar um 	arquivo "Manual" para orientar o analista e usuário para como iniciar e testar a sua solução.


	FLUXO DE APLICAÇÃO

	Criar tela com a listagem dos clientes com botões para cadastrar, editar e excluir.
	Criar um formulário com os seguintes campos:

	- Nome Cliente | Tipo: texto
	- Limite de credito | Tipo: numérico (R$)
	- Risco | Tipo: combobox | Valores possíveis: A, B e C
	- Endereço | Tipo: 


	REGRAS DE NEGÓCIO

	Todas informações devem ser persistidas mais um campo indicando a taxa de juros.
	Todos campos são obrigatórios
	Se o risco for do tipo A manter os dados informados
	Se o risco for do tipo B, a taxa de juros deve ser de 10%
	Se o risco for do tipo C, a taxa de juros deve ser de 20%


FALTA CONCLUIR:

	- Injeçao de dependência
	- Validações no backEnd
	- Implementar padrões de projetos
	- Testes unitários
	- Melhorias do FrontEnd


OBSERVAÇÕES

	Projeto em desenvolvimento.
	Baixa prioridade
	Previsão Indefinida.
