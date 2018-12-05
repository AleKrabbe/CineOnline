$(document).ready(function () {

    $("#error-container").hide();

    $("#searchInput").on("keyup", function () {
        var movies = $(".movie-card");
        var count = 0;

        for (var i = 0; i < movies.length; i++) {
            var resultTitle = fuzzy_match(movies[i].childNodes[1].childNodes[5].childNodes[1].innerText, $(this).val());
            if (resultTitle != '') {
                movies[i].childNodes[1].childNodes[5].childNodes[1].innerHTML = resultTitle;
                movies[i].style.display = "block";
                count += 1;
            } else {
                movies[i].style.display = "none";
            }
        }

        if (count == 0) {
            $("#error-container").show();
        } else {
            $("#error-container").hide();
        }

    });

    function fuzzy_match(text, search)
    {
        /*
         Parameter text is a title, search is the user's search
         */
        // remove spaces, lower case the search so the search
        // is case insensitive
        var search = search.replace(/\ /g, '').toLowerCase();
        var tokens = [];
        var search_position = 0;

        // Go through each character in the text
        for (var n = 0; n < text.length; n++)
        {
            var text_char = text[n];
            // if we match a character in the search, highlight it
            if (search_position < search.length &&
                    text_char.toLowerCase() == search[search_position])
            {
                text_char = '<strong>' + text_char + '</strong>';
                search_position += 1;
            }
            tokens.push(text_char);
        }
        // If are characters remaining in the search text,
        // return an empty string to indicate no match
        if (search_position != search.length)
        {
            return '';
        }
        return tokens.join('');
        ;
    }
});


