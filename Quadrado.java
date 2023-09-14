class Quadrado {
    int lado;
    int area;
    int perimetro;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public void calcularArea() {
        this.area = this.lado * this.lado;
    }

    public void calcularPerimetro() {
        this.perimetro = 4 * this.lado;
    }

    public void imprimir() {
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}
