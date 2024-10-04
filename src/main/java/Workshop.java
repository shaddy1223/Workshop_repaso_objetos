import java.util.ArrayList;
import java.util.List;

public class Workshop {

    // Método que suma dos números enteros
    public int sumarDosNumeros
    (int a, int b) {
        return a + b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros
    (int a, int b, int c) {
        if(a>b)
        {
            if(a>c)
            {
                return a;
            }
        }
        if(b>c)
        {
            if(b>a)
            {
                return b;
            }
        }
        if(c>b)
        {
            if(c>a)
            {
                return c;
            }
        }
        return 0;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar
    (int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial
    (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo
    (int numero) {
        if (numero < 2)
        {return false;}

        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci
    (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        int[] serie = new int[n];
        if (n > 0) serie[0] = 0;
        if (n > 1) serie[1] = 1;
        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
        return serie;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos
    (int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos
    (int[] arreglo) {
        if (arreglo.length == 0) return 0.0;
        double suma=0;
        for(int i=0;i<arreglo.length;i++)
        {
            suma = suma+arreglo[i];
        }
        return suma / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor
    (int[] arreglo) {
        if (arreglo.length == 0) throw new IllegalArgumentException("El arreglo está vacío.");
        int mayor = arreglo[0];
        for (int num : arreglo) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor
    (int[] arreglo) {
        if (arreglo.length == 0) throw new IllegalArgumentException("El arreglo está vacío.");
        int menor = arreglo[0];
        for (int num : arreglo) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento
    (int[] arreglo, int elemento) {
        for (int num : arreglo) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo
    (int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo
    (int[] arreglo) {
        int[] copia = arreglo.clone();
        java.util.Arrays.sort(copia);
        return copia;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados
    (int[] arreglo) {
        List<Integer> lista = new ArrayList<>();
        for (int num : arreglo) {
            if (!lista.contains(num)) {
                lista.add(num);
            }
        }
        return lista.stream().mapToInt(i -> i).toArray();
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos
    (int[] arreglo1, int[] arreglo2) {
        int[] combinado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, combinado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, combinado, arreglo1.length, arreglo2.length);
        return combinado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo
    (int[] arreglo, int posiciones) {
        posiciones = posiciones % arreglo.length;
        if (posiciones < 0) {
            posiciones += arreglo.length;
        }

        int[] resultado = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            resultado[(i + posiciones) % arreglo.length] = arreglo[i];
        }

        return resultado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres
    (String cadena) {
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena
    (String cadena) {
        StringBuilder stringBuilder = new StringBuilder(cadena);
        return stringBuilder.reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo
    (String cadena) {
        String limpio = cadena.replaceAll("\\s+", "").toLowerCase();

        int longitud = limpio.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (limpio.charAt(i) != limpio.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras
    (String cadena) {
        if (cadena.trim().isEmpty()) return 0;
        return cadena.trim().split("\\s+").length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas
    (String cadena) {
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas
    (String cadena) {
        return cadena.toLowerCase();

    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena
    (String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena
    (String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico
    (String correo) {
        return correo.matches("^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,}$");
    }

    // Método que calcula el promedio de una lista de números
    public double promedioLista
    (List<Integer> lista) {
        if (lista.isEmpty()) return 0.0;
        return lista.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario
    (int numero) {
        if (numero == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();
        int n = Math.abs(numero);

        while (n > 0) {
            binario.insert(0, n % 2);
            n /= 2;
        }

        if (numero < 0) {
            binario.insert(0, "-");
        }

        return binario.toString();
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal;
    public String convertirAHexadecimal
            (int numero) {
        if (numero == 0) {
            return "0";
        }

        StringBuilder hex = new StringBuilder();
        boolean esNegativo = numero < 0;

        int valorAbsoluto = Math.abs(numero);

        while (valorAbsoluto > 0) {
            int digito = valorAbsoluto % 16;
            if (digito < 10) {
                hex.append((char) ('0' + digito));
            } else {
                hex.append((char) ('A' + (digito - 10)));
            }
            valorAbsoluto /= 16;
        }

        if (esNegativo) {
            hex.append('-');
        }

        hex.reverse();
        return hex.toString();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock
    (String eleccionUsuario) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String eleccionComputadora = opciones[(int) (Math.random() * 5)];

        if (eleccionUsuario.equals(eleccionComputadora)) {
            return "Empate! Ambos eligieron " + eleccionUsuario;
        }

        if ((eleccionUsuario.equals("Piedra") && (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Lagarto"))) ||
                (eleccionUsuario.equals("Papel") && (eleccionComputadora.equals("Piedra") || eleccionComputadora.equals("Spock"))) ||
                (eleccionUsuario.equals("Tijera") && (eleccionComputadora.equals("Papel") || eleccionComputadora.equals("Lagarto"))) ||
                (eleccionUsuario.equals("Lagarto") && (eleccionComputadora.equals("Spock") || eleccionComputadora.equals("Papel"))) ||
                (eleccionUsuario.equals("Spock") && (eleccionComputadora.equals("Tijera") || eleccionComputadora.equals("Piedra")))) {
            return "Ganaste";
        } else {
            return "Perdiste";
        }
    }

    public String pptls2(String game[]) {
        String player1 = game[0].toUpperCase();
        String player2 = game[1].toUpperCase();

        if (player1.equals(player2)) {
            return "Empate";
        }

        switch (player1) {
            case "R":
                if (player2.equals("S") || player2.equals("L")) {
                    return "Player 1";
                }
                break;
            case "P":
                if (player2.equals("R") || player2.equals("V")) {
                    return "Player 1";
                }
                break;
            case "S":
                if (player2.equals("P") || player2.equals("L")) {
                    return "Player 1";
                }
                break;
            case "L":
                if (player2.equals("V") || player2.equals("P")) {
                    return "Player 1";
                }
                break;
            case "V":
                if (player2.equals("R") || player2.equals("S")) {
                    return "Player 1";
                }
                break;
            default:
                return "Entrada inválida para el Jugador 1";
        }

        return "Player 2";
    }

    public double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public String zoodiac(int day, int month) {

        if (month < 1 || month > 12) {
            return "Invalid Date";
        }

        int daysInMonth;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                return "Invalid Date";
        }

        if (day < 1 || day > daysInMonth) {
            return "Invalid Date";
        }

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Tauro";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Escorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagitario";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricornio";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Acuario";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Piscis";
        }

        return "Invalid Date";
    }
}