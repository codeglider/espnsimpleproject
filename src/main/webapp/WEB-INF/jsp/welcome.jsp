<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

    <head>
        <title>ESPN Project</title>

        <link rel="stylesheet" type="text/css" href="css/styles.css" title="Style">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

        <script src="js/sportsPlayerManager.js"></script>

    </head>

    <body>

        <div class="espnTitle">ESPN Project</div>

        <div class="espnForm">
            <form id="espnSubmissionForm" action="#">
                <input id="playerdId" type="hidden" name="id" />
                <div>
                    <label for="firstName">First Name</label><input name="firstName" type="text" />
                </div>
                <div>
                    <label for="lastName">Last Name</label><input name="lastName" type="text" />
                </div>
                <div>
                    <label for="sport">Sport</label><input name="sport" type="text" />
                </div>
                <div>
                    <label for="salary">Salary</label><input name="salary" type="text" />
                </div>
                <div>
                    <input class="espnSaveButton" type="submit" value="Save" />
                </div>
            </for>
        </div>

        <div class="playerListContainer">

            <ul id="playerDataList" class="playerList">
                <li class="listHeader">
                    <span>Id</span>
                    <span>First Name</span>
                    <span>Last Name</span>
                    <span>Sport</span>
                    <span>Salary</span>
                </li>
                <c:forEach var="player" items="${players}">
                <li class="playerData">
                    <span><c:out value="${player.id}"/></span>
                    <span><c:out value="${player.firstName}"/></span>
                    <span><c:out value="${player.lastName}"/></span>
                    <span><c:out value="${player.sport}"/></span>
                    <span>$<c:out value="${player.salary}"/></span>
                </li>
                </c:forEach>
            </ul>

        </div>

    </body>

</html>