<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'location.label', default: 'Location')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <a href="#list-location" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="container intro">
            <h1>
                Willkommen auf GetActiveTogether!
            </h1>
            <p>Hier kannst du aus einer Vielzahl von Standorten und Aktivitäten im Raum Basel-Landschaft auswählen und für Treffen mit anderen Sportlern einschreiben.</p>
        </div>

        <div class="nav" role="navigation">
            <ul>
                <li><a class="meetup" href="${createLink(uri: '/meetup/create')}">Meetup erstellen</a></li>
                <li><a class="list" href="${createLink(uri: '/person')}">Meine Meetups</a></li>
                <li><a class="person" href="${createLink(uri: '/person/create')}">Person hinzufügen</a></li>
            </ul>
        </div>
        <div id="list-location" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${locationList}" />

            <div class="pagination">
                <g:paginate total="${locationCount ?: 0}" />
            </div>
        </div>
    </body>
</html>