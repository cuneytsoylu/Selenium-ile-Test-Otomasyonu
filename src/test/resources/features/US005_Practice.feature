Feature: Practice
  @Practice
  Scenario: TC01 Kullanici gecerli bilgilerle giris testi yapar
    Given kullanici "brcURL" anasayfasinda
    And kullanici 2 saniye bekler
    Then login yazisina tiklar
    And kullanici 2 saniye bekler
    And gecersiz username girer
    And kullanici 2 saniye bekler
    And gecersiz password girer
    And kullanici 2 saniye bekler
    And Login butonuna basar
    And kullanici 2 saniye bekler
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir


