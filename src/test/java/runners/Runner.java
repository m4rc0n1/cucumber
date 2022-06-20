package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-reports.html"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@orkhan",
        dryRun = false
)

public class Runner {
    /*
    Runner clasinin bodysine hec bir kod yazilmir
    bu class icin onemli olan kullanacagimiz 2 adet notasyon
    dryRun=false oldugunda belirlenen tagla etiketlenen tum scenariolari sirasiyla calistirir
    dryRyn=true dedigimizde ise kodlari calistirmadan eksik stepler olp olmadigini kontrol eder
    ve varsa bize eksik stepleri rapor eder

    features ve glue olarak spesifik bir class ve ya faeture dosyasini degil
    tum klassor ve package sectik
    dolayisila setpdefinitions package i icerisinde hangiclassda olursa olsun
    isimize yarayan bir steopdefiniton varsa rahatlikla kullanabiliriz

     */

}
