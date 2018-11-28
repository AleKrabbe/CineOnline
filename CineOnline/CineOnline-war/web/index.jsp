<%-- 
    Document   : home
    Created on : 18/11/2018, 17:57:08
    Author     : palmeiira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<!DOCTYPE HTML>

<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <title>Cadastro de Usuários</title>
    </head>
    <body>
        <h1>Cadastro de Usuários</h1>

        <c:choose>
            <c:when test="${empty lista}">
                <p>- N&atilde;o h&aacute; usuários registrados </p>
            </c:when>
            <c:otherwise>

                <table>
                    <caption>Tabela com usuários cadastrados</caption>
                    <thead>
                        <tr>
                            <th>Nome</th>
                            <!--<th>Login</th>-->
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="movie" items="${lista}">
                            <tr>
                                <td><img src="${pageContext.request.contextPath}/media/poster/${movie.poster}"></td>
                                <!--<td>${user.rating} </td>-->
                            </tr>
                        </c:forEach>
                    </tbody>
                    <tfoot>
                        <tr>
                            <td colspan="2">Total de contatos: ${fn:length(lista)}</td>
                        </tr>
                    </tfoot>
                </table>

            </c:otherwise>
        </c:choose>

        <p>
            <a href="${pageContext.request.contextPath}/novo">Cadastrar novo Usuário</a>
            <a href="${pageContext.request.contextPath}/inicio">Voltar à página inicial</a>
        </p>
    </body>
</html>
