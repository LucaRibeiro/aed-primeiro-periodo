<div class="description user_content enhanced">
    <table style="border-collapse: collapse; width: 100%" border="1">
      <tbody>
        <tr>
          <td
            style="
              width: 100%;
              background-color: #000000;
              text-align: left;
              padding: 10px 20px 10px 20px;
            "
          >
            <h1>
              <em
                ><strong
                  ><span style="color: #ffffff">Hands-On</span></strong
                ></em
              >
            </h1>
          </td>
        </tr>
        <tr>
          <td
            style="
              width: 100%;
              text-align: justify;
              padding: 10px 20px 40px 20px;
            "
          >
            <p>
              Esta é a tarefa <strong>HO04: Álgebra Relacional I</strong>, uma
              atividade prática que estimula o aluno a
              <strong
                >especificar e interpretar consultas em bancos de dados
                relacionais usando operações da álgebra relacional</strong
              >.
            </p>
          </td>
        </tr>
        <tr>
          <td
            style="
              width: 100%;
              background-color: #dcdcdc;
              text-align: left;
              padding: 0px 20px;
            "
          >
            <h2><strong>Problema</strong></h2>
          </td>
        </tr>
        <tr>
          <td
            style="
              width: 100%;
              text-align: justify;
              padding: 10px 20px 40px 20px;
            "
          >
            <p>
              Especificar as seguintes consultas em álgebra relacional para
              recuperar os dados em um banco de dados relacional, considerando o
              conjunto de dados (<em>dataset</em>) denominado
              <em>IMDB-sample disponível na </em
              ><a
                href="http://verde.icei.pucminas.br"
                class="external"
                target="_blank"
                rel="noreferrer noopener"
                ><span>calculadora RelaX</span
                ><span
                  aria-hidden="true"
                  class="ui-icon ui-icon-extlink ui-icon-inline"
                  title="Links para um site externo."
                ></span
                ><span class="screenreader-only"
                  >&nbsp;(Links para um site externo.)</span
                ></a
              >:
            </p>
            <ol>
              <li>
                Projetar o primeiro nome e o último nome dos atores de sexo
                feminino;
              </li>
                π first_name, last_name σ gender = 'F' (actors)
              <br>
              <li>Projetar o nome dos filmes com ano superior à 1999: π name σ year ≥ 2000 (movies)</li>
              <li>
                Projetar o nome do filme e o nome do diretor de cada filme: π  name, last_name (movies ⨝ id = movie_id (movies_directors ⨝ director_id = id directors)) 
              </li>
              <li>
                Projetar o nome do filme, nome do ator e o papel que cada ator
                teve no filme para filmes com ranking acima da nota 6: π name, first_name, last_name, role ( σ rank > 6 (actors ⨝ id = actor_id (movies ⨝ id = movie_id roles)))
              </li>
              <li>
                Projetar o nome do diretor e o número de filmes que cada diretor
                dirigiu: π first_name, last_name, movie_id (γ first_name, last_name; count(movie_id) -> movie_id (directors ⨝ id = director_id (movies ⨝ id = movie_id movies_directors)))
              </li>
              <li>
                Projetar o gênero e o número de filmes de cada gênero: π genre, movie_id (γ genre; count(movie_id) -> movie_id movies_genres)
              </li>
              <li>
                Projetar o gênero, o ranking (nota) médio, mínimo e máximo dos
                filmes do gênero: π genre, collum_media, collum_maximo, collum_minimo(γ genre; avg(rank) -> collum_media, max(rank) -> collum_maximo, min(rank) -> collum_minimo (movies_genres⨝ id = id (movies)))
              </li>
            </ol>
          </td>
        </tr>
        <tr>
          <td
            style="
              width: 100%;
              background-color: #dcdcdc;
              text-align: left;
              padding: 0px 20px;
            "
          >
            <h2><strong>Produto</strong></h2>
          </td>
        </tr>
        <tr>
          <td
            style="
              width: 100%;
              text-align: justify;
              padding: 10px 20px 40px 20px;
            "
          >
            O aluno deve entregar um texto contendo a solução para o problema
            descrito anteriormente.
          </td>
        </tr>
        <tr>
          <td
            style="
              width: 100%;
              background-color: #dcdcdc;
              text-align: left;
              padding: 0px 20px;
            "
          >
            <h2><strong>Recursos</strong></h2>
          </td>
        </tr>
        <tr>
          <td
            style="
              width: 100%;
              text-align: justify;
              padding: 10px 20px 40px 20px;
            "
          >
            <p>
              Para a execução da tarefa o aluno deve consultar as referências
              bibliográficas especificadas no
              <a
                title="Programa"
                href="/courses/82606/pages/programa"
                data-api-endpoint="https://pucminas.instructure.com/api/v1/courses/82606/pages/programa"
                data-api-returntype="Page"
                >Programa do Curso</a
              >. A seguir encontram-se indicados alguns recursos e materiais de
              apoio para a execução da tarefa. Outras referências bibliográficas
              podem ser utilizadas, desde que devidamente citadas no produto.
            </p>
            <ul>
              <li>
                Livro (Elmasri &amp; Navathe, 2016):
                <ul>
                  <li>Capítulo 8: Álgebra Cálculo Relacional</li>
                </ul>
              </li>
              <li>
                Slides e Videos:
                <ul>
                  <li>
                    <a
                      title="Tópico #07: Álgebra Relacional I"
                      href="/courses/82606/pages/topico-number-07-algebra-relacional-i"
                      data-api-endpoint="https://pucminas.instructure.com/api/v1/courses/82606/pages/topico-number-07-algebra-relacional-i"
                      data-api-returntype="Page"
                      >Tópico #07: Álgebra Relacional I</a
                    >&nbsp;
                  </li>
                </ul>
              </li>
            </ul>
          </td>
        </tr>
      </tbody>
    </table>
    <p>&nbsp;</p>
  </div>

  <div style="display: none">
    <span class="timestamp">1630663200</span>
    <span class="due_date_string">09/03/2021</span>
    <span class="due_time_string">07:00am</span>
  </div>
</div>
