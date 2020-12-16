<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" role="navigation">
    <a class="navbar-brand" href="/#"><strong>GetActiveTogether</strong></a>

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarContent">
        <ul class="navbar-nav">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="drpList" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Listen</a>
                <div class="dropdown-menu" aria-labelledby="drpList">
                    <g:link class="dropdown-item" controller="person" action="index">Personen</g:link>
                    <g:link class="dropdown-item" controller="timeslot" action="index">Timeslots</g:link>
                    <g:link class="dropdown-item" controller="location" action="index">Locations</g:link>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" id="drpCreate" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Erstellen</a>
                <div class="dropdown-menu" aria-labelledby="drpCreate">
                    <g:link class="dropdown-item" controller="person" action="create">Personen</g:link>
                    <g:link class="dropdown-item" controller="location" action="create">Locations</g:link>
                    <g:link class="dropdown-item" controller="meetup" action="create">Meetups</g:link>
                </div>
            </li>
        </ul>
    </div>
</nav>

<g:layoutBody/>

<footer>
    <div>
        <a href="../meetup/admin">Admin-Page</a>
    </div>
</footer>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
