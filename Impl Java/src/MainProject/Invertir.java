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
public class Invertir {
	private BufferedImage foto;
	private int r,g,b;
	private Color color;
	
	public Invertir(){
	}
	     
	 /* Invierte los bytes de una imagen */
	public void algorithm1(BufferedImage f){
		this.foto = f;
		for(int i=0;i<foto.getWidth();i++){
			for(int j=0;j<foto.getHeight();j++){
				//se obtiene el color del pixel
				color = new Color(foto.getRGB(i, j));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				foto.setRGB(i, j, new Color(255-r,255-g,255-b).getRGB());                                                                    
			}
		}
		String imgPath="src/images/invertidaAlgoritmo1.png";
		savePNG(this.foto, imgPath);
	}
	    
	public void algorithm2(BufferedImage f){
		this.foto = f;
		for(int i=0;i<foto.getWidth();i++){
			for(int j=0;j<foto.getHeight();j++){
				color = new Color(foto.getRGB(i, j));
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				foto.setRGB(i, j, new Color(255-r,g,b).getRGB());                                                                    
			}
		}
		for(int i=0;i<foto.getWidth();i++){
			for(int j=0;j<foto.getHeight();j++){
				color = new Color(foto.getRGB(i, j));
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				foto.setRGB(i, j, new Color(r,255-g,b).getRGB());                                                                    
			}
		}
		for(int i=0;i<foto.getWidth();i++){
			for(int j=0;j<foto.getHeight();j++){
				color = new Color(foto.getRGB(i, j));
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				foto.setRGB(i, j, new Color(r,g,255-b).getRGB());                                                                    
			}
		}
		String imgPath="src/images/invertidaAlgoritmo2.png";
		savePNG(this.foto, imgPath);
	}
	  
	public void algorithm3(BufferedImage f){
		this.foto = f;
		for(int j=0;j<foto.getHeight();j++){
			for(int i=0;i<foto.getWidth();i++){
				//se obtiene el color del pixel
				color = new Color(foto.getRGB(i, j));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				foto.setRGB(i, j, new Color(255-r,255-g,255-b).getRGB());                                                                    
			}
		}
		String imgPath="src/images/invertidaAlgoritmo3.png";
		savePNG(this.foto, imgPath);
	}
	
	public void algorithm4(BufferedImage f){
		this.foto = f;
		for(int i=0;i<foto.getWidth();i++){
			for(int j=0;j<foto.getHeight();j++){
				color = new Color(foto.getRGB(i, j));
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				foto.setRGB(i, j, new Color(255-r,g,b).getRGB());                                                                    
			}
		}
		for(int i=foto.getWidth();i<=0;i--){
			for(int j=foto.getHeight();j<=0;j--){
				//se obtiene el color del pixel
				color = new Color(foto.getRGB(i, j));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				foto.setRGB(i, j, new Color(r,255-g,255-b).getRGB());                                                                    
			}
		}
		for(int i=0;i<foto.getWidth()-1;i+=2){
			for(int j=0;j<foto.getHeight()-1;j+=2){
				//se obtiene el color del pixel
				color = new Color(foto.getRGB(i, j));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				foto.setRGB(i, j, new Color(255-r,255-g,255-b).getRGB());                                                                    
				
				color = new Color(foto.getRGB(i, j+1));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				foto.setRGB(i, j+1, new Color(255-r,255-g,255-b).getRGB());
				
				color = new Color(foto.getRGB(i+1, j));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				foto.setRGB(i+1, j, new Color(255-r,255-g,255-b).getRGB());
				
				color = new Color(foto.getRGB(i+1, j+1));
				//se extraen los valores RGB
				r = color.getRed();
				g = color.getGreen();
				b = color.getBlue();
				//se coloca en la nueva imagen con los valores invertidos
				foto.setRGB(i+1, j+1, new Color(255-r,255-g,255-b).getRGB());
			}
		}
		String imgPath="src/images/invertidaAlgoritmo4.png";
		savePNG(this.foto, imgPath);
	}
	
	public BufferedImage getFoto(){
		return this.foto;
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
	    		Invertir inv=new Invertir();
	    		BufferedImage bf=ImageIO.read(new File("src/images/doc.png"));
			} catch (Exception e) {
			}
	    	
	    	try {
	    		Invertir inv=new Invertir();
				BufferedImage bf=ImageIO.read(new File("src/images/doc.png"));
				BufferedImage bf2=ImageIO.read(new File("src/images/doc.png"));
				BufferedImage bf3=ImageIO.read(new File("src/images/doc.png"));
				BufferedImage bf4=ImageIO.read(new File("src/images/doc.png"));
				long startTime = System.currentTimeMillis();
				inv.algorithm1(bf);
				long endTime = System.currentTimeMillis();
				System.out.printf("Algoritmo 1: %o Milisegunsos\n", endTime - startTime);
				
				startTime = System.currentTimeMillis();
				inv.algorithm2(bf2);
				endTime = System.currentTimeMillis();
				System.out.printf("Algoritmo 2: %o Milisegunsos\n", endTime - startTime);
				
				startTime = System.currentTimeMillis();
				inv.algorithm3(bf3);
				endTime = System.currentTimeMillis();
				System.out.printf("Algoritmo 3: %o Milisegunsos\n", endTime - startTime);
				
				startTime = System.currentTimeMillis();
				inv.algorithm4(bf4);
				endTime = System.currentTimeMillis();
				System.out.printf("Algoritmo 4: %o Milisegunsos\n", endTime - startTime);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	    
}
