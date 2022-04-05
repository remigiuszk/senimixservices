function scrollToBottom() {
    window.scrollTo({top: document.scrollingElement.scrollHeight, behavior: 'smooth'})
}

var opened = false;

function toggleResponsiveness() {
    if (opened === false) {
        opened = true;
    } else {
        opened = false;
    }
    const x = document.getElementById("menuItems");
    const navbar = document.getElementById(("navbar"))
    const button = document.getElementById("hamburgerButton");
    const logo = document.getElementById("navbar-logo");
    button.classList.toggle('opened');
    button.setAttribute('aria-expanded', button.classList.contains('opened'));

    if (logo.className === "pure-img-logo") {
        logo.className += " responsive";
    } else {
        logo.className = "pure-img-logo"
    }

    if (navbar.className === "home-menu pure-menu pure-menu-horizontal pure-menu-fixed") {
        navbar.className += " responsive";
    } else {
        navbar.className = "home-menu pure-menu pure-menu-horizontal pure-menu-fixed"
    }

    if (x.className === "pure-menu-list") {
        x.className += "  responsive";
    } else {
        x.className = "pure-menu-list";
    }
    if (opened) {
        setTimeout(function() {toggleLinks(x)}, 250)
    } else {
        toggleLinks(x);
    }
}

function toggleLinks(x) {
    var items = x.getElementsByTagName("li");
    for (var i = 0; i < items.length; ++i) {
        var a = items[i].getElementsByTagName("a")[0];
        if (a != null) {
            if (a.className === "pure-menu-link") {
                a.className += " responsive";
            } else if (a.className === "pure-menu-link responsive") {
                a.className = "pure-menu-link";
            }
        }
    }
}
