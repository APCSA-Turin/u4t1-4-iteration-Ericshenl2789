package U5T1_Anatomy_of_a_class;

public class Prism {
    private int len;
    private int wid; 
    private int height;

    public Prism(int length, int width, int height){
        len = length;
        wid = width;
        this.height = height;
    }

    public void setLength(int newLen){
        len = newLen;
    }

    public void setWidth(int newWid){
        wid = newWid;
    }

    public void setHeight(int newHeight){
        height = newHeight;
    }

    public String dimensions(){
        return "Lenght = " + len + ",\nWidth = " + wid + ",\nHeight = " + height;
    }

    public int volume(){
        return wid * len * height;
    }

    public int surfaceArea(){
        return 2 * (wid * len + height * len + height * wid); //from google, equation for surface area
    }
}
