$(document).ready(function () {
    $("#movie-playback").on("play", function () {
       $("nav").slideUp(); 
    });
    
    $("#movie-playback").on("pause", function () {
       $("nav").slideDown(); 
    });
});

function goBack() {
    window.history.back();
}

