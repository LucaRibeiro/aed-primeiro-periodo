<div class="description user_content enhanced">
   <table style="border-collapse: collapse; width: 100%;" border="1">
      <tbody>
         <tr>
            <td style="width: 100%; background-color: #000000; text-align: left; padding: 10px 20px 10px 20px;">
               <h1><em><strong><span style="color: #ffffff;">Hands-On</span></strong></em></h1>
            </td>
         </tr>
         <tr>
            <td style="width: 100%; text-align: justify; padding: 10px 20px 40px 20px;">
               <p>Esta é a tarefa <strong>HO05: Álgebra Relacional II</strong>, uma atividade prática que estimula o aluno a <strong>especificar e interpretar consultas em bancos de dados relacionais usando operações da álgebra relacional</strong>.</p>
            </td>
         </tr>
         <tr>
            <td style="width: 100%; text-align: left; padding: 0px 20px;">
               <h2><strong>Problema</strong></h2>
            </td>
         </tr>
         <tr>
            <td style="width: 100%; text-align: justify; padding: 10px 20px 40px 20px;">
               <p>Especificar as seguintes consultas em álgebra relacional para recuperar os dados em um banco de dados relacional, considerando o conjunto de dados (<em>dataset</em>) denominado <em>IMDB-sample disponível na </em><a href="http://verde.icei.pucminas.br" class="external" target="_blank" rel="noreferrer noopener"><span>calculadora RelaX</span><span aria-hidden="true" class="ui-icon ui-icon-extlink ui-icon-inline" title="Links para um site externo."></span><span class="screenreader-only">&nbsp;(Links para um site externo.)</span></a>:</p>
               <ol>
                  <li>Projetar o primeiro nome e o último nome dos atores que são diretores;</li>
                  <li>Projetar o primeiro nome e o último nome dos atores que não são diretores;</li>
                  <li>Projetar o primeiro nome e o último nome dos atores e diretores;</li>
                  <li>Projetar o nome dos filmes que não são dirigidos por nenhum diretor;</li>
                  <li>Projetar primeiro nome e o último nome dos atores que não atuaram em pelo menos dois filmes;</li>
                  <li>Projetar, por gênero e ano, o número médio de filmes com menos de dois atores atuando.</li>
               </ol>
            </td>
         </tr>
         <tr>
            <td style="width: 100%; text-align: left; padding: 0px 20px;">
               <h2><strong>Produto</strong></h2>
            </td>
         </tr>
         <tr>
            <td style="width: 100%; text-align: justify; padding: 10px 20px 40px 20px;">
               <ol>
                  <li>π concat(first_name,' ',last_name) -> full_name ((π first_name,last_name (actors)) ∩ (π first_name,last_name (directors)))</li>
                  <li>π concat(first_name,' ',last_name) -> full_name ((π first_name,last_name (actors)) - (π first_name,last_name (directors)))</li>
                  <li>π concat(first_name,' ',last_name) -> full_name ((π first_name,last_name (actors)) ∪ (π first_name,last_name (directors)))</li>
                  <li>π name (movies) - (π name (directors ⨝ id = director_id (movies ⨝ id = movie_id movies_directors)))</li>
                  <li>π first_name, last_name, movie_count (γ first_name, last_name; count(movie_id) -> movie_count (movies ⨝ id = movie_id (actors ⨝ id = actor_id roles)))</li>
                  <li>π year, genre, average_movies (γ year, genre;avg(movie_id) -> average_movies (movies ⨝ id = movie_id movies_genres))</li>
               </ol>
            </td>
         </tr>
         <tr>
            <td style="width: 100%; text-align: left; padding: 0px 20px;">
               <h2><strong>Recursos</strong></h2>
            </td>
         </tr>
         <tr>
            <td style="width: 100%; text-align: justify; padding: 10px 20px 40px 20px;">
               <p>Para a execução da tarefa o aluno deve consultar as referências bibliográficas especificadas no <a title="Programa" href="/courses/82606/pages/programa" data-api-endpoint="https://pucminas.instructure.com/api/v1/courses/82606/pages/programa" data-api-returntype="Page">Programa do Curso</a>. A seguir encontram-se indicados alguns recursos e materiais de apoio para a execução da tarefa. Outras referências bibliográficas podem ser utilizadas, desde que devidamente citadas no produto.</p>
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
                        <li><a title="Tópico #07: Álgebra Relacional I" href="/courses/82606/pages/topico-number-07-algebra-relacional-i" data-api-endpoint="https://pucminas.instructure.com/api/v1/courses/82606/pages/topico-number-07-algebra-relacional-i" data-api-returntype="Page">Tópico #07: Álgebra Relacional I</a>&nbsp;</li>
                        <li><a title="Tópico #08: Álgebra Relacional II" href="/courses/82606/pages/topico-number-08-algebra-relacional-ii" data-api-endpoint="https://pucminas.instructure.com/api/v1/courses/82606/pages/topico-number-08-algebra-relacional-ii" data-api-returntype="Page">Tópico #08: Álgebra Relacional II</a>&nbsp;</li>
                     </ul>
                  </li>
               </ul>
            </td>
         </tr>
      </tbody>
   </table>
   <p>&nbsp;</p>
</div>