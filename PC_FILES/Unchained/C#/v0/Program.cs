using System;
using System.Windows.Forms;
using System.Drawing;

//Most of the following code works and does produce the window
//Having to work on converting from the Java coud that works to C#

namespace unchained{
    public static class Program{
        public static void Main(String [] args){
            String gameStatement = "Building Game Engine";
            Console.WriteLine(gameStatement);
            Form window = new Form();
            Label text = new Label();
            window.Width = 800;
            window.Height = 600;
            window.Name = "Unchained v0.1";

            text.Text = "Test";
            //The location is (Width,hieght)
            text.Location = new Point(100,300);

            window.Controls.Add(text);
            Application.Run(window);
        }
    }
}