using System;

class Program
{
    public static void Main(string[] args)
    {

        String siga = "amarelo";
        if (siga == "verde")
        {
            Console.WriteLine("Avance");
        }
        else if (siga == "amarelo")
        {
            Console.WriteLine("Atenção");

        }
        else if (siga == "vermelho")
        {
            Console.WriteLine("Pare");
        }

    }
}