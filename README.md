# Rep_Emp_dbccompany 70% Concluído

Seletivo: dbcCompany de Porto alegre.

	- JSF
	- Primefaces
	- Hibernate
	- SGDB PostgresSQL
	- Servidor Tomcat 9
	- Maven

<p align="center">
  <img src="/dbccompany/printScreen/screen1.png" width="950"/>
</p>


OBJETIVOS DO SISTEMA: 

	Desenvolva um sistema para manter cadastros de clientes e seus limites de crédito. Desenvolva
	camada visual (front-end), um serviço para salvar o cadastro de clientes e outro para realizar o
	cálculo de juros. Fique à vontade para definir a arquitetura e o modelo de persistência. Crie
	testes unitários para garantir o bom funcionamento do código. Documente seu código e crie um
	arquivo Readme para orientar o avaliador como iniciar e testar a sua solução.

	Linguagem: Java
	Front-end: Livre
	Persistência: Livre
	FLUXO DE APLICAÇÃO
	Criar tela com a listagem dos clientes com botões para cadastrar, editar e excluir.
	Criar um formulário com os seguintes campos:

	- Nome Cliente | Tipo: texto
	- Limite de credito | Tipo: numérico (R$)
	- Risco | Tipo: combobox | Valores possíveis: A, B e C
	- Endereço | Tipo: 

	o Ao trabalhar com endereço, fique à vontade para definir se o
	endereço será do tipo String, um objeto do tipo endereço ou
	uma lista de objetos do tipo endereço (para permitir que o
	cliente possua mais de um endereço cadastrado).

	REGRAS DE NEGÓCIO

	Todas informações devem ser persistidas mais um campo indicando a
	taxa de juros.
	Todos campos são obrigatórios
	Se o risco for do tipo A manter os dados informados
	Se o risco for do tipo B, a taxa de juros deve ser de 10%
	Se o risco for do tipo C, a taxa de juros deve ser de 20%



FALTA CONCLUIR:

	- Injeçao de dependência
	- Inversão de controle com EJB
	- Validações no backEnd
	- Implementar padrões de projetos
	- Testes


OBSERVAÇÕES

	O sistema é bem simples, tive 24h para fazer mas acabei não concluindo devido a outros projeto, terminarei 		assim que possível para deixar como demostração.
