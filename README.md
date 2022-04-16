# challenge
Desafio proposto por SisConsultoria!

### Configurações Necessarias

Este projeto esta usando como banco de dados o __Postgres__! caso queira usar um container Docker recomendo usar o comando abaixo:
```
docker run --name api-hogwarts-postgres -e POSTGRES_PASSWORD=password -e POSTGRES_DB=hogwarts -p 5432:5432 -d postgres 
``` 
 Para implementação de segurança este projeto esta usando o __keycloak__! para instanciar um container Docker execute este comando no pasta do projeto:
 ```
 docker-compose up 
 ``` 

para o __keycloak__ funcionar corretamente sera necesario:

- Criar um __Realm__ chamado __keycloak-demo__;
- Criar um __Client__ chamado __keycloak-app__;
- Criar duas __roles__ chamadas __admin__ e __user__;
- Criar dois __usuarios__ com o nome e senha a sua escolha e adicionar uma das __roles__ criada anteriormente.

para acessar o console do keycloak [clique aqui](http://localhost:9900/auth/).

