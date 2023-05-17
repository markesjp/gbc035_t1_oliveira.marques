# Ex01 
Crie uma classe funcionário, com os campos CPF, Nome e Salário. Faça todos os métodos esperados para tratar desses atributos.

Adicionalmente

- Acrescente um novo atributo privado em Funcionário que armazene o teto salarial. Por padrão, todos os objetos da classe Funcionário são inicializados com o teto de R$ 40 mil. Permita ao usuário da classe atribuir e consultar os valores desse novo atributo. 

- Crie um método para aumentar o salário, passando como parâmetro um valor porcentual.
- Note que o método pode gerar valores inválidos. É possível que o salário fique negativo ou que atinja um valor acima do teto. Não deixe que isso ocorra. Para retornar o erro, crie uma classe de exceção baseada na classe IllegalStateException (essa classe herda RuntimeException). 

- Caso o erro seja de valor negativo, mostrar a mensagem "Valor inválido de salário";

- Caso o erro seja de valor maior que o teto, mostrar a mensagem "Valor ultrapassa o teto";

- Na classe principal inclua um código que faz chama um dos métodos que pode acionar a exceção criada e nesse caso mostre na tela a mensagem do erro emitida pela exceção.

- Independentemente de a exceção ser ou não acionada, mostrar ao final da chamada do método qual o valor do salário atual

# Ex02
 
- Qual a diferença entre o throw e throws ? Justifique explicado o que cada comando faz
A diferença entre "throws" e "throw" é que "throws" é uma declaração que indica que um método pode lançar uma exceção específica e delega a responsabilidade de lidar com a exceção ao método chamador ou ao manipulador de exceções, enquanto "throw" é uma instrução que faz o lançamento de uma exceção específica em um ponto específico do código. Em resumo, "throws" declara uma possível exceção que um método pode lançar, enquanto "throw" é usado para realmente lançar uma exceção em um ponto específico do código.

- Indique a diferença entre checked e uncheked exceptions
 As exceções checked são verificadas pelo compilador em tempo de compilação e exigem que o código que chama um método que pode lançar essa exceção manipule-a. Exemplos incluem IOException e SQLException. Já as exceções unchecked não são verificadas pelo compilador em tempo de compilação e geralmente ocorrem devido a erros de lógica do programador ou problemas imprevisíveis, como falta de memória. Exemplos incluem NullPointerException e ArrayIndexOutOfBoundsException. O código que chama um método que pode lançar uma exceção unchecked não é exigido pelo compilador a manipulá-la, mas ainda é possível fazê-lo.