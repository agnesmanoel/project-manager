const tela = document.getElementById("tela");



async function getAllProjects() {

const response = await fetch("http://localhost:8080/projects");
const projects = await response.json();

projects.forEach(project => {

    const card = document.createElement("div");
    card.classList.add("card");
    const projectName = document.createElement("h3");
    const startDate = document.createElement("p");
    const finalDate = document.createElement("p");
    const responsibleUser = document.createElement("p");
    const responsibleUserNumber = document.createElement("p")

    projectName.textContent = project.projectName;
    startDate.textContent = "Start date: " + project.startDate
    finalDate.textContent = "Final date: " + project.finalDate
    responsibleUser.textContent = "Responsible User: " + project.responsibleUser.userName
    responsibleUserNumber.textContent = "Responsible Number: " + project.responsibleUser.userNumber



    card.appendChild(projectName);
    card.appendChild(startDate);
    card.appendChild(finalDate);
    card.appendChild(responsibleUser)
    card.appendChild(responsibleUserNumber)
    tela.appendChild(card);

});

}




getAllProjects()