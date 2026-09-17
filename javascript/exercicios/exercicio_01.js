/* Escreva um algoritmo para ler o salário mensal atual de um funcionário e o 
    percentual de reajuste. Calcule e escreva o valor do novo salário. */

let salario = 10000.00;
let reajuste = 0.04;
let salarioReajustado = (salario * reajuste) + salario;

console.log("O valor do salário com o reajuste é: R$" + salarioReajustado + ".");