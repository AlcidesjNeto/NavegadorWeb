# NavegadorWeb
classroom exercise
Você foi chamado para uma entrevista de emprego na Mozilla Foundation, e o seu teste consiste
na implementação dos botões de avançar e voltar do navegador. Eles possuem o seguinte
comportamento:
(a) Ao iniciar o navegador nenhuma pilha existe, os botões de retorno e avanço estarão desativados. O crescimento da pilha é automático.
(b) Ao digitar o primeiro endereço, o navegador adiciona a página inicial à pilha do voltar e
ativa este botão.
(c) Ao voltar, o topo desta pilha será enviado para a pilha de avançar e ativa este botão,
desativando o anterior, caso a pilha esteja vazia.
(d) Ao avançar, o topo desta pilha será enviado para a pilha do voltar e, o botão será desativado, caso, a pilha esteja vazia.
(e) As pilhas vazias devem ser eliminadas
