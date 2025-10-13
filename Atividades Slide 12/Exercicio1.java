interface FormatoRelatorio {
    void gerar();
}

class GeradorPDF implements FormatoRelatorio {
    public void gerar() {
        System.out.println("Gerando PDF");
    }
}

class GeradorExcel implements FormatoRelatorio {
    public void gerar() {
        System.out.println("Gerando Excel");
    }
}

class EnviadorEmail {
    public void enviar() {
        System.out.println("Enviando email");
    }
}
