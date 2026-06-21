java -jar lib/junit-platform-console-standalone-1.10.2.jar -cp /tmp/pratica-final-junit --select-class MyStackTest

Aqui vai a explicação de cada teste:

shouldBeEmptyWhenNewStackIsCreated
Cria uma pilha nova e verifica que isEmpty() retorna true. Garante o estado inicial correto, antes de qualquer operação.

shouldNotBeEmptyAfterPush
Empilha um item e verifica que isEmpty() agora retorna false. Confirma que push() está de fato adicionando o elemento.

shouldPopItemsInLifoOrder
Empilha "a", "b", "c" (nessa ordem) e verifica que pop() retorna na ordem inversa: "c", depois "b", depois "a". Esse é o teste mais importante — confirma o comportamento fundamental de uma pilha (Last In, First Out).

shouldBeEmptyAfterPoppingAllItems
Empilha um item, desempilha ele, e verifica que a pilha volta a ficar vazia (isEmpty() == true). Garante que pop() realmente remove o elemento da estrutura, não só retorna ele.

shouldReturnNullWhenPoppingEmptyStack
Chama pop() numa pilha recém-criada (sem nenhum push) e verifica que retorna null. Testa o caso de borda: o que acontece quando você tenta desempilhar de uma pilha vazia.

shouldPeekTopItemWithoutRemovingIt
Empilha "a" e "b", chama peek() e verifica que retorna "b" (o topo). Depois confirma que a pilha continua não-vazia e que um pop() posterior ainda retorna "b" — ou seja, prova que peek() só consulta, sem remover.

shouldReturnNullWhenPeekingEmptyStack
Mesma ideia do teste de pop() em pilha vazia, mas para peek(). Garante consistência entre os dois métodos nesse caso de borda.

shouldMaintainLifoOrderWithInterleavedOperations
Testa uma sequência misturada de push/pop (não só "empilha tudo, depois desempilha tudo"), simulando um uso mais realista: empilha, desempilha, empilha de novo, desempilha de novo. Verifica se a ordem LIFO se mantém correta mesmo intercalando as operações.

shouldCreateAmbiguityWhenPushingNullValue
Esse é o teste que documenta o bug/limitação que identifiquei antes: ao empilhar null, tanto peek() quanto pop() retornam null — exatamente o mesmo valor que seria retornado se a pilha estivesse vazia. O teste passa (porque é o comportamento atual da classe), mas serve como registro de que essa ambiguidade existe e seria um ponto a corrigir.