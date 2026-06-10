const nomeInput = document.getElementById("nome");
const valorInput = document.getElementById("valor");
const dataInput = document.getElementById("data");
const descricaoInput = document.getElementById("descricao");

const btnAdicionar = document.getElementById("btnAdicionar");

const tabelaEmprestimos = document.getElementById("tabelaEmprestimos");
const totalSpan = document.getElementById("total");

// Carrega dados ao iniciar
let emprestimos = JSON.parse(localStorage.getItem("emprestimos")) || [];

renderizarTabela();

// Adicionar empréstimo
btnAdicionar.addEventListener("click", () => {

    const nome = nomeInput.value.trim();
    const valor = parseFloat(valorInput.value);
    const data = dataInput.value;
    const descricao = descricaoInput.value.trim();

    if (!nome || !valor || !data) {
        alert("Preencha os campos obrigatórios.");
        return;
    }

    const emprestimo = {
        id: Date.now(),
        nome,
        valor,
        data,
        descricao
    };

    emprestimos.push(emprestimo);

    salvarDados();

    limparFormulario();

    renderizarTabela();
});

// Salvar localStorage
function salvarDados() {
    localStorage.setItem(
        "emprestimos",
        JSON.stringify(emprestimos)
    );
}

// Limpar formulário
function limparFormulario() {
    nomeInput.value = "";
    valorInput.value = "";
    dataInput.value = "";
    descricaoInput.value = "";
}

// Renderizar tabela
function renderizarTabela() {

    tabelaEmprestimos.innerHTML = "";

    let total = 0;

    emprestimos.forEach((emprestimo) => {

        total += emprestimo.valor;

        const linha = document.createElement("tr");

        linha.innerHTML = `
            <td>${emprestimo.nome}</td>
            <td>R$ ${emprestimo.valor.toFixed(2)}</td>
            <td>${formatarData(emprestimo.data)}</td>
            <td>${emprestimo.descricao}</td>
            <td>
                <button
                    class="btn btn-success btn-sm"
                    onclick="marcarPago(${emprestimo.id})">
                    ✓ Pago
                </button>
            </td>
        `;

        tabelaEmprestimos.appendChild(linha);
    });

    totalSpan.textContent =
        total.toLocaleString("pt-BR", {
            style: "currency",
            currency: "BRL"
        });
}

// Remover empréstimo pago
function marcarPago(id) {

    const confirmar = confirm(
        "Confirmar pagamento?"
    );

    if (!confirmar) return;

    emprestimos = emprestimos.filter(
        emprestimo => emprestimo.id !== id
    );

    salvarDados();

    renderizarTabela();
}

// Formatar data
function formatarData(data) {

    const [ano, mes, dia] = data.split("-");

    return `${dia}/${mes}/${ano}`;
}