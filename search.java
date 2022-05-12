package FileScrappers;
import java.io.*;
import java.util.*;

public class search {
    
    public static String tophir,scnddir;
    static List<String> video=new ArrayList<>();
    static List<String> audio=new ArrayList<>();
    static List<String> document=new ArrayList<>();
    static List<String> image=new ArrayList<>();
    static List<String> others=new ArrayList<>();
    
    public static void main(String args[])throws IOException {
        
       FileHandlerGUI fhg=new FileHandlerGUI();
        List<String> videoexts=new ArrayList<>(List.of("avchd","avi","flv","m4v","m4p","mp4","mkv","hevc","mov","mp2",
                                                             "mpe","mpeg","mpg","mpv","ogv","qt","swf","webm","wmv"));
    
    
        List<String> audioexts=new ArrayList<>(List.of("aac","acc","aiff","alac","bwf","flac","mp3","ogg","pcm","wav",
                                                           "wma"));
    
        List<String> documentexts=new ArrayList<>(List.of("doc","docm","docx","dot","htm","html","odt","pdf","pps","ppsx",
                                                              "ppt","pptx","sldx","xlm","xls","xlsx","xps","rtf"));
   
        List<String> imageexts=new ArrayList<>(List.of("arw","az","bmp","cr2","eds","eps","gif","heif","indd","jpeg",
                                                           "jpg","png","psd","raw","svg","tiff","webp"));
        
        /*
            List<String> videoexts=new ArrayList<>(List.of(".*\\.avchd",".*\\.avi",".*\\.flv",".*\\.m4v",".*\\.m4p",".*\\.mp4",".*\\.mkv",".*\\.hevc",".*\\.mov",".*\\.mp2",
                                                  ".*\\.mpe",".*\\.mpeg",".*\\.mpg",".*\\.mpv",".*\\.ogv",".*\\.qt",".*\\.swf",".*\\.webm",".*\\.wmv"));
    
    
            List<String> audioexts=new ArrayList<>(List.of(".*\\.aac",".*\\.acc",".*\\.aiff",".*\\.alac",".*\\.bwf",".*\\.flac",".*\\.mp3",".*\\.ogg",".*\\.pcm",".*\\.wav",
                                                  ".*\\.wma",".*\\.wmv"));
    
            List<String> documentexts=new ArrayList<>(List.of(".*\\.doc",".*\\.docm",".*\\.docx",".*\\.dot",".*\\.htm",".*\\.html",".*\\.odt",".*\\.pdf",".*\\.pps",".*\\.ppsx",
                                                  ".*\\.ppt",".*\\.pptx",".*\\.sldx",".*\\.xlm",".*\\.xls",".*\\.xlsx",".*\\.xps",".*\\.rtf"));
   
            List<String> imageexts=new ArrayList<>(List.of(".*\\.arw",".*\\.az",".*\\.bmp",".*\\.cr2",".*\\.eds",".*\\.eps",".*\\.gif",".*\\.heif",".*\\.indd",".*\\.jpeg",
                                                  ".*\\.jpg",".*\\.png",".*\\.psd",".*\\.raw",".*\\.svg",".*\\.tiff",".*\\.webpg"));       
        */
        
        
   
         /*
            Scanner sc=new Scanner(System.in);
            String k="";
   
            //System.out.println("This Program will automatically create a TOPFOLDER directory in \"D:\" drive and scan selected directory and sub directories" );
    
            String drive="D";
   
            System.out.println("Enter the Drive to be scanned in selected drive or it will search by default in \"D:\" drive");
            k=sc.nextLine();if(!k.isEmpty()){drive=k;}
    
            String scnddir=drive+":\\"+"test";
   
            System.out.println("Enter the name of folder to be scanned or it will scan \"test\" by default");
            k=sc.nextLine();if(!k.isEmpty()){scnddir=drive+":\\"+k;}
    
            String tophir="TOPFOLDER";
            System.out.println("Enter the name of TOP level Folder if you want to change the name to desired name or by default it will remain \"TOPFOLDER\"");
            k=sc.nextLine();if(!k.isEmpty()){tophir=k;}
    
            String drive1="D";
            System.out.println("Enter the drive you want to create TOP level folder otherwise it will be set to \"D:\" drive by default");
            k=sc.nextLine();if(!k.isEmpty()){drive1=k;}
    
            File parent=new File(drive1+":\\"+tophir);
            File parent=new File(tophir);
            if(parent.exists())
            System.out.println("TOPFOLDER already exists");
            else{parent.mkdirs();System.out.println("Folder Sucessfully created");}
        
            */
   
    //tophir -FOLDER TO BE CREATED(absolute path/string)
    //scnddir-FOLDER TO BE SCANNED(absolute path/string)
    
    File parent=new File(tophir);
    File folder =new File(scnddir);
    
    if(folder.exists())
        {
            
          
          
    
            
        search1(videoexts,audioexts,documentexts,imageexts,folder,video,audio,document,image,others);
            
        System.out.println("Selected directory sucessfully scanned : "+scnddir);
            
            
            
           /* 
            for(String s:video){System.out.println(s);}
            for(String s:audio){System.out.println(s);}
            for(String s:document){System.out.println(s);}
            for(String s:image){System.out.println(s);}
            
           
            video.forEach((s) -> {
                System.out.println("Scanned : "+s);});
            audio.forEach((s) -> {
                System.out.println("Scanned : "+s);});
            document.forEach((s) -> {
                System.out.println("Scanned : "+s);});
            image.forEach((s) -> {
                System.out.println("Scanned : "+s);});
            
            System.out.println(parent.getAbsolutePath());
            //File fp=new File(drive1+":\\"+tophir+"\\Audios");*/
            
        }
    else
        System.out.println("Directory entered by user to be scanned is not found : "+scnddir);
 
    
    
    } 

        
public static void search1(List<String> videoexts,List<String> audioexts,List<String> documentexts,List<String> imageexts,
                           final File folder,
                           List<String> video,List<String> audio,List<String> document,List<String> image,List<String> others)
{
for(final File f:folder.listFiles())
      {
         if(f.isDirectory())
            search1(videoexts,audioexts,documentexts,imageexts,f,video,audio,document,image,others);

    if(f.isFile())
        {
            System.out.println("Scanning : "+f.getAbsolutePath());
            /*if(f.getName().matches(videoexts.get(0)||f.getName().matches(videoexts.get(1)||f.getName().matches(videoexts.get(2)||f.getName().matches(videoexts.get(3)||f.getName().matches(videoexts.get(4)||
                    f.getName().matches(videoexts.get(5)||f.getName().matches(videoexts.get(6)||f.getName().matches(videoexts.get(7)||f.getName().matches(videoexts.get(8)||f.getName().matches(videoexts.get(9)||
                        f.getName().matches(videoexts.get(10)||f.getName().matches(videoexts.get(11)||f.getName().matches(videoexts.get(12)||f.getName().matches(videoexts.get(13)||f.getName().matches(videoexts.get(14)||
                        f.getName().matches(videoexts.get(15)||f.getName().matches(videoexts.get(16)||f.getName().matches(videoexts.get(17)||f.getName().matches(videoexts.get(18)||f.getName().matches(videoexts.get(19)));*/
        if(videoexts.contains(f.getName().substring(f.getName().lastIndexOf(".")+1)))
            video.add(f.getAbsolutePath());
        
             /*if(f.getName().matches(audioexts.get(0)||f.getName().matches(audioexts.get(1)||f.getName().matches(audioexts.get(2)||f.getName().matches(audioexts.get(3)||f.getName().matches(audioexts.get(4)||
                 f.getName().matches(audioexts.get(5)||f.getName().matches(audioexts.get(6)||f.getName().matches(audioexts.get(7)||f.getName().matches(audioexts.get(8)||f.getName().matches(audioexts.get(9)||
                    f.getName().matches(audioexts.get(10)||f.getName().matches(audioexts.get(11)));*/
        else if(audioexts.contains(f.getName().substring(f.getName().lastIndexOf(".")+1)))
            audio.add(f.getAbsolutePath());
        
        /*if(f.getName().matches(documentexts.get(0)||f.getName().matches(documentexts.get(1)||f.getName().matches(documentexts.get(2)||f.getName().matches(documentexts.get(3)||f.getName().matches(documentexts.get(4)||
                f.getName().matches(documentexts.get(5)||f.getName().matches(documentexts.get(6)||f.getName().matches(documentexts.get(7)||f.getName().matches(documentexts.get(8)||f.getName().matches(documentexts.get(9)||
                        f.getName().matches(documentexts.get(10)||f.getName().matches(documentexts.get(11)||f.getName().matches(documentexts.get(12)||f.getName().matches(documentexts.get(13)||
                                f.getName().matches(documentexts.get(14)||f.getName().matches(documentexts.get(15)||f.getName().matches(documentexts.get(16)||f.getName().matches(documentexts.get(17)));*/
        
        else if(documentexts.contains(f.getName().substring(f.getName().lastIndexOf(".")+1)))
            document.add(f.getAbsolutePath());
        
        /*if(f.getName().matches(imageexts.get(0)||f.getName().matches(imageexts.get(1)||f.getName().matches(imageexts.get(2)||f.getName().matches(imageexts.get(3)||f.getName().matches(imageexts.get(4)||
                f.getName().matches(imageexts.get(5)||f.getName().matches(imageexts.get(6)||f.getName().matches(imageexts.get(7)||f.getName().matches(imageexts.get(8)||f.getName().matches(imageexts.get(9)||
                        f.getName().matches(imageexts.get(10)||f.getName().matches(imageexts.get(11)||f.getName().matches(imageexts.get(12)||f.getName().matches(imageexts.get(13)||f.getName().matches(imageexts.get(14)||
                                f.getName().matches(imageexts.get(15)||f.getName().matches(imageexts.get(16)));*/
        
        else if(imageexts.contains(f.getName().substring(f.getName().lastIndexOf(".")+1)))
            image.add(f.getAbsolutePath());
        
        else 
             others.add(f.getAbsolutePath());
        
        
        }   
      }
}


public static void fullArrCopy(List<String> array,File dest,int mve)throws IOException
{
    for(String s:array){
    File source=new File(s);
    File tempDIR=new File(dest+"/"+source.getName());
    if(!tempDIR.exists())
        tempDIR.delete();
    InputStream is = null;
    OutputStream os = null;
    try {
        is = new FileInputStream(source);
        os = new FileOutputStream(dest+"/"+source.getName());
        byte[] buffer = new byte[4096];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
    } finally {
        is.close();
        os.close();
    
    if(mve==1)
    source.delete();
}
    FileHandlerGUI fhg=new FileHandlerGUI();
    fhg.updateprogressbar();
    }
}

public static void makeFolLog(File folder)
{
    List<String> files=new ArrayList<>();
    for(final File f:folder.listFiles()){
        if(f.isDirectory())
            makeFolLog(f);
        else{
            files.add(f.getAbsolutePath());
        }
        
    }
    Collections.sort(files);
}

public static void copyAudioFiles(List<String> audio,int mve) throws IOException
{
    File newAudioFol=new File(tophir+"\\Audios");
    newAudioFol.mkdirs();
             
    fullArrCopy(audio,newAudioFol,mve);
    
    makeFolLog(newAudioFol);
   
}

public static void copyVideoFiles(List<String> video,int mve) throws IOException
{
    File newVideoFol=new File(tophir+"\\Videos");
    newVideoFol.mkdirs();
             
    fullArrCopy(video,newVideoFol,mve);
             
    makeFolLog(newVideoFol);
}

public static void copyImageFiles(List<String> image,int mve) throws IOException
{
    File newImageFol=new File(tophir+"\\Images");
    newImageFol.mkdirs();
             
    fullArrCopy(image,newImageFol,mve);
             
    makeFolLog(newImageFol);
}

public static void copyDocumentsFiles(List<String> document,int  mve) throws IOException
{
    File newDocumentFol=new File(tophir+"\\Documents");
    newDocumentFol.mkdirs();
             
    fullArrCopy(document,newDocumentFol,mve);
             
    makeFolLog(newDocumentFol);
   
}

public static void copyOtherFiles(List<String> others,int mve) throws IOException
{
    File newOthersFol=new File(tophir+"\\Others");
    newOthersFol.mkdirs();
             
    fullArrCopy(others,newOthersFol,mve);
             
    makeFolLog(newOthersFol);
   
}

}