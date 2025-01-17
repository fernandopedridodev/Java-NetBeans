/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obteracronimo;

/**
 *
 * @author fernando.pedridomarino
 */
public class ObterAcronimo {

public class Acronimos {
public String obtenerAcronimo(String cadena){
String resultado = "";
char caracter;
int n = cadena.length();
for(int i = 0;i < n;i++){
caracter = cadena.charAt(i);
if(caracter != ' '){
if (i == 0){
resultado = resultado + caracter +'.';
}
else{
if(cadena.charAt(i-1) == ' '){
resultado = resultado + caracter + '.';
}
}
}
}
return resultado;
}
}
    
}
