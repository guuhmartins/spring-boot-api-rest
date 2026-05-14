# Spring Boot Essentials

API REST em Java + Spring Boot 4 demonstrando os fundamentos do desenvolvimento backend moderno: arquitetura em camadas, injeção de dependências, tratamento global de exceções e documentação automática.

---

## Stack

`Java 17` · `Spring Boot 4.0` · `Spring Web MVC` · `Lombok` · `Springdoc OpenAPI` · `Maven`

---

## Conceitos demonstrados

**Arquitetura**
- Separação em camadas (Controller → Service → DTO/Entity)
- Injeção de dependências via construtor
- Single Responsibility Principle aplicado em cada camada

**REST API**
- CRUD completo seguindo as convenções RESTful
- Uso correto de métodos HTTP e status codes
- Mapeamento de parâmetros (`@PathVariable`, `@RequestParam`, `@RequestBody`)

**Robustez**
- `@RestControllerAdvice` para tratamento global de exceções
- Exceções customizadas (`NotFoundException`)
- Respostas de erro padronizadas (`ErrorResponse`)

**Documentação**
- OpenAPI/Swagger integrado, com UI acessível em `/swagger-ui.html`

---

## Estrutura

```
src/main/java/br/com/henri/spring_boot_essentials/
├── controller/   → camada de apresentação (endpoints)
├── service/      → regras de negócio
├── dto/          → contratos de entrada/saída
├── entity/       → modelo de domínio
├── exception/    → exceções customizadas
└── handler/      → tratamento global de erros
```

---

## Endpoints

| Método   | Rota               | Ação                          |
|----------|--------------------|-------------------------------|
| `GET`    | `/produtos`        | Lista todos                   |
| `GET`    | `/produtos/{id}`   | Busca por ID                  |
| `POST`   | `/produtos`        | Cria                          |
| `PUT`    | `/produtos/{id}`   | Atualiza                      |
| `DELETE` | `/produtos/{id}`   | Remove                        |
