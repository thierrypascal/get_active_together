<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'location.label', default: 'Location')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="container intro">
            <h1>
                Admin-Page
            </h1>
            <p>Hier finden sich alle Controller. Diese Seite soll später nicht für Nutzer zugänglich sein.</p>
        </div>


        <div class="container" id="controllers" role="navigation">
            <h2>Available Controllers:</h2>
            <ul class="admin">
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                    </li>
                </g:each>
                <br>
                <li><g:link class="create" controller="meetup" action="create">create Meetup</g:link></li>
                <li><g:link class="create" controller="location" action="create">create Location</g:link></li>
                <li><g:link class="create" controller="timeslot" action="create">create Timeslot</g:link></li>
                <li><g:link class="create" controller="person" action="create">create Person</g:link></li>
            </ul>
        </div>
    </body>
</html>