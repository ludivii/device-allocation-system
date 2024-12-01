# DEVICE ALLOCATION SYSTEM
*Esse é um projeto back-end com o intuito de expandir o meu portfolio*

## O Device Allocation System (ou Sistema de Alocação de dispositivos) é um projeto back-end que auxilia no gerenciamento de uma locadora de equipamentos de informática, ele serve para que dispositivos (como computadores e notebooks), monitores e estabilizadores possam ser cadastrados no sistema e assosciados a empresas e/ou clientes.

## Modelo Conceitual

![device-allocation-system](https://github.com/user-attachments/assets/8f15b8e5-fbe3-4ded-82c1-10d8fe67bc81)

## Tecnologias utilizadas

- Java
- Spring Boot
- H2 Database
- Maven
- Jakarta
- Postgres
- Postman

## Como ele funciona

**Nele você pode cadastrar clientes, empresas, endereços, dispositivos, monitores, estabilizadores, e combinar tudo na entidade Allocation. A criação pode ser feita via uma IDE, pelo banco de dados, ou através de solicitações HTML usando CRUD *(em desenvolvimento)*.**

**Ele possui uma integração com o H2 Database (para teste), onde basta apenas dar start no programa que o banco de dados de teste é gerado e pode ser acessado no localhost:8080/h2-database. Também existe um profile "dev" que faz a integração no Postgres na porta 5433.**

## Exemplos de buscas

### Postman

*Workspace do Postman*

![workspace-postman](https://github.com/user-attachments/assets/999c56d2-a795-46ba-b08c-ccfaf7e3eeed)

*Allocation FindAll*

![allocation-findall](https://github.com/user-attachments/assets/4bdc2994-e355-43f1-9461-2221e00c32e0)

*Allocation FindById*

![allocation-findbyid](https://github.com/user-attachments/assets/dc3262a2-ad59-4f10-8e43-3a3f0210a06f)

### H2-Database

*H2-Database com query*

![h2-database](https://github.com/user-attachments/assets/7e72c6cf-97da-4b1b-a81e-408e89a77f7c)

### Postgres

*Postgres com VIEW allocation-full-search*

![image](https://github.com/user-attachments/assets/53478739-8182-4d94-bb3e-8590ba465982)

## Autor

Luan Dias Vinhático

[Linkedin](https://www.linkedin.com/in/luan-dias-vi/)

[Outro repositorio](https://github.com/ludivii/dslist)





