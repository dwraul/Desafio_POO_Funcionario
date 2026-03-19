public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Jôao", 2000);
        Gerente g = new Gerente("Maria", 4000, 1500);
        Desenvolvedor d = new Desenvolvedor("Carlos", 3000, 10, 50);

        System.out.println("Funcionário: " + f.getNome());
        System.out.println("Salário Final: " + f.calcularSalario());
        System.out.println();

        System.out.println("Funcionário: " + g.getNome());
        System.out.println("Salário Final: " + g.calcularSalario());
        System.out.println();

        System.out.println("Funcionário: " + d.getNome());
        System.out.println("Salário Final: " + d.calcularSalario());
    }
    }

