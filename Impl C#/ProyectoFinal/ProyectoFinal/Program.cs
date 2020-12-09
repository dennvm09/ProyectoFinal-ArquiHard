using System;
using System.Drawing;
using System.Diagnostics;
using System.Linq;


namespace ProyectoFinal
{
    class Program
    {

        /*
         * VERSIÓN 1 DEL ALGORITMO
         */

        static void version1(String src, int profundidad, int tamanio)
        {

            /*
            Variable donde se carga los bits de la imagen.
            */
            Bitmap imagenOriginal = new Bitmap(src);

            Bitmap a = imagenOriginal;
            /*
            Variable de color 
            */
            Color color;
            /*
            Variable de tiempo
            */
            long tiempo = 0;
            Stopwatch stopWatch = new Stopwatch();
            stopWatch.Restart();
            stopWatch.Start();

            /*
            Ciclo for para iniciar el algotimo de conversion.
            */
            for (int i = 0; i < a.Height - 1; i++)
            {
                for (int j = 0; j < a.Width - 1; j++)
                {
                    color = a.GetPixel(i, j);
                    color = Color.FromArgb((255 - color.R), (255 - color.G), (255 - color.B));
                    a.SetPixel(i, j, color);
                }
            }
           
            stopWatch.Stop();

            /*
            Se calcula el tiempo
            */
            tiempo = (long)(stopWatch.Elapsed.TotalMilliseconds * 1000000);
            Console.WriteLine("Algoritmo Version 1: " + tiempo);

            /*
            Guardamos la imagen en la carpeta correspondiente
            */
            string ruta = @"C:\Users\estudiante\source\repos\PF_ArquitecturaHardware\Images\ImagesInver\imgReverse" + profundidad + " - " + tamanio + ".bmp";

            a.Save(ruta);
        }

        static void version2(String src, int profundidad, int tamanio)
        {
            /*
            Variable donde se carga los bits de la imagen.
            */
            Bitmap imagenOriginal = new Bitmap(src);

            Bitmap a = imagenOriginal;
            /*
            Variable de color 
            */
            Color color;
            /*
            Variable de tiempo
            */
            long tiempo = 0;
            Stopwatch stopWatch = new Stopwatch();
            stopWatch.Restart();
            stopWatch.Start();

            /*
            Ciclos for para iniciar el algotimo de conversion.
            */

            /*
            Ciclo No. 1
            */
            for (int i = 0; i < a.Height - 1; i++)
            {
                for (int j = 0; j < a.Width - 1; j++)
                {
                    color = a.GetPixel(i, j);
                    color = Color.FromArgb(255, (255 - color.R), color.G, color.B);
                    a.SetPixel(i, j, color);
                }
            }
            /*
            Ciclo No. 2
            */
            for (int i = 0; i < a.Height - 1; i++)
            {
                for (int j = 0; j < a.Width - 1; j++)
                {
                    color = a.GetPixel(i, j);
                    color = Color.FromArgb(255, color.R, (255 - color.G), color.B);
                    a.SetPixel(i, j, color);
                }
            }
            /*
            Ciclo No. 3.
            */
            for (int i = 0; i < a.Height - 1; i++)
            {
                for (int j = 0; j < a.Width - 1; j++)
                {
                    color = a.GetPixel(i, j);
                    color = Color.FromArgb(255, color.R, -color.G, (255 - color.B));
                    a.SetPixel(i, j, color);
                }
            }

        
            stopWatch.Stop();

            tiempo = (long)(stopWatch.Elapsed.TotalMilliseconds * 1000000);
            Console.WriteLine("Algoritmo Version 2: " + tiempo);

            /*
            Guardamos la imagen en la carpeta correspondiente
            */
            string ruta = @"C:\Users\estudiante\source\repos\PF_ArquitecturaHardware\Images\ImagesInver\imgReverse" + profundidad + " - " + tamanio + ".bmp";

            a.Save(ruta);
        }

        static void Main(string[] args)
        {

            /*
             Variable que almacena la version del algoritmo. 
             Valores enteros entre 1 y 5.
             */
            int versionAlgoritmo = 1;

            /*
             Variable que almacena el tamanio de la imagen que será utilizada. 
             Pueden ser los siguientes valores: 32, 64, 160, 240, 380, 512, 1500, 2000
             */
            int tamanioImagen = 160;

            /*
             Variable que almacena la profundidad de la imagen que será utilizada. 
             Pueden ser los siguientes valores: 8, 16, 24, 32
             */
            int profundidad = 32;

            /*
             Variable que almacena la ruta de la imagen que será utilizada.
             */
            String rutaImagen = @"C:\Users\estudiante\source\repos\PF_ArquitecturaHardware\Images\T[" + tamanioImagen + "]P[" + profundidad + "].png";


            int i = 0;


            while (i < 3)
            {

                switch (versionAlgoritmo)
                {
                    case 1:
                        version1(rutaImagen, profundidad, tamanioImagen);
                        i++;
                        break;
                    case 2:
                        version2(rutaImagen, profundidad, tamanioImagen);
                        i++;
                        break;
                    case 3:
                        version3(rutaImagen, profundidad, tamanioImagen);
                        i++;
                        break;
                    case 4:
                        version4(rutaImagen, profundidad, tamanioImagen);
                        i++;
                        break;
                    case 5:
                        version5(rutaImagen, profundidad, tamanioImagen);
                        i++;
                        break;
                    default:
                        Console.WriteLine("El número de versión del algoritmo no es válido.");
                        i = 3;
                        break;

                }

            }

                


            





        }
}
