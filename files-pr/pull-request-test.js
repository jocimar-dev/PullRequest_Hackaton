// Função global - má prática
function process_users() {
    user_data.forEach(function(u) {
        if (u.age > 30) {
            console.log(u.name);
        }
    });
}

// Objeto global - má prática
var user_data = [
    { name: "John Doe", age: 31, email: "john@doe.com" },
    { name: "Jane Smith", age: 25, email: "jane@smith.com" }
];

// Função com muitas responsabilidades e manipulação direta do DOM - má prática
function createAndAppendUser(user) {
    if (user.age <= 30) {
        return; // Ignorando usuários com menos de 30 anos
    }

    // Criação de elementos de forma ineficiente e direta
    var list = document.getElementById('userList');
    var entry = document.createElement('li');
    entry.appendChild(document.createTextNode(user.name + ' - ' + user.email));
    list.appendChild(entry);
}

// Chamada imediata da função - má prática
process_users();

// Loop for inapropriado para arrays - má prática
for (var i = 0; i < user_data.length; i++) {
    createAndAppendUser(user_data[i]);
}

// Manipulação direta de estilo - má prática
document.getElementById('userList').style.listStyleType = 'none';
