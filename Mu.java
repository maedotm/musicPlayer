
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


/**
 *
 * @author maedot
 */
public class Mu {
       
    String path;
    Player player;
    File [] myfile;
     
     
     Playlist playlist=new Playlist();
    public  void select(){
     
      
       JFileChooser chooser=new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        int value= chooser.showOpenDialog(null);
        if(value==JFileChooser.APPROVE_OPTION){
           myfile=chooser.getSelectedFiles();
            for(File file:myfile){
                path=file.getAbsolutePath();
              playlist.addmusic(path);
                
               
            }
        }
    }
        
       
    public void play(){
        
        try {
           FileInputStream FIS = new FileInputStream(path);
            BufferedInputStream BIS=new BufferedInputStream(FIS);
           
            player=new Player(BIS);
       
            
        } catch (FileNotFoundException ex) {
            
        } 
        catch(JavaLayerException | IOException ex){
            
        }
             new Thread(){
    @Override
    public void run(){
          
                try {
                    
                   
                     
                     }
                     
                } catch (JavaLayerException ex) {
                 
                }      
                   }}.start();
    }
             public void stop(){
                 player.close();
                 
             }
}

   
        

      
  


    
    
   
    
    
