-- Grupa
INSERT INTO Grupa (grupa_id, nazwa) VALUES 
  (1, 'Grupa A'),
  (2, 'Grupa B');

-- Student
INSERT INTO Student (student_id, imie, nazwisko, login, indeks, email, haslo, token_reset_password, status_konta, licznik_nieudanych_logowan, data_ostatniego_logowania, grupa_id) VALUES
  (1, 'Jan', 'Kowalski', 'jkowalski', 12345, 'jan.kowalski@example.com', 'haslo1', NULL, 'aktywne', 0, '2024-06-01 08:00:00', 1),
  (2, 'Anna', 'Nowak', 'anowak', 67890, 'anna.nowak@example.com', 'haslo2', NULL, 'aktywne', 1, '2024-06-02 09:00:00', 2);

-- Ksiazka
INSERT INTO Ksiazka (ksiazka_id, tytul, autor, rok_wydania) VALUES
  (1, 'Wprowadzenie do SQL', 'Autor A', 2020),
  (2, 'Zaawansowane bazy danych', 'Autor B', 2018);

-- Wypozyczenie
INSERT INTO Wypozyczenie (wypozyczenie_id, student_id, ksiazka_id, data_wypozyczenia, data_zwrotu, status) VALUES
  (1, 1, 1, '2024-05-01', '2024-05-15', 'oddana'),
  (2, 2, 2, '2024-05-10', NULL, 'wypozyczona');

-- Wykladowca
INSERT INTO Wykladowca (wykladowca_id, imie, nazwisko, email) VALUES
  (1, 'Marek', 'Wisniewski', 'marek.wisniewski@example.com'),
  (2, 'Ewa', 'Nowak', 'ewa.nowak@example.com');

-- Przedmiot
INSERT INTO Przedmiot (przedmiot_id, nazwa, kod_przedmiotu, opis, liczba_miejsc, forma_zaliczenia, punkty_ects, liczba_godzin, wykladowca_id) VALUES
  (1, 'Podstawy baz danych', 'PBD101', 'Wprowadzenie do baz danych.', 30, 'egzamin', 6, 30, 1),
  (2, 'Algorytmy i struktury danych', 'ASD102', 'Podstawowe algorytmy.', 25, 'projekt', 5, 40, 2);

-- Zapis_na_przedmiot
INSERT INTO Zapis_na_przedmiot (zapis_id, student_id, przedmiot_id, data_zapisu, status, termin_rezygnacji, lista_rezerwowa, zaliczone) VALUES
  (1, 1, 1, '2024-05-20', 'zapisany', '2024-06-10', FALSE, TRUE),
  (2, 2, 2, '2024-05-22', 'zapisany', '2024-06-12', TRUE, FALSE);

-- Ocena
INSERT INTO Ocena (ocena_id, student_id, przedmiot_id, wartosc_oceny, komentarz, typ_oceny, data_oceny) VALUES
  (1, 1, 1, 4.5, 'Bardzo dobra praca', 'egzamin', '2024-06-01'),
  (2, 2, 2, 3.0, 'Średnia praca', 'kolokwium', '2024-06-05');

-- Harmonogram_zajec
INSERT INTO Harmonogram_zajec (zajecia_id, dzien_tygodnia, godzina_rozpoczecia, godzina_zakonczenia, sala, grupa_id, przedmiot_id, wykladowca_id) VALUES
  (1, 'Poniedziałek', '08:00:00', '10:00:00', '101', 1, 1, 1),
  (2, 'Środa', '12:00:00', '14:00:00', '202', 2, 2, 2);

-- Platnosc
INSERT INTO Platnosc (platnosc_id, student_id, kwota, status, data_wplaty) VALUES
  (1, 1, 250.00, 'zaplacona', '2024-06-01'),
  (2, 2, 150.00, 'oczekujaca', '2024-06-05');
