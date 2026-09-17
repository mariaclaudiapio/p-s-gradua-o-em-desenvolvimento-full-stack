/* Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média 
    final deste aluno. Considere que a média é ponderada e que o peso das notas
    é 2, 3 e 5.
*/

let primeiraNota = 5;
let segundaNota = 4;
let terceiraNota = 7;
let mediaFinal = ((primeiraNota * 2) + (segundaNota * 3) + (terceiraNota * 5)) / 10;

console.log("O valor da média ponderada é: " + mediaFinal + ".");