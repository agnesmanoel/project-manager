
const tela = document.getElementById("tela");


async function getAllUsers() {

    const response = await fetch("http://localhost:8080/users");
    const users = await response.json();

    if(!response.ok){
        alert((await response.text()).toString())
    }

    if(!response.ok){
        if(response.status == 400){
        alert((await response.text()).toString())
        } else {
            alert("Unable to load projects")
        }
    }

    users.forEach(user => {

        const div = document.createElement("div");

        div.classList.add("card");

        const userName = document.createElement("p");
        const userNumber = document.createElement("p");
        const image = document.createElement("img");

        image.src = "user-profile.png";
        image.width = 100;
        image.height = 100;

        

        userName.innerText = "User name: " + user.userName;
        userNumber.innerText = "User number: " + user.userNumber;
        div.append(image, userName, userNumber);
        tela.appendChild(div);


    });

}


getAllUsers()