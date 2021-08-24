const apiDomain = "api.themoviedb.org";
const apiKey = "f7ed622bcceb4e2d6181497fd8c61f36";
var keyword;
var quantity = 4;

function loadMore() {
  quantity += 4;
  getTopRated();
  if (quantity == 20) {
    $(".container-carregar-mais .carregar-mais").remove();
  }
}

function movieDetails(movie_id) {
  let endpoint = `/3/movie/${movie_id}`;
  let params = `api_key=${apiKey}&language=pt-BR&append_to_response=videos,images`;

  let url = `https://${apiDomain}${endpoint}?${params}`;

  $.getJSON(url, (movie) => {
    var dateString;

    if (movie.release_date == "") {
      dateString = "Não disponível.";
    } else {
      let date = new Date(movie.release_date);
      dateString =
        date.getDate() + "/" + (date.getMonth() + 1) + "/" + date.getFullYear();
    }

    var imgUrl;
    if (movie.poster_path != null) {
      imgUrl = `https://image.tmdb.org/t/p/original${movie.poster_path}`;
    } else {
      imgUrl = "./assets/images/404.jpeg";
    }

    $("body").append(`
                        <div id="movie-details">
                            <div class="row" id="details-container">
                              <div class="col-12 col-xl-6">
                                <a href="https://www.themoviedb.org/movie/$%7Bmovie.id%7D" target="_blank">
                                  <img class="poster-img mx-auto d-block" src="${imgUrl}" alt="${
      movie.original_title
    }"> 
                                </a>  
                                </div>
                                
                                <div class="col-12 col-xl-6">  
                                  <h2>${movie.title}</h2>
                                    <p class="sinopse">
                                        <bold>Sinopse: </bold>${
                                          movie.overview == ""
                                            ? "Sinopse não disponível"
                                            : movie.overview
                                        }
                                    </p>
                                    <div class="direcao-filme">
                                        <text>
                                            <bold>Produção: </bold>${
                                              movie.production_companies == []
                                                ? movie.production_companies.map(
                                                    (companie) =>
                                                      companie.name + "\n"
                                                  )
                                                : "Não disponível."
                                            }
                                        </text> 
                                        <text>
                                            <bold>Estreia: </bold>${dateString}
                                        </text>
                                    </div>
                                    
                                    <p>
                                        <bold>Avaliação: </bold> ${
                                          movie.vote_average
                                        }
                                    
                                    <p>

                                    <div class="avaliacao_estrelas">
                                        <p>
                                            <bold>Avaliação: </bold>
                                        </p>
                                        <div class="estrelas">
                                            <img class="review-star ${
                                              movie.vote_average >= 1
                                                ? ""
                                                : "disable-star"
                                            }" src="assets/images/estrela.png" alt="Star" />
                                            <img class="review-star ${
                                              movie.vote_average >= 3
                                                ? ""
                                                : "disable-star"
                                            }" src="assets/images/estrela.png" alt="Star" />
                                            <img class="review-star ${
                                              movie.vote_average >= 5
                                                ? ""
                                                : "disable-star"
                                            }" src="assets/images/estrela.png" alt="Star" />
                                            <img class="review-star ${
                                              movie.vote_average >= 7
                                                ? ""
                                                : "disable-star"
                                            }" src="assets/images/estrela.png" alt="Star" />
                                            <img class="review-star ${
                                              movie.vote_average >= 9
                                                ? ""
                                                : "disable-star"
                                            }" src="assets/images/estrela.png" alt="Star" />
                                        </div>
                                    </div>

                                    <img id="close-icon" onclick="removeDetails()" src="./assets/images/close.png" alt="Fechar janela">
                                  </div>
                                <div>
                            </div>
                        `);
  });
}

function removeDetails() {
  $("#movie-details").remove();
}

function setKeywordSearch() {
  keyword = $("#input-search").val();
  localStorage.setItem("keyword-search", keyword);
}

function getSearchResults() {
  keyword = localStorage.getItem("keyword-search");

  $("#section-search div").append("<p></p>");

  $("#section-search div p").text(`Resultados para a busca: ${keyword}`).html();

  $("#section-search search-results").remove();
  let endpoint = `/3/search/movie`;
  let params = `api_key=${apiKey}&language=pt-BR&page=1&query=${keyword}&page=1&include_adult=false`;

  let url = `https://${apiDomain}${endpoint}?${params}}`;

  $.getJSON(url, (response) => {
    const movies = response.results;

    movies.forEach((movie, index) => {
      var imgUrl;
      if (movie.poster_path != null) {
        imgUrl = `https://image.tmdb.org/t/p/original${movie.poster_path}`;
      } else {
        imgUrl = "./assets/images/404.jpeg";
      }

      $("#section-search").append(`
                <div class="col-12 col-sm-6 col-lg-3 search-results">
                    <a href="#" onclick="movieDetails('${movie.id}')" type="button">
                        <img src="${imgUrl}" alt="${movie.original_title}">
                    </button>
                </div>
            `);
    });
  });
}

function getTopRated() {
  $("#section-destaques .destaque").remove();
  let endpoint = `/3/movie/top_rated`;
  let params = `api_key=${apiKey}&language=pt-BR&page=1`;

  let url = `https://${apiDomain}${endpoint}?${params}}`;

  $.getJSON(url, (response) => {
    const movies = response.results.slice(0, quantity);

    movies.forEach((movie, index) => {
      var imgUrl;
      if (movie.poster_path != null) {
        imgUrl = `https://image.tmdb.org/t/p/original${movie.poster_path}`;
      } else {
        imgUrl = "./assets/images/404.jpeg";
      }

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

function getPopular() {
  $("#section-destaques .populares").remove();
  let endpoint = `/3/movie/popular`;
  let params = `api_key=${apiKey}&language=pt-BR&page=1`;

  let url = `https://${apiDomain}${endpoint}?${params}}`;

  $.getJSON(url, (response) => {
    const movies = response.results.slice(0, 3);

    movies.forEach((movie, index) => {
      var imgUrl;

      if (movie.backdrop_path != null) {
        imgUrl = `https://image.tmdb.org/t/p/original${movie.backdrop_path}`;
      } else {
        imgUrl = "./assets/images/404.jpeg";
      }

      var dateString;

      if (movie.release_date == "") {
        dateString = "Não disponível.";
      } else {
        let date = new Date(movie.release_date);
        dateString =
          date.getDate() +
          "/" +
          (date.getMonth() + 1) +
          "/" +
          date.getFullYear();
      }
      console.log(movie);

      $("#carousel-popular .carousel-inner").append(`
          <div class="carousel-item ${index == 0 ? "active" : ""}">
              <section class="row" id="populares">
                  <div class="col-12 title-container">
                      <h1>Populares</h1>
                  </div>

                  <div class="col-12 col-xl-6">
                      <div class="banner_popular">
                          <img src="${imgUrl}"
                              title="Trailer Raya e o Último Dragão" allowfullscreen></iframe>
                      </div>
                  </div>

                  <div class="col-12 col-xl-6">
                      <h2>${movie.title}</h2>
                      <p class="sinopse">
                          <bold>Sinopse:</bold> ${
                            movie.overview == ""
                              ? "Sinopse não disponível"
                              : movie.overview
                          }
                      </p>
                      <div class="direcao-filme">
                          <text>
                              <bold>Produção: </bold>${
                                movie.production_companies == []
                                  ? movie.production_companies.map(
                                      (companie) => companie.name + "\n"
                                    )
                                  : "Não disponível."
                              }
                          </text>
                          <text>
                              <bold>Estreia: </bold>${dateString}
                          </text>
                      </div>

                      <div class="avaliacao_estrelas">
                          <p>
                              <bold>Avaliação: </bold>
                          </p>
                          <div class="estrelas">
                              <img class="review-star ${
                                movie.vote_average >= 1 ? "" : "disable-star"
                              }" src="assets/images/estrela.png" alt="Star" />
                              <img class="review-star ${
                                movie.vote_average >= 3 ? "" : "disable-star"
                              }" src="assets/images/estrela.png" alt="Star" />
                              <img class="review-star ${
                                movie.vote_average >= 5 ? "" : "disable-star"
                              }" src="assets/images/estrela.png" alt="Star" />
                              <img class="review-star ${
                                movie.vote_average >= 7 ? "" : "disable-star"
                              }" src="assets/images/estrela.png" alt="Star" />
                              <img class="review-star ${
                                movie.vote_average >= 9 ? "" : "disable-star"
                              }" src="assets/images/estrela.png" alt="Star" />
                          </div>
                      </div>
                  </div>
              </section>
          </div>
            `);
    });
  });
}

function renderDynamicElements() {
  getTopRated();
  getPopular();
}
