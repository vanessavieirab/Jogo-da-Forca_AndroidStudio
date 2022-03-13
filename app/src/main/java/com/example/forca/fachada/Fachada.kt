package model

class Fachada {
    private var banco = RepositorioPalavras()
    private lateinit var joguinho: Forca

    fun registrarPadrao() {
        this.banco.add("Pastel", "Feito de massa e vento")
        this.banco.add("Casa", "Lar")
        this.banco.add("Assaltante", "Vagabundo safado")
    }
    fun iniciar() {
        this.banco.sortear()
        joguinho = Forca(this.banco.getPalavra(), this.banco.getDica())
        joguinho.iniciar()
    }
    fun dica(): String {
        var output = ""
        output += "Dica: ${joguinho.getDica()}"

        return output
    }
    fun palavra(): String {
        var output = ""
        output += "Palavra: ${joguinho.getPalavraOculta()}"

        return output
    }

    fun status(): String{
        var output = ""
        output += "Tamanho da palavra: ${joguinho.getPalavra()}\n"
        output += "Letras distintas: ${joguinho.letrasDistintas()}\n"
        output += "Letras usadas: ${joguinho.getLetrasUsadas()}\n"
        output += "Acertos: ${joguinho.getAcertos()}\n"
        output += "Tentativas: ${joguinho.getTentativas()}\n"

        return output
    }
}