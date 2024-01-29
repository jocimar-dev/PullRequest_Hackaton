# Importação desnecessária e verbosa
import os, sys

# Variáveis globais - má prática
configuration = {
    'url': 'http://example.com',
    'port': '8080',
    'use_https': False
}

# Função com lógica redundante e verbosa
def make_configuration(url, port, use_https):
    if use_https == True:
        configuration['url'] = 'https://' + url
    else:
        configuration['url'] = 'http://' + url

    if port is not None:
        configuration['port'] = str(port)

    print("Configuração é: ")
    print(configuration)

# Função com nome confuso e verbosa
def do_some_processing_and_then_do_something_else_unnecessarily_long_function_name():
    data = "Alguns dados complexos e importantes"
    print("Processando dados: " + data)
    # ... mais processamento desnecessário e passos complexos ...
    return data

# Uso de métodos antigos de formatação de strings e excesso de lógica de controle
def connect_to_server():
    if configuration['use_https'] == True:
        print("Conectando ao servidor usando HTTPS...")
        print("URL: " + configuration['url'])
    else:
        print("Conectando ao servidor usando HTTP...")
        print("URL: " + configuration['url'])

    # Loop e condições desnecessárias
    for i in range(5):
        if i == 4:
            print("Tentativas de conexão: " + str(i + 1))
            break

# Chamadas de funções
make_configuration('localhost', 8080, True)
do_some_processing_and_then_do_something_else_unnecessarily_long_function_name()
connect_to_server()

# Modificação de variáveis globais
def change_global_config():
    global configuration
    configuration['use_https'] = not configuration['use_https']
    print("Configuração HTTPS alterada para: " + str(configuration['use_https']))

change_global_config()
