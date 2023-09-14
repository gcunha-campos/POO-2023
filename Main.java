import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma forma geométrica:");
            System.out.println("1 - Triângulo");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Quadrado");
            System.out.println("4 - Círculo");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();
            System.out.println();

            if (opcao == 5) {
                scanner.close();
                System.exit(0);
            }

            boolean operacaoSelecionada = false;

            if (opcao >= 1 && opcao <= 4) {
                operacaoSelecionada = true;
                System.out.println("Escolha uma operação:");
                System.out.println("1 - Calcular Área");
                System.out.println("2 - Calcular Perímetro");
                System.out.print("Digite a operação desejada: ");
                int operacao = scanner.nextInt();
                System.out.println();

                switch (opcao) {
                    case 1:
                        if (operacao == 1) {
                            System.out.print("Digite a base do triângulo: ");
                            int baseT = scanner.nextInt();
                            System.out.print("Digite a altura do triângulo: ");
                            int alturaT = scanner.nextInt();
                            Triangulo t = new Triangulo(baseT, alturaT);
                            t.calcularArea();
                            t.imprimir();
                        } else if (operacao == 2) {
                            System.out.println("Operação inválida para Triângulo. Tente novamente.");
                        } else {
                            System.out.println("Operação inválida. Tente novamente.");
                        }
                        break;

                    case 2:
                        if (operacao == 1) {
                            System.out.print("Digite a base do retângulo: ");
                            int baseR = scanner.nextInt();
                            System.out.print("Digite a altura do retângulo: ");
                            int alturaR = scanner.nextInt();
                            Retangulo r = new Retangulo(baseR, alturaR);
                            r.calcularArea();
                            r.imprimir();
                        } else if (operacao == 2) {
                            System.out.print("Digite a base do retângulo: ");
                            int baseR = scanner.nextInt();
                            System.out.print("Digite a altura do retângulo: ");
                            int alturaR = scanner.nextInt();
                            Retangulo r = new Retangulo(baseR, alturaR);
                            r.calcularPerimetro();
                            r.imprimir();
                        } else {
                            System.out.println("Operação inválida. Tente novamente.");
                        }
                        break;

                    case 3:
                        if (operacao == 1) {
                            System.out.print("Digite o lado do quadrado: ");
                            int ladoQ = scanner.nextInt();
                            Quadrado q = new Quadrado(ladoQ);
                            q.calcularArea();
                            q.imprimir();
                        } else if (operacao == 2) {
                            System.out.print("Digite o lado do quadrado: ");
                            int ladoQ = scanner.nextInt();
                            Quadrado q = new Quadrado(ladoQ);
                            q.calcularPerimetro();
                            q.imprimir();
                        } else {
                            System.out.println("Operação inválida. Tente novamente.");
                        }
                        break;

                    case 4:
                        if (operacao == 1) {
                            System.out.print("Digite o raio do círculo: ");
                            int raioC = scanner.nextInt();
                            Circulo c = new Circulo(raioC);
                            c.calcularArea();
                            c.imprimir();
                        } else if (operacao == 2) {
                            System.out.print("Digite o raio do círculo: ");
                            int raioC = scanner.nextInt();
                            Circulo c = new Circulo(raioC);
                            c.calcularPerimetro();
                            c.imprimir();
                        } else {
                            System.out.println("Operação inválida. Tente novamente.");
                        }
                        break;
                }
            }

            if (!operacaoSelecionada) {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }
    }
}
