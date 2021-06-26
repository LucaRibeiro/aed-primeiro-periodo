#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

#define HOSP_MAX 5
#define HOSP_MIN 1
#define PRECO_MAX 250.0
#define PRECO_MIN 50.0


typedef struct tm Data;

typedef struct {
	int codigo;
	char nome[50];
	char endereco[200];
	char telefone[11];
} Cliente;

typedef struct {
	int codigo;
	char nome[50];
	char telefone[11];
	char cargo[20];
	float salario;
} Funcionario;

typedef struct {
	int codigo;
	Data data_entrada;
	Data data_saida;
	int quantidade_diarias;
	int codigo_cliente;
	int codigo_quarto;
} Estadia;

typedef struct {
	int numero;
	int quantidade_hospedes;
	float diaria;
	char status[20];
} Quarto;


Data inicializaData() {
	Data nova_data;

	nova_data.tm_hour = 0;
	nova_data.tm_min = 0;
	nova_data.tm_sec = 0;

	do {
		printf("\nInforme o dia: ");
		scanf("%i", &nova_data.tm_mday);
	} while (nova_data.tm_mday < 1 || nova_data.tm_mday > 31);

	do {
		printf("\nInforme o mes: ");
		scanf("%i", &nova_data.tm_mon);
	} while (nova_data.tm_mon < 1 || nova_data.tm_mon > 12);

	do {
		printf("\nInforme o ano: ");
		scanf("%i", &nova_data.tm_year);

	} while (nova_data.tm_year < 1900);

	return nova_data;
}

Quarto* inicializaQuartos() {
	Quarto quartos[10];

	srand((unsigned)time(NULL));

	for (int i = 0; i < 10; i++) {
		quartos[i].numero = i;
		do {
			quartos[i].quantidade_hospedes = rand() % (HOSP_MAX - HOSP_MIN + 1) + HOSP_MIN;
			quartos[i].diaria = ((float)rand() / (float)(RAND_MAX)) * PRECO_MAX;
		} while (quartos[i].diaria <= PRECO_MIN);
		strcpy(quartos[i].status, "Desocupado");
	}


	for (int i = 0; i < 10; i++) {
		printf("\n\nNumero: %i", quartos[i].numero);
		printf("\nHospedes: %i", quartos[i].quantidade_hospedes);
		printf("\nDiaria: %.2f", quartos[i].diaria);
		printf("\nStatus: %s", quartos[i].status);
	}

	return quartos;
}

void cadastraCliente(Cliente* lista_clientes, int* contador_clientes) {
	Cliente cliente_novo;

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

	printf("\nInforme o nome do cliente: ");
	fgets(cliente_novo.nome, 50, stdin);

	printf("\nInforme o endereco do cliente: ");
	fgets(cliente_novo.endereco, 200, stdin);

	printf("\nInforme o telefone do cliente com DDD(apenas numeros, sem tracos, espacos ou parentes: ");
	fgets(cliente_novo.telefone, 11, stdin);

	printf("\nCodigo: %i", cliente_novo.codigo);
	printf("\nNome: %s", cliente_novo.nome);
	printf("\nEndereco %s", cliente_novo.endereco);
	printf("\nTelefone: %s", cliente_novo.telefone);


	lista_clientes[*contador_clientes] = cliente_novo;
	*contador_clientes = *contador_clientes + 1;
}

void cadastraFuncionario(Funcionario* lista_funcionarios, int* contador_funcionarios) {
	Funcionario funcionario_novo;

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

	printf("\nInforme o nome do funcionario: ");
	fgets(funcionario_novo.nome, 50, stdin);

	printf("\nInforme o cargo do funcionario: ");
	fgets(funcionario_novo.cargo, 20, stdin);

	printf("\nInforme o salario do funcionario: ");
	scanf("%f", &funcionario_novo.salario);

	printf("\nInforme o telefone do funcionario com DDD(apenas numeros, sem tracos, espacos ou parentes: ");
	fgets(funcionario_novo.telefone, 11, stdin);

	printf("\nCodigo: %i", funcionario_novo.codigo);
	printf("\nNome: %s", funcionario_novo.nome);
	printf("\nEndereco %s", funcionario_novo.cargo);
	printf("\nEndereco %.2f", funcionario_novo.salario);
	printf("\nTelefone: %s", funcionario_novo.telefone);


	lista_funcionarios[*contador_funcionarios] = funcionario_novo;
	*contador_funcionarios = *contador_funcionarios + 1;
}

void cadastraEstadia(Cliente cliente, Estadia* lista_estadias, int* contador_estadias, Quarto* quartos) {
	Estadia estadia_nova;

	srand((unsigned)time(NULL));
	int unico = 0;
	do {
		estadia_nova.codigo = rand();
		for (int i = sizeof(lista_estadias); i >= 0;i--) {
			if (lista_estadias[i].codigo == estadia_nova.codigo) {
				unico = 1;
			}
		}
	} while (unico);

	printf("\n\nData de entrada...");
	Data data_entrada = inicializaData();
	data_entrada.tm_hour = 14;
	data_entrada.tm_min = 00;

	estadia_nova.data_entrada = data_entrada;

	printf("\n\nData de saida (DD/MM/AAAA)...");
	Data data_saida = inicializaData();
	data_saida.tm_hour = 12;
	data_saida.tm_min = 00;

	estadia_nova.data_saida = data_saida;


	estadia_nova.quantidade_diarias = (int)(difftime(mktime(&estadia_nova.data_entrada), mktime(&estadia_nova.data_entrada)) / 86400);

	printf("\nCodigo: %i", estadia_nova.codigo);
	printf("\nData de entrada: %s", asctime(&(estadia_nova.data_entrada)));
	printf("\nData de entrada %s", asctime(&(estadia_nova.data_saida)));
	printf("\nQuantidaded de diarias %i", estadia_nova.quantidade_diarias);
	printf("\nCodigo cliente: %i", estadia_nova.codigo_cliente);
	printf("\nCodigo quarto: %i", estadia_nova.codigo_quarto);

	lista_estadias[*contador_estadias] = estadia_nova;
	*contador_estadias = *contador_estadias + 1;
}

Cliente pesquisaCliente(char* nome, Cliente* lista_clientes) {}

Funcionario pesquisaFuncionario(char* nome, Funcionario* lista_funcionarios) {}

void imprimeEstadia(Cliente cliente_pesquisa) {

}

void calculaFidelidade() {

}

int main() {
	int contador_clientes = 0, contador_funcionarios = 0, contador_estadias = 0;

	Cliente lista_clientes[10];
	Funcionario lista_funcionarios[10];
	Estadia lista_estadias[10];

	printf("\n[+] Gerando quartos...\n");
	Quarto* lista_quartos = inicializaQuartos();

	cadastraCliente(lista_clientes, &contador_clientes);
	cadastraCliente(lista_clientes, &contador_clientes);

	printf("\nLista de clientes: ");

	for (int i = 0; i < contador_clientes; i++) {
		Cliente c = lista_clientes[i];
		printf("\nCodigo: %i", c.codigo);
		printf("\nNome: %s", c.nome);
		printf("\nEndereco %s", c.endereco);
		printf("\nTelefone: %s", c.telefone);

	}

	cadastraFuncionario(lista_funcionarios, &contador_funcionarios);
	cadastraFuncionario(lista_funcionarios, &contador_funcionarios);

	printf("\nLista de funcionários: ");

	for (int i = 0; i <= contador_funcionarios; i++) {
		Funcionario f = lista_funcionarios[i];
		printf("\nCodigo: %i", f.codigo);
		printf("\nNome: %s", f.nome);
		printf("\nEndereco %s", f.cargo);
		printf("\nEndereco %.2f", f.salario);
		printf("\nTelefone: %s", f.telefone);

	}


	cadastraEstadia(lista_clientes[1], lista_estadias, &contador_estadias, lista_quartos);
	cadastraEstadia(lista_clientes[2], lista_estadias, &contador_estadias, lista_quartos);

	printf("\nLista de estadias: ");

	for (int i = 0; i <= contador_estadias; i++) {
		Estadia e = lista_estadias[i];
		printf("\nCodigo: %i", e.codigo);
		printf("\nData de entrada: %s", asctime(&(e.data_entrada)));
		printf("\nData de entrada %s", asctime(&(e.data_saida)));
		printf("\nQuantidaded de diarias %i", e.quantidade_diarias);
		printf("\nCodigo cliente: %i", e.codigo_cliente);
		printf("\nCodigo quarto: %i", e.codigo_quarto);
	}
	return 0;
}
