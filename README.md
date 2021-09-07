              HERANÇA E POLIMORFISMO <h1>

Este repositório contém exemplos resumidos de Herança e Polimorfismo em Java.


***********************************************************************************************

	Tudo que for dito aqui terá exemplos no projeto "Herança e Polimorfismo"

***********************************************************************************************
-------------------------------------Herança e Polimorfismo-----------------------------------

	Herança é uma associação que permite que uma classe herde todos dados e comportamentos  de outra classe, reutilizando assim os atributos de métodos.
	
		Sintaxe: classe A extends classe B
	
	As subclasses (classes que extendem outra classe) permitem o uso de classes com modificador de acesso "protected".
	
	
-------------------------------------UPCASTING-------------------------------------

	Upcasting é quando você associa uma subclasse à uma superclasse. 
	Uso comum: polimorfismo
-------------------------------------DOWNCASTING-------------------------------------

	Downcasting é quando você atribui um objeto da superclasse à uma subclasse. 	
	Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)
	
	
----------------------- Sobreposição, palavra super e anotação @Override ----------------------

	A sobreposição (ou sobrescrita) é a implementação de um método da superclasse na subclasse.
	É fortemente recomendável utilizar a anotação @Override na utilização de uma sobreposição, isso possibilida implementar a função e adicionar ou remover etapas

-----------------------------------------------------------------------------------------------
			Classes e metodos final

	Palavra chave: final

	A palavra final evita que classes sejam herdadas
		public final class SavingsAccount(){};

	E em métodos, a palavra final evita que o método seja sobreposto.
	

-----------------------------------------POLIMORFISMO------------------------------------------



	Em POO, polimorfismo é o recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo específico.
	

---------------------------------------CLASSES ABSTRATAS---------------------------------------

	Classes abstratas são superclasses que não podem ser instanciadas.

	Suas subclasses podem ser instanciadas, herdando todos os seus métodos, porém a super
	classe em si servirá apenas como um "modelo", não podendo ser instanciada.
	
	Benefícios:
			- Reuso de métodos e funções
			- Permite que tratemos de forma fácil todos os tipos de 
			subclasses herdadas, inclusive com polimorfismo. Como visto no Exercício
			de Fixação, podemos adicionar todos os tipos de contas (subclasse)
			em uma mesma coleção.



