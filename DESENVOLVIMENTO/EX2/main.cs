using System;

class Program {
  public static void Main (string[] args) {
    //Calculando area de um retangulo
    Console.WriteLine("Digite a base do retangulo: ");
    double baseRetangulo = double.Parse(Console.ReadLine());
    Console.WriteLine("Digite a altura do retangulo: ");
    double alturaRetangulo = double.Parse(Console.ReadLine());

    double areaRetangulo = baseRetangulo * alturaRetangulo;
    Console.WriteLine("A area do retangulo é: " + areaRetangulo);
  }
}