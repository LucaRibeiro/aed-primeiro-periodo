const apiDomain = "api.themoviedb.org";
const apiKey = "f7ed622bcceb4e2d6181497fd8c61f36";
var quantity = 4;

function loadMore() {
  quantity += 4;
  getTopRated();
  if (quantity == 20) {
    $(".container-carregar-mais .carregar-mais").remove();
  }
}

function movieDetails(movie_id) {
  console.log(movie_id);
  let endpoint = `/3/movie/${movie_id}`;
  let params = `api_key=${apiKey}&language=pt-BR&append_to_response=videos,images`;

  let url = `https://${apiDomain}${endpoint}?${params}`;

  console.log(url);
  $.getJSON(url, (movie) => {
    console.log(movie);
    let date = new Date(movie.release_date);

    $("body").append(`
                        <div id="movie-details">
                            <div class="row" id="details-container">
                              <div class="col-12 col-xl-6">
                                  <img class="mx-auto d-block" src="https://image.tmdb.org/t/p/original${movie.poster_path}" alt="${movie.original_title}"> 
                                </div>
                                
                                <div class="col-12 col-xl-6">  
                                  <h2>${movie.title}</h2>
                                    <p class="sinopse">
                                        <bold>Sinopse: </bold>${movie.overview}
                                    </p>
                                    <div class="direcao-filme">
                                        <text>
                                            <bold>Produção: </bold>${movie.production_companies.map(
                                              (companie) => companie.name + "\n"
                                            )}
                                        </text> 
                                        <text>
                                            <bold>Estreia: </bold>${
                                              date.getDate() +
                                              "/" +
                                              (date.getMonth() + 1) +
                                              "/" +
                                              date.getFullYear()
                                            }
                                        </text>
                                    </div>
                                    
                                    <p>
                                        <bold>Avaliação: </bold> ${
                                          movie.vote_average
                                        }
                                    
                                    <p>
                                    <img id="close-icon" onclick="removeDetails()" src="./assets/images/close.png" alt="Fechar janela">
                                  </div>
                                <div>
                            </div>
                        `);
  });
}

function removeDetails(){
  $('#movie-details').remove()
}

function searchMovie() {}

function getTopRated() {
  $("#section-destaques .destaque").remove();
  let endpoint = `/3/movie/top_rated`;
  let params = `api_key=${apiKey}&language=pt-BR&page=1`;

  let url = `https://${apiDomain}${endpoint}?${params}}`;

  $.getJSON(url, (response) => {
    const movies = response.results.slice(0, quantity);

    movies.forEach((movie, index) => {
      const imgUrl = `https://image.tmdb.org/t/p/original${movie.poster_path}`;

      $("#section-destaques .container-carregar-mais").before(`
                <div class="col-12 col-sm-6 col-lg-3 destaque ${
                  index > quantity / 2 ? "destaque-para-esconder" : ""
                } ">
                    <a href="#" onclick="movieDetails('${
                      movie.id
                    }')" type="button">
                        <img src="${imgUrl}" alt="${movie.original_title}">
                    </button>
                </div>
            `);
    });
  });
}
