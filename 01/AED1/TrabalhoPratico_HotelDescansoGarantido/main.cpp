#include <iostream>
#include <string>
#include <cstdlib>

using namespace std;


class cliente {
public:
	int codigo;
	string nome;
	string endereco;
	string telefone;
};

class funcionario {
public:
	int codigo;
	string nome;
	string telefone;
	string cargo;
	float salario;

};

class estadia {
public:
	int codigo;
	string data_entrada;
	string data_saida;
	int quantidade_diarias;
	int codigo_cliente;
	int numero_quarto;

};

class quarto {
public:
	int numero;
	int quantidade_hospedes;
	float diaria;
	bool blabla;
};


void cadastra_cliente(cliente* lista_clientes) {
	cliente cliente_novo;

	srand((unsigned)time(NULL));
	int unico = 0;

	do {
		cliente_novo.codigo = rand();
		for (int i = sizeof(lista_clientes); i >= 0;i--) {
			if (lista_clientes[i].codigo == cliente_novo.codigo) {
				unico = 1;
			}
		}
	} while (unico);

	cout << "\nInforme o nome do cliente: ";
	getline(cin, cliente_novo.nome);

	cout << "\nInforme o endereco do cliente: ";
	getline(cin, cliente_novo.endereco);

	cout << "\nInforme o telefone do cliente com DDD(apenas numeros, sem tracos, espacos ou parentes): ";
	getline(cin, cliente_novo.telefone);

	cout << "\nCodigo: " << cliente_novo.codigo;
	cout << "\nNome: " << cliente_novo.nome;
	cout << "\nEndereco " << cliente_novo.endereco;
	cout << "\nTelefone:" << cliente_novo.telefone;

}

void cadastra_funcionario(funcionario* lista_funcionarios) {
	funcionario funcionario_novo;

	srand((unsigned)time(NULL));
	int unico = 0;

	do {
		funcionario_novo.codigo = rand();
		for (int i = sizeof(lista_funcionarios); i >= 0;i--) {
			if (lista_funcionarios[i].codigo == funcionario_novo.codigo) {
				unico = 1;
			}
		}
	} while (unico);

	cout << "\nInforme o nome do funcionario: ";
	getline(cin, funcionario_novo.nome);

	cout << "\nInforme o cargo do funcionario: ";
	getline(cin, funcionario_novo.cargo);

	cout << "\nInforme o salario do funcionario: ";
	cin >> funcionario_novo.salario;

	cout << "\nInforme o telefone do funcionario com DDD(apenas numeros, sem tracos, espacos ou parentes):" ;
	getline(cin, funcionario_novo.telefone);

	cout << "\nCodigo: " << funcionario_novo.codigo;
	cout << "\nNome: " << funcionario_novo.nome;
	cout << "\nEndereco " << funcionario_novo.cargo;
	cout << "\nEndereco " << funcionario_novo.salario;
	cout << "\nTelefone: " << funcionario_novo.telefone;

}

// cliente pesquisa_cliente(char* nome, cliente* lista_clientes) {}
// funcionario pesquisa_funcionario(char* nome, funcionario* lista_funcionarios) {}
// estadia* estadias_cliente(cliente cliente_pesquisa) {}
// void calcula_fidelidade() {}


int main() {
	cliente lista_clientes[100];
	funcionario lista_funcionarios[100];


	cadastra_cliente(lista_clientes);
	cadastra_funcionario(lista_funcionarios);
	return 0;
}
