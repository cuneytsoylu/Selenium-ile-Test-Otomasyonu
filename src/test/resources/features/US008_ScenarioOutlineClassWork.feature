Feature: Datatables sitesine 5 farkli kullanici girisi yapalim

  Scenario Outline: TC01 kullanici 5 farkli kayit girisi yapabilmeli
    When kullanici "dataURL" anasayfasina gider
    Then kullanici new butonuna basar
    And isim bolumune "<firstname>"yazar
    And kullanici 1 saniye bekler
    And soyisim bolumune "<lastname>"yazar
    And position bolumune "<position>"yazar
    And kullanici 1 saniye bekler
    And officebolumune "<office>"yazar
    And kullanici 1 saniye bekler
    And extension bolumune "<extension>"yazar
    And kullanici 1 saniye bekler
    And sratDate bolumune "<startDate>"yazar
    And kullanici 1 saniye bekler
    And salary bolumune "<salary>"yazar
    And kullanici 1 saniye bekler
    And kullanici create butonuna basar
    And kullanici 1 saniye bekler
    When kullanici "<firstname>" ile arama yapar
    And kullanici 2 saniye bekler
    And isim bolumunde "<firstname>" oldugunu test eder
    Examples:
      | firstname | lastname | position    | office | extension | startDate  | salary |
      | cuneyt    | soylu    | QA          | TURKEY | UI        | 2023-11-15 | 50000  |
      | Kemal     | demir    | tester      | TURKEY | API       | 2023-10-15 | 30000  |
      | Erol      | bilek    | developer   | TURKEY | Backend   | 2023-09-15 | 80000  |
      | Fatma     | Alici    | UI designer | TURKEY | UI        | 2022-11-15 | 60000  |
      | Neval     | Bay      | QA          | TURKEY | UI        | 2023-10-15 | 50000  |

  Scenario: Kullanici sayfayi kapatir
    Given sayfayi kapatir