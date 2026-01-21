
const userForms = document.querySelector("#formsUser");


async function saveUser(event) {

    event.preventDefault(); 
    const formData = new FormData(userForms);

    const data = Object.fromEntries(formData.entries());
    const checkbox = document.getElementById("userHasAgreed");
    data.userHasAgreed = checkbox ? checkbox.checked : false;

    const response = await fetch("http://localhost:8080/users", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data)

        });

        if(!response.ok){
            alert((await response.text()).toString())
        }
}


userForms.addEventListener("submit", saveUser);