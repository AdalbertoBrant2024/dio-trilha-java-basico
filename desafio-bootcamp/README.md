# Projeto Bootcamp Java 🚀

Este projeto simula uma experiência de Bootcamp onde desenvolvedores (Devs) podem se inscrever em cursos e programas de mentoria. Inclui várias classes e métodos para criar e gerenciar bootcamps, cursos, mentorias e o progresso dos desenvolvedores.

## Pacotes e Classes 📦

### `desafio.bootcamp`
- **Main**: Esta classe contém o método principal onde a simulação da criação, inscrição e progressão do bootcamp é executada.

### `desafio.bootcamp.bootcamp`
- **Bootcamp**: Esta classe representa um bootcamp. Possui atributos como nome, descrição, data de início, data de término, desenvolvedores inscritos e conteúdos disponíveis (cursos e mentorias).

### `desafio.bootcamp.dev`
- **Dev**: Esta classe representa um desenvolvedor que pode se inscrever em bootcamps, progredir através do conteúdo e calcular seu total de XP.

### `desafio.bootcamp.dominio.conteudos`
- **Conteudo**: Esta classe abstrata representa conteúdo dentro de um bootcamp, como cursos e mentorias. Possui atributos como título e descrição, e um método abstrato para calcular XP.

### `desafio.bootcamp.dominio.cursos`
- **Curso**: Esta classe estende `Conteudo` e representa um curso dentro do bootcamp. Possui um atributo adicional para a duração do curso e um método para calcular XP com base nessa duração.

### `desafio.bootcamp.dominio.mentorias`
- **Mentoria**: Esta classe estende `Conteudo` e representa uma sessão de mentoria dentro do bootcamp. Possui um atributo adicional para a data da mentoria e um método para calcular XP.

## Fluxo de Simulação 🎮

1. **Criação de Curso e Mentoria**: 
   - Criar instâncias de `Curso` e `Mentoria`.
   - Definir seus títulos, descrições e outros atributos relevantes.

2. **Criação do Bootcamp**:
   - Criar uma instância de `Bootcamp`.
   - Definir seu nome e descrição.
   - Adicionar o `Curso` e a `Mentoria` criados à lista de conteúdos do bootcamp.

3. **Inscrição de Desenvolvedores**:
   - Criar instâncias de `Dev` representando diferentes desenvolvedores.
   - Inscrever esses desenvolvedores no bootcamp.

4. **Progressão e Cálculo de XP**:
   - Desenvolvedores progridem através do conteúdo do bootcamp.
   - Calcular e exibir o total de XP para cada desenvolvedor com base no conteúdo concluído.

## Métodos Principais 🔑

- **Classe Bootcamp**:
  - `getNome()`, `setNome()`
  - `getDescricao()`, `setDescricao()`
  - `getDataInicial()`, `setDataInicial()`
  - `getDevsInscritos()`, `setDevsInscritos()`
  - `getConteudos()`, `setConteudos()`

- **Classe Dev**:
  - `inscreverBootcamp(Bootcamp bootcamp)`
  - `progredir()`
  - `calcularTotalXp()`
  - `getNome()`, `setNome()`
  - `getConteudosInscritos()`, `setConteudosInscritos()`
  - `getConteudosConcluidos()`, `setConteudosConcluidos()`

- **Classe Conteudo**:
  - `calcularXp()`
  - `getTitulo()`, `setTitulo()`
  - `getDescricao()`, `setDescricao()`

- **Classe Curso**:
  - `getCargaHoraria()`, `setCargaHoraria()`

- **Classe Mentoria**:
  - `getData()`, `setData()`

## Como Executar ▶️

1. Clone o repositório.
2. Navegue até o diretório do projeto.
3. Compile os arquivos Java.
4. Execute a classe `Main` para simular a experiência do bootcamp.

## Contribuindo 🤝

1. Faça um fork do repositório.
2. Crie uma nova branch para sua funcionalidade ou correção de bug.
3. Faça suas alterações e comite-as.
4. Envie suas alterações para o seu fork.
5. Crie um pull request para o repositório principal.

## Licença 📜

Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.
