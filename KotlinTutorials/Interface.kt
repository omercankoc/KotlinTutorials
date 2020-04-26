/*
 * Interface: Nesne olusturamayan soyut siniflardir.
 * Birden fazla sinifa kalitim ile özelliklerini gecirebilir.
 */
interface Backend{
    var backendLanguage : String
    var backendFramework : String
    fun BackendTech(backendLanguage : String, backendFramework : String) : String{
        return backendLanguage + backendFramework
    }
}

interface Frontend{
    var frontendLanguage : String
    var frontendFramework : String
    fun FrontendTech(frontendLanguage : String, frontendFramework : String) : String{
        return frontendLanguage + frontendFramework
	}
}

class Application : Backend, Frontend{
   override var backendLanguage : String = ""
   override var backendFramework : String = ""
   override var frontendLanguage : String = ""
   override var frontendFramework : String = ""
}

fun main() {
    var application = Application()
    application.backendLanguage = "Go"
    application.backendFramework = ""
    application.frontendLanguage = "JS"
    application.frontendFramework = "Swelte"
    
    println(application.BackendTech(application.backendLanguage, application.backendFramework))
    println(application.FrontendTech(application.frontendLanguage, application.frontendFramework))
}
