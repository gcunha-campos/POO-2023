class Triangulo {
    int base;
    int altura;
    int area;
    int perimetro;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        this.area = (this.base * this.altura) / 2;
    }

    public void calcularPerimetro() {
        this.perimetro = 3 * this.base;
    }

    public void imprimir() {
        System.out.println("Base: " + this.base);
        System.out.println("Altura: " + this.altura);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}
