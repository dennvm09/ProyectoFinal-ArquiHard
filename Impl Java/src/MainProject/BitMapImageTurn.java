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
	    		
	    		String[] paths= {"src/imgs/T[400]P[24].bmp","src/imgs/T[700]P[24].bmp","src/imgs/T[1000]P[24].bmp",
	    				"src/imgs/T[1300]P[24].bmp","src/imgs/T[1600]P[24].bmp","src/imgs/T[1900]P[24].bmp",
	    				"src/imgs/T[2200]P[24].bmp","src/imgs/T[2500]P[24].bmp"};
	    		for (int i = 0; i < paths.length; i++) {
	    			String imageT="";
	    			if(paths[i].substring(9, paths[i].length()-4).equals("T[400]P[24]")) {
	    				imageT="T1";
	    			}else if(paths[i].substring(9, paths[i].length()-4).equals("T[700]P[24]")) {
	    				imageT="T2";
	    			} else if(paths[i].substring(9, paths[i].length()-4).equals("T[1000]P[24]")) {
	    				imageT="T3";
	    			} else if(paths[i].substring(9, paths[i].length()-4).equals("T[1300]P[24]")) {
	    				imageT="T4";
	    			} else if(paths[i].substring(9, paths[i].length()-4).equals("T[1600]P[24]")) {
	    				imageT="T5";
	    			} else if(paths[i].substring(9, paths[i].length()-4).equals("T[1900]P[24]")) {
	    				imageT="T6";
	    			} else if(paths[i].substring(9, paths[i].length()-4).equals("T[2200]P[24]")) {
	    				imageT="T7";
	    			} else if(paths[i].substring(9, paths[i].length()-4).equals("T[2500]P[24]")) {
	    				imageT="T8";
	    			}
	    			int c=3;
	    			while(c>0){
	    				long startTime = System.currentTimeMillis();
						inv.algorithm1(paths[i]);
						long endTime = System.currentTimeMillis();
						System.out.printf("1;Java;%s;1;%o\n", imageT, endTime - startTime);
						
						startTime = System.currentTimeMillis();
						inv.algorithm2(paths[i]);
						endTime = System.currentTimeMillis();
						System.out.printf("1;Java;%s;2;%o\n", imageT, endTime - startTime);
						
						startTime = System.currentTimeMillis();
						inv.algorithm3(paths[i]);
						endTime = System.currentTimeMillis();
						System.out.printf("1;Java;%s;3;%o\n", imageT, endTime - startTime);
						
						startTime = System.currentTimeMillis();
						inv.algorithm4(paths[i]);
						endTime = System.currentTimeMillis();
						System.out.printf("1;Java;%s;4;%o\n", imageT, endTime - startTime);
						
						startTime = System.currentTimeMillis();
						inv.algorithm5(paths[i]);
						endTime = System.currentTimeMillis();
						System.out.printf("1;Java;%s;5;%o\n", imageT, endTime - startTime);
						
						c--;
	    			}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	    
}
