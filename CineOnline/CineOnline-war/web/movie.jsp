<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="plugins/fontawesome/css/all.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/esquema.css"/>
        <link rel="stylesheet" type="text/css" href="css/movie.css"/>

        <script src="plugins/fontawesome/js/all.js"></script>
        <title>CineOnline</title>
    </head>
    <body>
        <jsp:useBean id="movie" scope="session" type="model.entities.Movie" />
        <%@include file="includes/nav.jsp" %>
        <div class="video-wrapper">
            <video autoplay="true" muted="true" loop="true" id="trailer">
                <source src="media/trailer/${movie.trailer}" type="video/mp4">
                Seu navegador não suporta a tag de vídeo do HTML 5.
            </video>
        </div>

        <div class="container movie-info-container">
            <div class="row">
                <div class="col-md-auto">
                    <img class="image movie-details-poster" src="media/poster/${movie.poster}" data-holder-rendered="true">
                </div>
                <div class="col-8 movie-details-container">
                    <h1>${movie.title}</h1>
                    <p>${movie.sinopsys}</p>
                    <hr>
                    <p><strong> Elenco: </strong>Henry Cavill, Ben Affleck, Gal Gadot.</p>
                    <p><strong> Direção: </strong>Zack Snyder.</p>                    
                    <p><strong> Lançamento: </strong>${movie.releaseDate}</p>
                    <p><strong> Duração: </strong>${movie.duration} min</p>
                    <p><strong> Avaliação: </strong>${movie.rating} <i class="fas fa-star"></i></p>
                    <div class="container my-0">
                        <div class="row float-right movie-play-btn">
                            <a href="#" class="btn btn-warning">Trailer  <i class="fas fa-film ml-1"></i></a>
                            <a href="cinema?id=${movie.id}" class="btn btn-success ml-2">Assistir  <i class="fas fa-video ml-1"></i></a>                            
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script type="text/javascript">
            document.getElementById("trailer").addEventListener("loadedmetadata", function () {
                this.currentTime = 25;
            }, false);
        </script>
    </body>
</html>
