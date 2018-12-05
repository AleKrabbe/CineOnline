<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="plugins/fontawesome/css/all.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/esquema.css"/>
        <link rel="stylesheet" type="text/css" href="css/cinema.css"/>

        <script src="plugins/fontawesome/js/all.js"></script>
        <title>CineOnline</title>
    </head>
    <body>
        <jsp:useBean id="movie" scope="session" type="model.entities.Movie" />

        <nav class="navbar navbar-dark bg-dark">
            <button onclick="goBack()" class="navbar-brand btn btn-dark">
                <i class="fas fa-arrow-alt-left"></i>
            </button>
            <h1 class="cinema-movie-title mx-auto">${movie.title}</h1>
        </nav>

        <div class="video-container">
            <video controls id="movie-playback">
                <source src="media/trailer/${movie.trailer}" type="video/mp4">
                Seu navegador não suporta a tag de vídeo do HTML 5.
            </video>
        </div>
                
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="js/cinema.js" type="text/javascript"></script>
    </body>
</html>
