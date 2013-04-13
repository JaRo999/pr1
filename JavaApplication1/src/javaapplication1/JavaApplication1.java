/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JaRo
 */
public class JavaApplication1 
{ 
    private FileReader  fileReader;
    private String      fileData;    
    
    public void readFileData() 
    {
       BufferedReader bf = new BufferedReader(fileReader);
       
       try 
       {
            //fileReader.read(); // reads the content to the array
            fileData = bf.readLine();
       } 
       catch (IOException ex) 
       {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
       }
    }    

    public JavaApplication1() 
    {
    }

    
    public void loadFile(String name) throws FileNotFoundException 
    {
        fileReader = new FileReader(name);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JavaApplication1 app = new JavaApplication1();
            
        try
        {
            app.loadFile("..\\readme.md");
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        app.readFileData();
        System.out.printf(app.getFileData());
    }
    
    /**
     * Get the value of fileData
     *
     * @return the value of fileData
     */
    public String getFileData()
    {
        return fileData;
    }

}
