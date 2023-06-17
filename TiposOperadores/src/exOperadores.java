public class exOperadores{
    public static void main(String[] args) throws Exception {
        // Operadores Lógicos
        boolean a = true;
        boolean b = false;
        
        System.out.println("Operadores Lógicos:");
        System.out.println("a && b: " + (a && b)); // Operador AND
        System.out.println("a || b: " + (a || b)); // Operador OR
        System.out.println("!a: " + (!a)); // Operador NOT
        
        // Operadores Aritméticos
        int x = 10;
        int y = 5;
        
        System.out.println("\nOperadores Aritméticos:");
        System.out.println("x + y: " + (x + y)); // Operador de adição
        System.out.println("x - y: " + (x - y)); // Operador de subtração
        System.out.println("x * y: " + (x * y)); // Operador de multiplicação
        System.out.println("x / y: " + (x / y)); // Operador de divisão
        System.out.println("x % y: " + (x % y)); // Operador de módulo
        
        // Operadores de Atribuição
        int z = 20;
        
        System.out.println("\nOperadores de Atribuição:");
        z += 5; // z = z + 5
        System.out.println("z += 5: " + z);
        
        z -= 3; // z = z - 3
        System.out.println("z -= 3: " + z);
        
        z *= 2; // z = z * 2
        System.out.println("z *= 2: " + z);
        
        z /= 4; // z = z / 4
        System.out.println("z /= 4: " + z);
        
        // Operadores Unários
        int n = 5;
        
        System.out.println("\nOperadores Unários:");
        System.out.println("++n: " + (++n)); // Pré-incremento
        System.out.println("--n: " + (--n)); // Pré-decremento
        System.out.println("n++: " + (n++)); // Pós-incremento
        System.out.println("n--: " + (n--)); // Pós-decremento
        System.out.println("+n: " + (+n)); // Operador unário de valor positivo
        System.out.println("-n: " + (-n)); // Operador unário de valor negativo
        System.out.println("!true: " + (!true)); // Operador unário lógico de negação
        System.out.println("n: " + n);
        
        // Operador Ternário
        int m = 10;
        String resultado = (m > 5) ? "Maior que 5" : "Menor ou igual a 5";
        
        System.out.println("\nOperador Ternário:");
        System.out.println("Resultado: " + resultado);
        
        // Operadores Relacionais
        int p = 8;
        int q = 5;
        
        System.out.println("\nOperadores Relacionais:");
        System.out.println("p == q: " + (p == q)); // Igual a
        System.out.println("p != q: " + (p != q)); // Diferente de
        System.out.println("p > q: " + (p > q)); // Maior que
        System.out.println("p < q: " + (p < q)); // Menor que
        System.out.println("p >= q: " + (p >= q)); // Maior ou igual a
        System.out.println("p <= q: " + (p <= q)); // Menor ou igual a
    }
}
