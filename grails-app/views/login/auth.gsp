<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Anmeldung</title>
</head>

<body>
<div id="login">
    <div class="linner">
        <form class="lform" action="${postUrl ?: '/login/authenticate'}" method="POST" id="loginForm" autocomplete="off">
            <span class="ltitle">
                GetActiveTogether
            </span>
            <span class="limg">
                <g:img dir="images" file="logo.png"/>
            </span>
            <div type="text" class="text_" autocapitalize="none">
                <label class="focus-linput" for="username"><g:message code='springSecurity.login.username.label'/>:</label>
                <input class="linput" type="text" name="${usernameParameter ?: 'username'}" id="username">
            </div>
            <div type="password" class="text_" name="password">
                <span class="btn-show-pass">
                    <i id="passwordToggler" title="toggle password display" onclick="passwordDisplayToggle()">👁</i>
                </span>
                <label class="focus-linput" for="password"><g:message code='springSecurity.login.password.label'/>:</label>
                <input class="linput" type="password" name="${passwordParameter ?: 'password'}" id="password">
            </div>
            <p id="remember_me_holder">
                <input type="checkbox" class="chk" name="${rememberMeParameter ?: 'remember-me'}" id="remember_me">
                <label for="remember_me"><g:message code='springSecurity.login.remember.me.label'/></label>
            </p>
            <p id="loginBtn">
                <input class="loginBtn" type="submit" id="submit" value="${message(code: 'springSecurity.login.button')}">
            </p>
        </form>
    </div>
</div>

<script type="text/javascript">

    function passwordDisplayToggle() {
        var toggleEl = document.getElementById("passwordToggler");
        var eyeIcon = '\u{1F441}';
        var xIcon = '\u{2715}';
        var passEl = document.getElementById("password");

        if (passEl.type === "password") {
            toggleEl.innerHTML = xIcon;
            passEl.type = "text";
        } else {
            toggleEl.innerHTML = eyeIcon;
            passEl.type = "password";
        }
    }
</script>

</body>
</html>
