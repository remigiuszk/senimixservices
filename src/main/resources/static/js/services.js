function scrollToBottom() {
    window.scrollTo({top: document.scrollingElement.scrollHeight, behavior: 'smooth'})
    document.getElementById("service").selectedIndex = 0;
}

function choosePlan(id) {
    scrollToBottom();
    document.getElementById("service").selectedIndex = id;
}