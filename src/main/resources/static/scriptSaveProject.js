const projectForms = document.querySelector("#formsProjeto");
const selection = document.getElementById("userResponsibleSelection")

 

async function saveProject(event) {

    event.preventDefault();

    const formData = new FormData(projectForms);

    const data = Object.fromEntries(formData.entries());

 

    data.responsibleUser = {id: Number(data.userResponsible)};

    delete data.userResponsible;

 

    const response = await fetch("http://localhost:8080/projects", {

            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(data)
        });

 

        if (!response.ok) {

            alert(response.text())

        }

 

}

 

async function populateSelect(){  

    data.forEach(user =>{

        const option = document.createElement('option')
        option.value = user.id
        option.textContent = user.userName
        selection.appendChild(option)

    })

}

 

populateSelect()

projectForms.addEventListener("submit", saveProject);