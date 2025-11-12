# 🌕 Sistema de Controle de Missões Lunares

## 🛰️ Sobre o Projeto
O **Sistema de Controle de Missões Lunares** é uma aplicação desenvolvida em **Java**, que simula parte das operações de uma agência espacial fictícia chamada **Lunar Systems**.  
O objetivo principal é registrar, organizar e consultar informações sobre **missões espaciais com destino à Lua**, incluindo **astronautas**, **naves espaciais** e **resultados científicos** de cada expedição.

O projeto enfatiza a **persistência de dados** de duas formas distintas:
1. **Serialização Java (arquivo binário)**  
2. **NitriteDB (banco de dados NoSQL embarcado)**

---

## 🎯 Objetivos
- Desenvolver uma aplicação simples em **Java orientada a objetos**.  
- Modelar entidades relacionadas ao domínio espacial (missões, astronautas, naves).  
- Implementar **duas abordagens de persistência** (Serialização e NitriteDB).  
- Garantir o registro, consulta e controle de informações sobre as missões lunares.

---

## 🧩 Entidades Principais

### 🚀 Classe `Missao`
Representa uma viagem específica à Lua.  
**Atributos principais:**


### 👨‍🚀 Classe `Astronauta`
Representa um profissional participante da missão.  


### 🛸 Classe `Nave`
Representa o veículo espacial usado nas missões.  
 

---

## ⚙️ Regras de Negócio
1. Cada **missão** deve ter um **código único**.  
2. A **nave** deve ser **compatível com o número de tripulantes** da missão.  
3. Um **astronauta** deve ter **idade mínima de 21 anos** para participar.  
4. As missões devem armazenar **data de lançamento e retorno**, permitindo o **cálculo da duração**.  
5. Cada nova missão deve ser **persistida** tanto via **Serialização** quanto via **NitriteDB**.  
6. O sistema deve permitir:
   - Listar todas as missões registradas;  
   - Buscar astronautas por nome ou especialidade;  
   - Registrar e consultar resultados científicos.  
