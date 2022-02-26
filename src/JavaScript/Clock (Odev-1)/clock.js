let username = prompt("Lütfen isminizi Giriniz: ");

let nameText = document.querySelector("#myName")
nameText.innerHTML = username

function showTime() {

    let date = new Date()
    let hour = date.getHours()
    let minute = date.getMinutes()
    let seconds = date.getSeconds()

    hour = hour < 10 ? "0"+hour : hour
    minute = minute < 10 ? "0"+minute : minute
    seconds = seconds < 10 ? "0"+seconds : seconds
    
    document.querySelector("#myClock").innerHTML = hour + ":" + minute + ":" + seconds

    setInterval('showTime()', 1000)
}

showTime()


