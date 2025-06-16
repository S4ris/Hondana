# Hondana 📚

**Hondana** to projekt REST API stworzony w ramach studiów podyplomowych z języka Java. Aplikacja została zbudowana przy użyciu frameworka **Spring Boot** i działa lokalnie, korzystając z wbudowanej bazy danych.

## 🔧 Technologie
- Java 17
- Spring Boot
- Spring Data JPA
- H2 (wbudowana baza danych)
- Maven
- Lombok

## 🧩 Funkcjonalności
- Obsługa zasobów książek (CRUD)
- Zarządzanie kategoriami oraz autorami
- Prosty model relacyjny (książki ↔ autorzy/kategorie)
- Walidacja danych i obsługa błędów
- RESTowe endpointy zgodne z dobrymi praktykami

## 🚀 Uruchamianie projektu lokalnie

1. Sklonuj repozytorium:
git clone https://github.com/S4ris/Hondana.git
2. Przejdź do katalogu:
cd Hondana

3. Uruchom aplikację w IDE (np. IntelliJ) lub za pomocą Mavena:
mvn spring-boot:run

4. Aplikacja będzie dostępna pod adresem:
http://localhost:8080

## 📬 Przykładowe endpointy
- `GET /books` – pobierz listę książek
- `POST /books` – dodaj nową książkę
- `GET /authors` – lista autorów
- `GET /categories` – lista kategorii

## ✅ Status projektu
Projekt ukończony w ramach zaliczenia studiów. Możliwość dalszej rozbudowy o frontend oraz zewnętrzną bazę danych (np. PostgreSQL).
