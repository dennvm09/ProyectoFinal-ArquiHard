using System;
using System.Drawing;
using System.Diagnostics;
using System.IO;
using System.Linq;


namespace ProyectoFinal
{
    class Program
    {

        public static int r = 1;

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
            Console.WriteLine("Resultado " + r + ": " + tiempo);

            /*
            Guardamos la imagen en la carpeta correspondiente
            */
            String ruta = Path.GetDirectoryName(Process.GetCurrentProcess().MainModule.FileName);
            String rutaImagen = ruta + @"\Images\ImagesInver\imgReverse_T[" + tamanio + "]P[" + profundidad + "].bmp";

            //string ruta = @"C:\Users\estudiante\source\repos\PF_ArquitecturaHardware\Images\ImagesInver\imgReverse_T[" + tamanio + "]P[" + profundidad + "].bmp";
            a.Save(rutaImagen);
        }


        /*
        * VERSIÓN 2 DEL ALGORITMO
        */
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

            long tiempo = 0;
            Stopwatch stopWatch = new Stopwatch();
            stopWatch.Restart();
            stopWatch.Start();

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
                    color = Color.FromArgb(255, color.R, color.G, (255 - color.B));
                    a.SetPixel(i, j, color);
                }
            }


            stopWatch.Stop();

            tiempo = (long)(stopWatch.Elapsed.TotalMilliseconds * 1000000);
            Console.WriteLine("Resultado " + r + ": " + tiempo);

            /*
            Guardamos la imagen en la carpeta correspondiente
            */
            String ruta = Path.GetDirectoryName(Process.GetCurrentProcess().MainModule.FileName);
            String rutaImagen = ruta + @"\Images\ImagesInver\imgReverse_T[" + tamanio + "]P[" + profundidad + "].bmp";

            //string ruta = @"C:\Users\estudiante\source\repos\PF_ArquitecturaHardware\Images\ImagesInver\imgReverse_T[" + tamanio + "]P[" + profundidad + "].bmp";
            a.Save(rutaImagen);
        }

        /*
        * VERSIÓN 3 DEL ALGORITMO
        */
        static void version3(String src, int profundidad, int tamanio)
        {
            /*
            Variable donde se carga los bits de la imagen.
            */
            Bitmap imagenOriginal = new Bitmap(src);

            Bitmap a = imagenOriginal;

            Color color;

            long tiempo = 0;
            Stopwatch stopWatch = new Stopwatch();
            stopWatch.Restart();
            stopWatch.Start();

            /*
            Ciclo for para iniciar el algotimo de conversion.
            */

            for (int j = 0; j < a.Height - 1; j++)
            {
                for (int i = 0; i < a.Width - 1; i++)
                {
                    color = a.GetPixel(i, j);
                    color = Color.FromArgb((255 - color.R), (255 - color.G), (255 - color.B));
                    a.SetPixel(i, j, color);
                }
            }

            stopWatch.Stop();


            tiempo = (long)(stopWatch.Elapsed.TotalMilliseconds * 1000000);
            Console.WriteLine("Resultado " + r + ": " + tiempo);

            /*
            Guardamos la imagen en la carpeta correspondiente
            */
            String ruta = Path.GetDirectoryName(Process.GetCurrentProcess().MainModule.FileName);
            String rutaImagen = ruta + @"\Images\ImagesInver\imgReverse_T[" + tamanio + "]P[" + profundidad + "].bmp";

            //string ruta = @"C:\Users\estudiante\source\repos\PF_ArquitecturaHardware\Images\ImagesInver\imgReverse_T[" + tamanio + "]P[" + profundidad + "].bmp";
            a.Save(rutaImagen);
        }

        /*
         * VERSIÓN 4 DEL ALGORITMO
         */

        static void version4(String src, int profundidad, int tamanio)
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
                    color = Color.FromArgb(255, color.R, (255 - color.G), (255 - color.B));
                    a.SetPixel(i, j, color);
                }
            }

            stopWatch.Stop();


            tiempo = (long)(stopWatch.Elapsed.TotalMilliseconds * 1000000);
            Console.WriteLine("Resultado " + r + ": " + tiempo);

            /*
            Guardamos la imagen en la carpeta correspondiente
            */
            String ruta = Path.GetDirectoryName(Process.GetCurrentProcess().MainModule.FileName);
            String rutaImagen = ruta + @"\Images\ImagesInver\imgReverse_T[" + tamanio + "]P[" + profundidad + "].bmp";

            //string ruta = @"C:\Users\estudiante\source\repos\PF_ArquitecturaHardware\Images\ImagesInver\imgReverse_T[" + tamanio + "]P[" + profundidad + "].bmp";
            a.Save(rutaImagen);
        }

        /*
         * VERSIÓN 5 DEL ALGORITMO
         */
        static void version5(String src, int profundidad, int tamanio)
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

            for (int i = 0; i < a.Height - 2; i += 2)
            {
                for (int j = 0; j < a.Width - 2; j += 2)
                {
                    color = a.GetPixel(i, j);
                    color = Color.FromArgb(255, (255 - color.R), (255 - color.G), (255 - color.B));
                    a.SetPixel(i, j, color);

                    color = a.GetPixel(i, j + 1);
                    color = Color.FromArgb(255, (255 - color.R), (255 - color.G), (255 - color.B));
                    a.SetPixel(i, j + 1, color);

                    color = a.GetPixel(i + 1, j);
                    color = Color.FromArgb(255, (255 - color.R), (255 - color.G), (255 - color.B));
                    a.SetPixel(i + 1, j, color);

                    color = a.GetPixel(i + 1, j + 1);
                    color = Color.FromArgb(255, (255 - color.R), (255 - color.G), (255 - color.B));
                    a.SetPixel(i + 1, j + 1, color);

                }
            }

            /*
            Detenemos el reloj
            */
            stopWatch.Stop();

            /*
            Recolectamos la información
            */
            tiempo = (long)(stopWatch.Elapsed.TotalMilliseconds * 1000000);
            Console.WriteLine("Resultado " + r + ": " + tiempo);

            /*
            Guardamos la imagen en la carpeta correspondiente
            */
            String ruta = Path.GetDirectoryName(Process.GetCurrentProcess().MainModule.FileName);
            String rutaImagen = ruta + @"\Images\ImagesInver\imgReverse_T[" + tamanio + "]P[" + profundidad + "].bmp";

            //string ruta = @"C:\Users\estudiante\source\repos\PF_ArquitecturaHardware\Images\ImagesInver\imgReverse_T[" + tamanio + "]P[" + profundidad + "].bmp";
            a.Save(rutaImagen);
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
             Pueden ser los siguientes valores: 400, 700, 1000, 1300, 1600, 1900, 2200, 2500
             */
            int tamanioImagen = 400;

            /*
             Variable que almacena la profundidad de la imagen que será utilizada. 
             En este caso es 24, porque es la profundidad de la imagen original
             Para nuestro experimiento no es necesaria la profundidad, sin embargo, más adelante puede ser un factor de estudio.
             */
            int profundidad = 24;

            /*
             Variable que almacena la ruta de la imagen que será utilizada.
             */
            String ruta = Path.GetDirectoryName(Process.GetCurrentProcess().MainModule.FileName);
            String rutaImagen = ruta + @"\Images\T[" + tamanioImagen + "]P[" + profundidad + "].bmp";

            //int i = 0;

            Console.WriteLine("VERSIÓN DEL ALGORITMO: " + versionAlgoritmo + "\nTAMAÑO IMAGEN: " + tamanioImagen + "px");
            while (r <= 3)
            {

                switch (versionAlgoritmo)
                {
                    case 1:
                        version1(rutaImagen, profundidad, tamanioImagen);
                        r++;
                        break;
                    case 2:
                        version2(rutaImagen, profundidad, tamanioImagen);
                        r++;
                        break;
                    case 3:
                        version3(rutaImagen, profundidad, tamanioImagen);
                        r++;
                        break;
                    case 4:
                        version4(rutaImagen, profundidad, tamanioImagen);
                        r++;
                        break;
                    case 5:
                        version5(rutaImagen, profundidad, tamanioImagen);
                        r++;
                        break;
                    default:
                        Console.WriteLine("El número de versión del algoritmo no es válido.");
                        r = 4;
                        break;

                }

            }










        }
    }
}
