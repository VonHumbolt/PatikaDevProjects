const isEmpty = (str) => !str || !str.trim();

let taskList = []

let liItems = document.querySelectorAll("#list>li")
let tab = []
let liIndex;

function createElementForUl(txtMessage) {
    let ul = document.querySelector("#list")
    let li = document.createElement("li")
    li.classList.add("listItemLi1", "list-group-item", "d-flex", "justify-content-between", "align-items-center");
    li.innerHTML = `
        <div><i class="checkMark fas fa-check"></i><span style="margin-left: 20px;">${txtMessage}</span></div>
        <button type="button" onclick="deleteElement()" class="btn-close closeButton " aria-label="Close">
    `;
    ul.appendChild(li)
    liItems = document.querySelectorAll("#list>li")
    tab.push(txtMessage)
    
}

function openingPage() {
    let tasks = JSON.parse(localStorage.getItem("tasks"))

    for (let i = 0; i<liItems.length; i++) {
        tab.push(liItems[i].innerHTML);
    }
    
    for(let i=0; i<tasks.length; i++){
        createElementForUl(tasks[i])
        tab.push(tasks[i])
    }
    
}

let newElement = () => {
    let value = document.querySelector("#task").value
    
    if (!isEmpty(value)) {
        createElementForUl(value);

        taskList.push(value)
        localStorage.setItem("tasks", JSON.stringify(taskList))
    }else {
        let toastMessage = document.querySelector("#liveToast")
        let toastElement = new bootstrap.Toast( toastMessage, {delay: 2000})
        toastElement.show()
    }
    document.querySelector("#task").value = ""
}

let deleteElement = () => { 
    
    //liItems = document.querySelectorAll("#list>li")
    for (let i = 0; i<liItems.length; i++) {
        liItems[i].onclick = function() {
            liIndex = tab.indexOf(liItems[i].innerHTML)
            liItems[liIndex].parentNode.removeChild(liItems[liIndex])
        }
    }
}

openingPage()