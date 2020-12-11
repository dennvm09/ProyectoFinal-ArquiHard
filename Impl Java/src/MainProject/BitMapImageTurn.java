package MainProject;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public class BitMapImageTurn {
	private int r,g,b;
	private Color color;
	
	public BitMapImageTurn(){
	}
	     
	 /* Invierte los bytes de una imagen */
	public void algorithm1(String path) throws IOException{
		BufferedImage f=ImageIO.read(new File(path));
		for(int i=0;i<f.getWidth();i++){
			for(int j=0;j<f.getHeight();j++){
				//se obtiene el color del pixel
				color = new Color(f.getRGB(i, j));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				f.setRGB(i, j, new Color(255-r,255-g,255-b).getRGB());                                                                    
			}
		}
		String imgPath="src/algorithm 1/"+f.getWidth()+" x "+f.getHeight()+".png";
		savePNG(f, imgPath);
	}
	    
	public void algorithm2(String path) throws IOException{
		BufferedImage f=ImageIO.read(new File(path));
		for(int i=0;i<f.getWidth();i++){
			for(int j=0;j<f.getHeight();j++){
				color = new Color(f.getRGB(i, j));
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				f.setRGB(i, j, new Color(255-r,g,b).getRGB());                                                                    
			}
		}
		for(int i=0;i<f.getWidth();i++){
			for(int j=0;j<f.getHeight();j++){
				color = new Color(f.getRGB(i, j));
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				f.setRGB(i, j, new Color(r,255-g,b).getRGB());                                                                    
			}
		}
		for(int i=0;i<f.getWidth();i++){
			for(int j=0;j<f.getHeight();j++){
				color = new Color(f.getRGB(i, j));
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				f.setRGB(i, j, new Color(r,g,255-b).getRGB());                                                                    
			}
		}
		String imgPath="src/algorithm 2/"+f.getWidth()+" x "+f.getHeight()+".png";
		savePNG(f, imgPath);
	}
	  
	public void algorithm3(String path) throws IOException{
		BufferedImage f=ImageIO.read(new File(path));
		for(int j=0;j<f.getHeight();j++){
			for(int i=0;i<f.getWidth();i++){
				//se obtiene el color del pixel
				color = new Color(f.getRGB(i, j));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				f.setRGB(i, j, new Color(255-r,255-g,255-b).getRGB());                                                                    
			}
		}
		String imgPath="src/algorithm 3/"+f.getWidth()+" x "+f.getHeight()+".png";
		savePNG(f, imgPath);
	}
	
	public void algorithm4(String path) throws IOException{
		BufferedImage f=ImageIO.read(new File(path));
		for(int i=0;i<f.getWidth();i++){
			for(int j=0;j<f.getHeight();j++){
				color = new Color(f.getRGB(i, j));
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				f.setRGB(i, j, new Color(255-r,g,b).getRGB());                                                                    
			}
		}
		for(int i=f.getWidth();i<=0;i--){
			for(int j=f.getHeight();j<=0;j--){
				//se obtiene el color del pixel
				color = new Color(f.getRGB(i, j));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				f.setRGB(i, j, new Color(r,255-g,255-b).getRGB());                                                                    
			}
		}
		String imgPath="src/algorithm 4/"+f.getWidth()+" x "+f.getHeight()+".png";
		savePNG(f, imgPath);
	}  

	public void algorithm5(String path) throws IOException{
		BufferedImage f=ImageIO.read(new File(path));
		for(int i=0;i<f.getWidth()-1;i+=2){
			for(int j=0;j<f.getHeight()-1;j+=2){
				//se obtiene el color del pixel
				color = new Color(f.getRGB(i, j));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				f.setRGB(i, j, new Color(255-r,255-g,255-b).getRGB());                                                                    
				
				color = new Color(f.getRGB(i, j+1));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				f.setRGB(i, j+1, new Color(255-r,255-g,255-b).getRGB());
				
				color = new Color(f.getRGB(i+1, j));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				f.setRGB(i+1, j, new Color(255-r,255-g,255-b).getRGB());
				
				color = new Color(f.getRGB(i+1, j+1));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				f.setRGB(i+1, j+1, new Color(255-r,255-g,255-b).getRGB());
			}
		}
		String imgPath="src/algorithm 5/"+f.getWidth()+" x "+f.getHeight()+".png";
		savePNG(f, imgPath);

	}
	    
	private static void savePNG(final BufferedImage bi, final String path){
		try {
	            RenderedImage rendImage = bi;
//	            ImageIO.write(rendImage, "bmp", new File(path));
//	            ImageIO.write(rendImage, "jpg", new File(path));
	            ImageIO.write(rendImage, "PNG", new File(path));
	        } catch ( IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public static void main(String[] args) {
	    	try {
	    		BitMapImageTurn inv=new BitMapImageTurn();
	    		String[] paths= {"src/images/400x300.jpg", "src/images/700x525.jpg", "src/images/1000x750.jpg",
	    				"src/images/1300x975.jpg", "src/images/1600x1200.jpg", "src/images/1900x1425.jpg", 
	    				"src/images/2200x1650.jpg",	"src/images/2500x1875.jpg"};
	    		for (int i = 0; i < paths.length; i++) {
	    			System.out.printf("\nTIEMPOS POR ALGORITMO PARA LA IMAGEN DE TAMAÑO %s \n",paths[i].substring(11, paths[i].length()-4));
	    			long startTime = System.currentTimeMillis();
					inv.algorithm1(paths[i]);
					long endTime = System.currentTimeMillis();
					System.out.printf("Algoritmo 1: %o Milisegunsos\n", endTime - startTime);
					
					startTime = System.currentTimeMillis();
					inv.algorithm2(paths[i]);
					endTime = System.currentTimeMillis();
					System.out.printf("Algoritmo 2: %o Milisegunsos\n", endTime - startTime);
					
					startTime = System.currentTimeMillis();
					inv.algorithm3(paths[i]);
					endTime = System.currentTimeMillis();
					System.out.printf("Algoritmo 3: %o Milisegunsos\n", endTime - startTime);
					
					startTime = System.currentTimeMillis();
					inv.algorithm4(paths[i]);
					endTime = System.currentTimeMillis();
					System.out.printf("Algoritmo 4: %o Milisegunsos\n", endTime - startTime);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	    
}
