class Circulo {
    int raio;
    double area;
    double perimetro;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        this.area = Math.PI * this.raio * this.raio;
    }

    public void calcularPerimetro() {
        this.perimetro = 2 * Math.PI * this.raio;
    }

    public void imprimir() {
        System.out.println("Raio: " + this.raio);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}
