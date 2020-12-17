<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'location.label', default: 'Location')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
        <script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>
        <script
                src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBNxQFOgOQArlgSgQYPnlDEGqWhEI3CUgA&callback=initMap&libraries=&v=weekly"
                defer
        ></script>
    </head>
    <body>
        <a href="#show-location" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
        <div class="nav" role="navigation">
            <ul>
                <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
            </ul>
        </div>
        <div id="show-location" class="content scaffold-show" role="main">
            <h1><g:message code="default.show.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <div class="row loc">
                <div class="col-8">
                    <f:display bean="location" />
                </div>
                <div class="col-4">
                    <div id="map"></div>
                </div>
            </div>
            <g:form resource="${this.location}" method="DELETE">
                <fieldset class="buttons">
                    <g:link class="edit" action="edit" resource="${this.location}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
                    <input class="delete" type="submit" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
                    <g:link class="create" controller="meetup" action="create">Meetup erstellen</g:link>
                </fieldset>
            </g:form>
        </div>
        <div id="list-meetup" class="content scaffold-list showMyMeetups" role="main">
            <h1>Auf dieser Location Meetups erstellt: </h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <f:table collection="${showAllPerson}" />

            <div class="pagination">
                <g:paginate total="${showAllPersonCount ?: 0}" />
            </div>
        </div>

    <script>
        "use strict";

        function initMap() {
            const myLatLng = {
                lat: ${this.location.latitude},
                lng: ${this.location.longitude}
            };
            const map = new google.maps.Map(document.getElementById("map"), {
                zoom: 15,
                center: myLatLng,
                fullscreenControl: false,
                zoomControl: false,
                streetViewControl: false,
                mapTypeId: 'hybrid'
            });
            new google.maps.Marker({
                position: myLatLng,
                map,
                title: "Hello World!"
            });
        }
    </script>
    </body>
</html>
